package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Member.PaymentVO;

public class PaymentDB {

	public PaymentDB(String card,String card_number,int valid_month,int valid_years,int card_pw,int user_birth) throws SQLException, ClassNotFoundException {
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
		PaymentVO vo = new PaymentVO();
		ps.setString(1, vo.getCardN());
		ps.setString(2, card_number);
		ps.setInt(3, valid_month);
		ps.setInt(4, valid_years); //int
		ps.setInt(5, card_pw);
		ps.setInt(6, user_birth);
		
		System.out.println("3. SQL�� ���� ����!!");
		
		ps.executeUpdate();
		System.out.println("4. SQL���� mySQL�� ��Ʈ��ũ ���� ����!!");
	}
	
	
}
