package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD�߽����� ����� ����
//�����Ϳ� ���õ� �۾�(Data Access Object: DAO)
public class BarlyDAO {
	DBConnectionMgr dbcp;
	Connection con;

	public BarlyDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
		System.out.println("2. db���� ����.!!");
	}

	public List<BarlyVO2> all() throws Exception {
		con = dbcp.getConnection();
		// 3. sql���� �����.
		String sql = "select * from category";
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		// ������ �ִ� �����̳� ������ �ϰ� ��.!
		// <>�ȿ��� �����̳ʿ� ������ ������ ����!
		List<BarlyVO2> list = new ArrayList<BarlyVO2>();
		while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
			BarlyVO2 bag = new BarlyVO2();// ���游��,
			// ���濡 �ֱ�
			// Object(vo) Relational DB(row) Mapping(ORM)
			bag.setTitle(rs.getString("title"));
			bag.setPrice(rs.getInt("price"));
			bag.setContent(rs.getString("Content"));
			bag.setImg(rs.getString("img"));
			bag.setProductid(rs.getString(1));
			// �����̳ʿ� �ֱ�
			list.add(bag);
		}
		
		dbcp.freeConnection(con, ps, rs);
		return list;
		// bag�� ������ ����, �ּҸ� ����!
	}

	public List<BarlyVO2> all2(String cat) throws Exception {
		con = dbcp.getConnection();
		// 3. sql���� �����.
		String sql = "select * from category where cat = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, cat);
		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		// ������ �ִ� �����̳� ������ �ϰ� ��.!
		// <>�ȿ��� �����̳ʿ� ������ ������ ����!
		List<BarlyVO2> list = new ArrayList<BarlyVO2>();
		while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
			BarlyVO2 bag = new BarlyVO2();// ���游��,
			// ���濡 �ֱ�
			// Object(vo) Relational DB(row) Mapping(ORM)
			bag.setTitle(rs.getString("title"));
			bag.setPrice(rs.getInt("price"));
			bag.setContent(rs.getString("Content"));
			bag.setImg(rs.getString("img"));
			bag.setProductid(rs.getString(1));

			// �����̳ʿ� �ֱ�
			list.add(bag);
		}
		dbcp.freeConnection(con);
		return list;
		// bag�� ������ ����, �ּҸ� ����!
	}
	
	
	

}