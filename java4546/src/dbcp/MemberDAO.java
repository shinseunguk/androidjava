package dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.MemberVO;

//CRUD�߽����� ����� ����
//�����Ϳ� ���õ� �۾�(Data Access Object: DAO)
public class MemberDAO {
	
	Connection con;
	DBConnectionMgr dbcp;
	public MemberDAO() throws Exception{
				dbcp = DBConnectionMgr.getInstance();
				System.out.println("2. db���� ����.!!");
	}
	public List<MemberVO2> all(String tel) throws Exception {
		
	      // 3. sql���� �����.
	      String sql = "select * from member where tel = ?";
	      
	      
	      PreparedStatement ps = con.prepareStatement(sql);
	      
	      ps.setString(1, tel);
	      // 4. sql���� ����
	      // select�� ����� �˻������ ��� ���̺�(�׸�+����)
	      // ���뿡�� ���� ���� �ְ�, ���� ���� ����.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. SQL�� ���� ����.!!");
	      // ������ �ִ� �����̳� ������ �ϰ� ��.!
	      // <>�ȿ��� �����̳ʿ� ������ ������ ����!
	     List<MemberVO2> list = new ArrayList<MemberVO2>();
	      while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
	         MemberVO2 bag = new MemberVO2();// ���游��,
				//���濡 �ֱ�
	         	//Object(vo) Relational DB(row) Mapping(ORM)
				bag.setId(rs.getString("id"));
				bag.setPw(rs.getString("pw"));
				bag.setName(rs.getString("name"));
				bag.setTel(rs.getString("tel"));
	         // �����̳ʿ� �ֱ�
	         list.add(bag);
	      }
	      return list;
	      // bag�� ������ ����, �ּҸ� ����!
	   }

	
}