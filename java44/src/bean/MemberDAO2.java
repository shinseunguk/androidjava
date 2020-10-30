package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class MemberDAO2 {
	String url = "jdbc:mysql://localhost:3366/shop?characterEncoding=UTF-8";
	String user = "root";
	String password = "1234";
	Connection con;
	
	public MemberDAO2() throws Exception{
				// 1. connector설정
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. connector연결 성공.!!");

				// 2. db연결
//				String url = "연결하는방법://ip:port/db명";
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. db연결 성공.!!");
	}
	public boolean create(MemberVO vo) throws Exception {
		// 3. sql문을 만든다.(create)
		String sql = "insert into news values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getPubDate());
		ps.setString(3, vo.getLink());
		ps.setString(4, vo.getThumbnail());
		
		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");
		boolean result = false;
		if(row == 1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;
	}

	
}