package db연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDAO {

	public void create(BbsVO vo) throws SQLException, ClassNotFoundException{
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
		String url ="jdbc:mysql://localhost:3366/shop1";
		String user ="root";
		String passworld= "1234";
		Connection con = DriverManager.getConnection(url, user, passworld);
		System.out.println("2. shop연결 성공!!");
		
		//db연동 index는 1부터 시작 
		String sql = "insert into bbs values (?,?, ?, ?)";
		
		//컴퓨터는 이 문장을 그냥 String으로 인식
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, vo.getNo());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());
		
		System.out.println("3. SQL문 생성 성공!!");
		
		ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
	}
	public BbsVO update(BbsVO vo) throws ClassNotFoundException, SQLException {
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
		String sql = "update bbs set title = ? , content = ?   where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getContent());
		ps.setInt(3, vo.getNo());
		
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ps.executeUpdate();

		System.out.println("4. SQL문 전송 성공.");
		BbsVO bag = new BbsVO();

		return bag;
	}
	public BbsVO delete(int no) throws ClassNotFoundException, SQLException {
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
		String sql = "delete from bbs where no = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		System.out.println("3. SQL생성 성공");
		// 4. sql문은 전송
		ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.");
		
		BbsVO bag = new BbsVO();
		
		
		return bag;
	}
	public BbsVO one(int no) throws Exception {
//      DB프로그램 절차에 맞추어서 코딩
//      1. connector설정
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("1. connector연결 성공.!!");

     // 2. db연결
//           String url = "연결하는방법://ip:port/db명";
     String url = "jdbc:mysql://localhost:3366/shop1";
     String user = "root";
     String password = "1234";
     Connection con = DriverManager.getConnection(url, user, password);
     System.out.println("2. db연결 성공.!!");

     // 3. sql문을 만든다.
     String sql = "select * from bbs where no = ?";
     //select * from member where id = 'park' //setString
     //select * from bbs where no = 1 //setInt
     PreparedStatement ps = con.prepareStatement(sql);
     ps.setInt(1, no);

     // 4. sql문은 전송
     // select의 결과는 검색결과가 담긴 테이블(항목+내용)
     // 내용에는 없을 수도 있고, 많은 수도 있음.
     ResultSet rs = ps.executeQuery();
     System.out.println("4. SQL문 전송 성공.!!");
     BbsVO bag = new BbsVO();//가방만들어서,
     if (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
        System.out.println("검색결과가 있어요.");
        int no2 = rs.getInt("no");
        String title = rs.getString("title");
        String content = rs.getString("content");
        String writer = rs.getString("writer");
        //가방에 넣기
        bag.setNo(no2);
        bag.setTitle(title);
        bag.setContent(content);
        bag.setWriter(writer);
     } else {
        System.out.println("검색결과가 없어요.");
     }
     return bag;
     // bag은 참조형 변수, 주소를 전달!
  }
	public ArrayList<BbsVO> all() throws Exception {
	      // 가방을 넣는 컨테이너 역할을 하게 됨.!
	      // <>안에는 컨테이너에 무엇을 넣을지 지정!
	      ArrayList<BbsVO> list = new ArrayList<BbsVO>();
//	       DB프로그램 절차에 맞추어서 코딩
//	       1. connector설정
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("1. connector연결 성공.!!");

	      // 2. db연결
//	            String url = "연결하는방법://ip:port/db명";
	      String url = "jdbc:mysql://localhost:3366/shop1";
	      String user = "root";
	      String password = "1234";
	      Connection con = DriverManager.getConnection(url, user, password);
	      System.out.println("2. db연결 성공.!!");

	      // 3. sql문을 만든다.
	      String sql = "select * from bbs";
	      PreparedStatement ps = con.prepareStatement(sql);

	      // 4. sql문은 전송
	      // select의 결과는 검색결과가 담긴 테이블(항목+내용)
	      // 내용에는 없을 수도 있고, 많은 수도 있음.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. SQL문 전송 성공.!!");
	      while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
	         BbsVO bag = new BbsVO();// 가방만들어서,
	         int no2 = rs.getInt("no");
	         String title = rs.getString("title");
	         String content = rs.getString("content");
	         String writer = rs.getString("writer");
	         // 가방에 넣기 
	         bag.setNo(no2); //커서(위치알려주는 역할)
	         bag.setTitle(title);
	         bag.setContent(content);
	         bag.setWriter(writer);
	         // 컨테이너에 넣기
	         list.add(bag);
	      }
	      return list;
	      // bag은 참조형 변수, 주소를 전달!
	   }
	
}
