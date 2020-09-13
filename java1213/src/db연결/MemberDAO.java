package db����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//CRUD�߽����� ����� ����
//�����Ϳ� ���õ� �۾�(Data Access Object : DAO)
public class MemberDAO {
	// ����� ������ ���� �޼���(�Լ�)�� ���
	// create�޼��� ȣ��� �Է°��� �޾��ִ� �߰� �Ű�ü ������ ����
	// => �Ű�����(parameter, �Ķ����)
	public void create(String id, String pw, String name, String tel) throws ClassNotFoundException, SQLException {
		// DB���α׷� ������ ���߾ �ڵ�
		// 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//		String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ps.executeUpdate();

		System.out.println("4. SQL�� ���� ����.");
	}

	public void create(MemberVO vo) throws ClassNotFoundException, SQLException {
		// DB���α׷� ������ ���߾ �ڵ�
		// 1. connector����
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//		String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPw());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getTel());
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ps.executeUpdate();

		System.out.println("4. SQL�� ���� ����.");
	}
	
	// ���̵� �ߺ�üũ�� ���
	public int read(String id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//		String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ResultSet rs = ps.executeQuery();
		// select�� ����� �˻������ ��� ���̺�
		//
		System.out.println("4. SQL�� ���� ����.");
		int result = 0;// ����
		if (rs.next()) {
			System.out.println("�˻���� o");
			result = 1;// ����
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			System.out.println("�˻���� id: " + id2);
			System.out.println("�˻���� pw: " + pw);
			System.out.println("�˻���� name: " + name);
			System.out.println("�˻���� tel: " + tel);
		} else {
			System.out.println("�˻���� x");
		}
		return result;
		// 0�� �Ѿ��, �˻���� ����.
		// 1�� �Ѿ��, �˻���� ����

	}
	
	public MemberVO one(String id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//		String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ResultSet rs = ps.executeQuery();
		// select�� ����� �˻������ ��� ���̺�
		//
		System.out.println("4. SQL�� ���� ����.");
		MemberVO bag = new MemberVO(); //���� �����
		
		if (rs.next()) {
			System.out.println("�˻���� o");
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			//���濡 �ֱ�
			bag.setId(id2);//�³׸� ����Ű�� �ּ�
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			System.out.println("�˻���� id: " + id2);
			System.out.println("�˻���� pw: " + pw);
			System.out.println("�˻���� name: " + name);
			System.out.println("�˻���� tel: " + tel);
		} else {
			System.out.println("�˻���� x");
		}
		return bag;
		// bag�� ������ ����, �ּҸ� ����!
	

	}
	

	// ���̵�/pw �´��� �α���ó��
	public boolean read(String id, String pw) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//			String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ResultSet rs = ps.executeQuery();
		// select�� ����� �˻������ ��� ���̺�
		//
		System.out.println("4. SQL�� ���� ����.");
		boolean result = false;// ����
		if (rs.next()) {
			System.out.println("�α��� ok");
			result = true;// ����
		} else {
			System.out.println("�α��� x");
		}
		return result;
		// false�� �α���x
		// true�� �α���o

	}

	public void update(String id, String pw, String name, String tel) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//		String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "update bbs set pw = ? , name = ? , tel = ?  where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, name);
		ps.setString(3, tel);
		ps.setString(4, id);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ps.executeUpdate();

		System.out.println("4. SQL�� ���� ����.");

	}

	public void delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//		String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "delete from member where id = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ps.executeUpdate();

		System.out.println("4. SQL�� ���� ����.");

	}

}