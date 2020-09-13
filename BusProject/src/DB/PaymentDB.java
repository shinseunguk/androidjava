package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Member.PaymentVO;

public class PaymentDB {

	public PaymentDB(String card,String card_number,int valid_month,int valid_years,int card_pw,int user_birth) throws SQLException, ClassNotFoundException {
		System.out.println("DB에 저장 처리함.");
		//1. connector 설정
		Class.forName("com.mysql.jdbc.Driver");//connector의 시작점
		//자바에서는 에러가 너무 많이 발생할 것 같은 상황에서는 반드시
		//에러처리를 반드시 해주어야함.
		//네트워크연결, db연결, 파일연결, cpu연결
		System.out.println("1. connector 설정 성공!");
		//2. db연결 
		//	1)ip+port+db명
		//  2)username: root
		//  3)password: 1234
		String url ="jdbc:mysql://localhost:3366/profile";
		String user ="root";
		String passworld= "1234";
		Connection con = DriverManager.getConnection(url, user, passworld);
		System.out.println("2. shop연결 성공!!");
		
		
		//db연동 index는 1부터 시작 
		String sql = "insert into payment values (?, ?, ?, ?, ?, ?)";
		
		//컴퓨터는 이 문장을 그냥 String으로 인식
		PreparedStatement ps = con.prepareStatement(sql);
		PaymentVO vo = new PaymentVO();
		ps.setString(1, vo.getCardN());
		ps.setString(2, card_number);
		ps.setInt(3, valid_month);
		ps.setInt(4, valid_years); //int
		ps.setInt(5, card_pw);
		ps.setInt(6, user_birth);
		
		System.out.println("3. SQL문 생성 성공!!");
		
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
	}
	
	
}
