package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD�߽����� ����� ����
//�����Ϳ� ���õ� �۾�(Data Access Object: DAO)
public class MemberDAO {
	String url = "jdbc:mysql://localhost:3366/shop";
	String user = "root";
	String password = "1234";
	Connection con;
	
	public MemberDAO() throws Exception{
				// 1. connector����
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. connector���� ����.!!");

				// 2. db����
//				String url = "�����ϴ¹��://ip:port/db��";
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. db���� ����.!!");
	}
	public boolean create(MemberVO vo) throws Exception {
		// 3. sql���� �����.(create)
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPw());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getTel());
		System.out.println("3. SQL���� ����.!!");

		// 4. sql���� ����
		int row = ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");
		boolean result = false;
		if(row == 1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;
	}

	public boolean create(String id, String pw, String name, String tel) throws Exception {
		// 3. sql���� �����.(create)
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL���� ����.!!");

		// 4. sql���� ����
		int row = ps.executeUpdate();
		boolean result = false;
		if (row == 1) {
			result = true;
		} 
		System.out.println("4. SQL�� ���� ����.!!");
		
		ps.close();
		con.close();
		return result;
	}

	public MemberVO one(String id) throws Exception {
		// 3. sql���� �����.(create)
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		MemberVO bag = new MemberVO();//���游��,
		if (rs.next() == true) { // ����� �ִ��� ������ üũ���ִ� �޼���
			// if(rs.next())�� ������.
			// if���� rs.next()�� true���� ����ǹǷ�!
			System.out.println("�˻������ �־��.");
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			//���濡 �ֱ�
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			System.out.println("�˻���� id: " + id2);
			System.out.println("�˻���� pw: " + pw);
			System.out.println("�˻���� name: " + name);
			System.out.println("�˻���� tel: " + tel);
		} else {
			System.out.println("�˻������ �����.");
		}
		
		rs.close();
		ps.close();
		con.close();
		
		return bag;
		// bag�� ������ ����, �ּҸ� ����!
	}
	
	   public List<MemberVO> all() throws Exception {

	      // 3. sql���� �����.
	      String sql = "select * from member";
	      PreparedStatement ps = con.prepareStatement(sql);
	      // 4. sql���� ����
	      // select�� ����� �˻������ ��� ���̺�(�׸�+����)
	      // ���뿡�� ���� ���� �ְ�, ���� ���� ����.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. SQL�� ���� ����.!!");
	      // ������ �ִ� �����̳� ������ �ϰ� ��.!
	      // <>�ȿ��� �����̳ʿ� ������ ������ ����!
	     List<MemberVO> list = new ArrayList<MemberVO>();
	      while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
	         MemberVO bag = new MemberVO();// ���游��,
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
	   
	   public List<MemberVO> all(String tel) throws Exception {

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
		     List<MemberVO> list = new ArrayList<MemberVO>();
		      while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
		         MemberVO bag = new MemberVO();// ���游��,
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
	   
	
	   public List<MemberVO> all2(String tel) throws Exception {

		      // 3. sql���� �����.
		      String sql = "select * from member where tel like '" + tel + "%'";
		      
		      
		      PreparedStatement ps = con.prepareStatement(sql);
		      
		      // 4. sql���� ����
		      // select�� ����� �˻������ ��� ���̺�(�׸�+����)
		      // ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		      ResultSet rs = ps.executeQuery();
		      System.out.println("4. SQL�� ���� ����.!!");
		      // ������ �ִ� �����̳� ������ �ϰ� ��.!
		      // <>�ȿ��� �����̳ʿ� ������ ������ ����!
		     List<MemberVO> list = new ArrayList<MemberVO>();
		      while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
		         MemberVO bag = new MemberVO();// ���游��,
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
	   
	
	// id�ߺ�üũ
	public int read(String id) throws Exception {
		// 3. sql���� �����.(create)
		String sql = "select * from member1 where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		int result = 0;// ����.
		if (rs.next() == true) { // ����� �ִ��� ������ üũ���ִ� �޼���
			// if(rs.next())�� ������.
			// if���� rs.next()�� true���� ����ǹǷ�!
			System.out.println("�˻������ �־��.");
			result = 1; // ����.
//			rs.getInt("no");//���� ������ �ö�
//			rs.getDouble("num");//�Ǽ� ������ �ö�
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			System.out.println("�˻���� id: " + id2);
			System.out.println("�˻���� pw: " + pw);
			System.out.println("�˻���� name: " + name);
			System.out.println("�˻���� tel: " + tel);
		} else {
			System.out.println("�˻������ �����.");
		}
		
		rs.close();
		ps.close();
		con.close();
		return result;
		// 0�� �Ѿ��, �˻���� ����.
		// 1�� �Ѿ��, �˻���� ����.
	}

	// id, pw�´��� �α��� ó��
	public boolean read(String id, String pw) throws Exception {

		// 3. sql���� �����.(create)
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);

		// 4. sql���� ����
		// select�� ����� �˻������ ��� ���̺�(�׸�+����)
		// ���뿡�� ���� ���� �ְ�, ���� ���� ����.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL�� ���� ����.!!");
		boolean result = false;// �α����� not!�� ����!
		if (rs.next() == true) { // ����� �ִ��� ������ üũ���ִ� �޼���
			System.out.println("�α��� ok.");
			result = true; // ����.
		} else {
			System.out.println("�α��� not.");
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		// false�� �α���not.
		// true�� �α���ok.
	}

	public boolean update(MemberVO vo) throws Exception {
	
		// 3. sql���� �����.(create)
		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPw());
		ps.setString(2, vo.getName());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getId());
		System.out.println("3. SQL���� ����.!!");

		// 4. sql���� ����
		int row = ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}

	public boolean delete(String id) throws Exception {
		// 3. sql���� �����.(create)
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL���� ����.!!");

		// 4. sql���� ����
		int row = ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}
}