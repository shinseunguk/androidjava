package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;




//Ư���� ����� ó���ϴ� Ŭ����: ���(model, dbó��)Ŭ����
public class DBó������ {
//DBó���ϴ� ����� 4�ܰ�� ������ �ִ�.
	public void create(String user_id,String user_pw,String user_name, int user_birth,String user_pnumber,String user_email) throws ClassNotFoundException, SQLException {
			System.out.println("DB�� ���� ó����.");
			//1. connector ����
			Class.forName("com.mysql.jdbc.Driver");//connector�� ������
			//�ڹٿ����� ������ �ʹ� ���� �߻��� �� ���� ��Ȳ������ �ݵ��
			//����ó���� �ݵ�� ���־����.
			//��Ʈ��ũ����, db����, ���Ͽ���, cpu����
			System.out.println("1. connector ���� ����!");
			//2. db���� 
			//	1)ip+port+db��
			//  2)username: root
			//  3)password: 1234
			String url ="jdbc:mysql://localhost:3366/profile";
			String user ="root";
			String passworld= "1234";
			Connection con = DriverManager.getConnection(url, user, passworld);
			System.out.println("2. shop���� ����!!");
			
			
			//db���� index�� 1���� ���� 
			String sql = "insert into payment values (?, ?, ?, ?, ?, ?)";
			
			//��ǻ�ʹ� �� ������ �׳� String���� �ν�
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user_id);
			ps.setString(2, user_pw);
			ps.setString(3, user_name);
			ps.setInt(4, user_birth); //int
			ps.setString(5, user_pnumber);
			ps.setString(6, user_email);
			
			System.out.println("3. SQL�� ���� ����!!");
			
			ps.executeUpdate();
			System.out.println("4. SQL���� mySQL�� ��Ʈ��ũ ���� ����!!");
		}

		
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
		String sql = "select * from profile where user_id = ?";
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
	
	

	// ���̵�/pw �´��� �α���ó��
	public boolean read(String id, String pw) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//			String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/profile";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "select * from profile where user_id = ? and user_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ResultSet rs = ps.executeQuery();
		// select�� ����� �˻������ ��� ���̺�
		System.out.println("4. SQL�� ���� ����.");
		boolean result = false;// ����
		if (rs.next()) {
			result = true;// ����
		} else {
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
		String sql = "update profile set pw = ? , name = ? , tel = ?  where id = ?";
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

	public void delete(String id) throws ClassNotFoundException, SQLException {
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
		String sql = "delete from profile where id = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ps.executeUpdate();

		System.out.println("4. SQL�� ���� ����.");

	}
	

}