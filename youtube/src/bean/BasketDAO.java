package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//CRUD�߽����� ����� ����
//�����Ϳ� ���õ� �۾�(Data Access Object: DAO)
public class BasketDAO {
	DBConnectionMgr dbcp;
	Connection con;

	public BasketDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
		System.out.println("2. db���� ����.!!");
	}

	public List<BasketVO> all() throws Exception {
		con = dbcp.getConnection();
		// 3. sql���� �����.
		String sql = "select * from basket";
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		// ������ �ִ� �����̳� ������ �ϰ� ��.!
		// <>�ȿ��� �����̳ʿ� ������ ������ ����!
		List<BasketVO> list = new ArrayList<BasketVO>();
		while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
			BasketVO bag = new BasketVO();// ���游��,
			// ���濡 �ֱ�
			// Object(vo) Relational DB(row) Mapping(ORM)
			bag.setTitle(rs.getString("title"));
			bag.setPrice(rs.getInt("price"));
			bag.setContent(rs.getString("Content"));
			bag.setImg(rs.getString("img"));
			bag.setProductid(rs.getString("productid"));
			bag.setUserid(rs.getString("userid"));
			// �����̳ʿ� �ֱ�
			list.add(bag);
		}
		dbcp.freeConnection(con, ps, rs);
		return list;
		// bag�� ������ ����, �ּҸ� ����!
	}

	public boolean create(BasketVO vo) throws Exception {
		con = dbcp.getConnection();
		System.out.println("==>" + vo);
		// db���� index�� 1���� ����
		String sql = "insert into basket(title,content,price,img,productid,userid) values (?,?, ?, ?,?,?)";

		// ��ǻ�ʹ� �� ������ �׳� String���� �ν�
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getContent());
		ps.setInt(3, vo.getPrice());
		ps.setString(4, vo.getImg());
		ps.setString(5, vo.getProductid());
		ps.setString(6, vo.getUserid());
		
		System.out.println("3. SQL�� ���� ����!!");

		int row = ps.executeUpdate();
		System.out.println("4. SQL���� mySQL�� ��Ʈ��ũ ���� ����!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		ps.close();
		con.close();

		return result;
	}
	
	public void delete() throws Exception {
		con = dbcp.getConnection();
		// 3. sql���� �����.
		String sql = "delete from basket where title is null";
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		int rs = ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");
		// ������ �ִ� �����̳� ������ �ϰ� ��.!
		// <>�ȿ��� �����̳ʿ� ������ ������ ����!
	}
	

	public void deleteall() throws Exception {
		con = dbcp.getConnection();
		// 3. sql���� �����.
		String sql = "delete from basket";
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		int rs = ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");
		// ������ �ִ� �����̳� ������ �ϰ� ��.!
		// <>�ȿ��� �����̳ʿ� ������ ������ ����!
	}
	
}