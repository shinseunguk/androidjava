package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class BasketDAO {
	DBConnectionMgr dbcp;
	Connection con;

	public BasketDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
		System.out.println("2. db연결 성공.!!");
	}

	public List<BasketVO> all() throws Exception {
		con = dbcp.getConnection();
		// 3. sql문을 만든다.
		String sql = "select * from basket";
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
		List<BasketVO> list = new ArrayList<BasketVO>();
		while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
			BasketVO bag = new BasketVO();// 가방만들어서,
			// 가방에 넣기
			// Object(vo) Relational DB(row) Mapping(ORM)
			bag.setTitle(rs.getString("title"));
			bag.setPrice(rs.getInt("price"));
			bag.setContent(rs.getString("Content"));
			bag.setImg(rs.getString("img"));
			bag.setProductid(rs.getString("productid"));
			bag.setUserid(rs.getString("userid"));
			// 컨테이너에 넣기
			list.add(bag);
		}
		dbcp.freeConnection(con, ps, rs);
		return list;
		// bag은 참조형 변수, 주소를 전달!
	}

	public boolean create(BasketVO vo) throws Exception {
		con = dbcp.getConnection();
		System.out.println("==>" + vo);
		// db연동 index는 1부터 시작
		String sql = "insert into basket(title,content,price,img,productid,userid) values (?,?, ?, ?,?,?)";

		// 컴퓨터는 이 문장을 그냥 String으로 인식
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getContent());
		ps.setInt(3, vo.getPrice());
		ps.setString(4, vo.getImg());
		ps.setString(5, vo.getProductid());
		ps.setString(6, vo.getUserid());
		
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
	
	public void delete() throws Exception {
		con = dbcp.getConnection();
		// 3. sql문을 만든다.
		String sql = "delete from basket where title is null";
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		int rs = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
	}
	

	public void deleteall() throws Exception {
		con = dbcp.getConnection();
		// 3. sql문을 만든다.
		String sql = "delete from basket";
		PreparedStatement ps = con.prepareStatement(sql);
		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		int rs = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");
		// 가방을 넣는 컨테이너 역할을 하게 됨.!
		// <>안에는 컨테이너에 무엇을 넣을지 지정!
	}
	
}