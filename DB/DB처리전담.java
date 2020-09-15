package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;




//특정한 방법을 처리하는 클래스: 방법(model, db처리)클래스
public class DB처리전담 {
//DB처리하는 방법이 4단계로 정해져 있다.
	public void create(String user_id,String user_pw,String user_name, int user_birth,String user_pnumber,String user_email) throws ClassNotFoundException, SQLException {
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
			String sql = "insert into profile values (?, ?, ?, ?, ?, ?)";
			
			//컴퓨터는 이 문장을 그냥 String으로 인식
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, user_id);
			ps.setString(2, user_pw);
			ps.setString(3, user_name);
			ps.setInt(4, user_birth); //int
			ps.setString(5, user_pnumber);
			ps.setString(6, user_email);
			
			System.out.println("3. SQL문 생성 성공!!");
			
			ps.executeUpdate();
			System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
		}

		
	

	// 아이디/pw 맞는지 로그인처리
	public boolean read(String id, String pw) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공");
		// 2. DB연결
//			String url = "연결하는방법://ip/port/db명"
		String url = "jdbc:mysql://localhost:3366/profile";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공.");
		// 3. sql문을 만들어서 전송
		String sql = "select * from profile where user_id = ? and user_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		// select의 결과는 검색결과가 담긴 테이블
		System.out.println("4. SQL문 전송 성공.");
		boolean result = false;// 없음
		if (rs.next()) {
			result = true;// 있음
		} else {
		}
		return result;
		// false면 로그인x
		// true면 로그인o

	}
	
	//아이디 중복확인
	public boolean read(String id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공");
		// 2. DB연결
//			String url = "연결하는방법://ip/port/db명"
		String url = "jdbc:mysql://localhost:3366/profile";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공.");
		// 3. sql문을 만들어서 전송
		String sql = "select * from profile where user_id = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		// select의 결과는 검색결과가 담긴 테이블
		System.out.println("4. SQL문 전송 성공.");
		boolean result = false;// 없음
		if (rs.next()) {
			result = false;// 있음
		} else {
			result = true;
		}
		return result;
		// false면 로그인x
		// true면 로그인o

	}
	

	public void update(String id, String pw, String name, String tel) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공");
		// 2. DB연결
//		String url = "연결하는방법://ip/port/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공.");
		// 3. sql문을 만들어서 전송
		String sql = "update profile set pw = ? , name = ? , tel = ?  where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, name);
		ps.setString(3, tel);
		ps.setString(4, id);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ps.executeUpdate();

		System.out.println("4. SQL문 전송 성공.");

	}

	public void delete(String id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공");
		// 2. DB연결
//		String url = "연결하는방법://ip/port/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공.");
		// 3. sql문을 만들어서 전송
		String sql = "delete from profile where id = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ps.executeUpdate();

		System.out.println("4. SQL문 전송 성공.");

	}
	

}