package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object : DAO)
public class MemberDAO {
	// 기능을 정의할 때는 메서드(함수)를 사용
	// create메서드 호출시 입력값을 받아주는 중간 매개체 역할의 변수
	// => 매개변수(parameter, 파라미터)
	public void create(String id, String pw, String name, String tel) throws ClassNotFoundException, SQLException {
		// DB프로그램 절차에 맞추어서 코딩
		// 1. connector설정
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
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ps.executeUpdate();

		System.out.println("4. SQL문 전송 성공.");
	}

	public void create(MemberVO vo) throws ClassNotFoundException, SQLException {
		// DB프로그램 절차에 맞추어서 코딩
		// 1. connector설정
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
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPw());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getTel());
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ps.executeUpdate();

		System.out.println("4. SQL문 전송 성공.");
	}
	
	// 아이디 중복체크시 사용
	public int read(String id) throws ClassNotFoundException, SQLException {
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
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		// select의 결과는 검색결과가 담긴 테이블
		//
		System.out.println("4. SQL문 전송 성공.");
		int result = 0;// 없음
		if (rs.next()) {
			System.out.println("검색결과 o");
			result = 1;// 있음
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			System.out.println("검색결과 id: " + id2);
			System.out.println("검색결과 pw: " + pw);
			System.out.println("검색결과 name: " + name);
			System.out.println("검색결과 tel: " + tel);
		} else {
			System.out.println("검색결과 x");
		}
		return result;
		// 0이 넘어가면, 검색결과 없음.
		// 1이 넘어가면, 검색결과 있음

	}
	
	public MemberVO one(String id) throws ClassNotFoundException, SQLException {
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
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		// select의 결과는 검색결과가 담긴 테이블
		//
		System.out.println("4. SQL문 전송 성공.");
		MemberVO bag = new MemberVO(); //가방 만들기
		
		if (rs.next()) {
			System.out.println("검색결과 o");
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			//가방에 넣기
			bag.setId(id2);//걔네를 가르키는 주소
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			System.out.println("검색결과 id: " + id2);
			System.out.println("검색결과 pw: " + pw);
			System.out.println("검색결과 name: " + name);
			System.out.println("검색결과 tel: " + tel);
		} else {
			System.out.println("검색결과 x");
		}
		return bag;
		// bag은 참조형 변수, 주소를 전달!
	

	}
	

	// 아이디/pw 맞는지 로그인처리
	public boolean read(String id, String pw) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector연결 성공");
		// 2. DB연결
//			String url = "연결하는방법://ip/port/db명"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB연결 성공.");
		// 3. sql문을 만들어서 전송
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ResultSet rs = ps.executeQuery();
		// select의 결과는 검색결과가 담긴 테이블
		//
		System.out.println("4. SQL문 전송 성공.");
		boolean result = false;// 없음
		if (rs.next()) {
			System.out.println("로그인 ok");
			result = true;// 있음
		} else {
			System.out.println("로그인 x");
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
		String sql = "update bbs set pw = ? , name = ? , tel = ?  where id = ?";
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

	public void delete(int id) throws ClassNotFoundException, SQLException {
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
		String sql = "delete from member where id = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, id);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ps.executeUpdate();

		System.out.println("4. SQL문 전송 성공.");

	}

}