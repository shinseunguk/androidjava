package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			String sql = "insert into profile values (?, ?, ?, '?', ?, ?)";
			
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

		
			public void read() {
				JOptionPane.showMessageDialog(null, "DB�� �˻�ó�� ��.");
				
			}
			public void update() {
				JOptionPane.showMessageDialog(null, "DB�� ����ó�� ��.");
				
			}
			public void delete() {
				JOptionPane.showMessageDialog(null, "DB�� ����ó�� ��.");
			}
	

}