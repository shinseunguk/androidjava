package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class BookDAO {
	DBConnectionMgr dbcp;
	Connection con;

	public BookDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
		System.out.println("2. db연결 성공.!!");
	}

public boolean create(BookDTO vo) throws Exception {
		con = dbcp.getConnection();
		System.out.println("==>" + vo);
		// db연동 index는 1부터 시작
		String sql = "insert into book_product(id,bookName,content,publish,writer) values (?,?,?,?,?)";

		// 컴퓨터는 이 문장을 그냥 String으로 인식
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getBookname());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getPublish());
		ps.setString(5, vo.getWriter());
		
		System.out.println("3. SQL문 생성 성공!!");

		int row = ps.executeUpdate();
		System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		ps.close();
		con.close();

		return result;
	}
}