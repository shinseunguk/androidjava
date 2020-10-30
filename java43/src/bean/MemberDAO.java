package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class MemberDAO {
	String url = "jdbc:mysql://localhost:3366/shop";
	String user = "root";
	String password = "1234";
	Connection con;
	
	public MemberDAO() throws Exception{
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
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getPw());
		ps.setString(3, vo.getName());
		ps.setString(4, vo.getTel());
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

	public boolean create(String id, String pw, String name, String tel) throws Exception {
		// 3. sql문을 만든다.(create)
		String sql = "insert into member values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ps.setString(3, name);
		ps.setString(4, tel);
		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		boolean result = false;
		if (row == 1) {
			result = true;
		} 
		System.out.println("4. SQL문 전송 성공.!!");
		
		ps.close();
		con.close();
		return result;
	}

	public MemberVO one(String id) throws Exception {
		// 3. sql문을 만든다.(create)
		String sql = "select * from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		MemberVO bag = new MemberVO();//가방만들어서,
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			// if(rs.next())와 동일함.
			// if문은 rs.next()가 true때만 실행되므로!
			System.out.println("검색결과가 있어요.");
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			//가방에 넣기
			bag.setId(id2);
			bag.setPw(pw);
			bag.setName(name);
			bag.setTel(tel);
			System.out.println("검색결과 id: " + id2);
			System.out.println("검색결과 pw: " + pw);
			System.out.println("검색결과 name: " + name);
			System.out.println("검색결과 tel: " + tel);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		
		rs.close();
		ps.close();
		con.close();
		
		return bag;
		// bag은 참조형 변수, 주소를 전달!
	}
	
	   public List<MemberVO> all() throws Exception {

	      // 3. sql문을 만든다.
	      String sql = "select * from member";
	      PreparedStatement ps = con.prepareStatement(sql);
	      // 4. sql문은 전송
	      // select의 결과는 검색결과가 담긴 테이블(항목+내용)
	      // 내용에는 없을 수도 있고, 많은 수도 있음.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. SQL문 전송 성공.!!");
	      // 가방을 넣는 컨테이너 역할을 하게 됨.!
	      // <>안에는 컨테이너에 무엇을 넣을지 지정!
	     List<MemberVO> list = new ArrayList<MemberVO>();
	      while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
	         MemberVO bag = new MemberVO();// 가방만들어서,
				//가방에 넣기
	         	//Object(vo) Relational DB(row) Mapping(ORM)
				bag.setId(rs.getString("id"));
				bag.setPw(rs.getString("pw"));
				bag.setName(rs.getString("name"));
				bag.setTel(rs.getString("tel"));
	         // 컨테이너에 넣기
	         list.add(bag);
	      }
	      return list;
	      // bag은 참조형 변수, 주소를 전달!
	   }
	   
	   public List<MemberVO> all(String tel) throws Exception {

		      // 3. sql문을 만든다.
		      String sql = "select * from member where tel = ?";
		      
		      
		      PreparedStatement ps = con.prepareStatement(sql);
		      
		      ps.setString(1, tel);
		      // 4. sql문은 전송
		      // select의 결과는 검색결과가 담긴 테이블(항목+내용)
		      // 내용에는 없을 수도 있고, 많은 수도 있음.
		      ResultSet rs = ps.executeQuery();
		      System.out.println("4. SQL문 전송 성공.!!");
		      // 가방을 넣는 컨테이너 역할을 하게 됨.!
		      // <>안에는 컨테이너에 무엇을 넣을지 지정!
		     List<MemberVO> list = new ArrayList<MemberVO>();
		      while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
		         MemberVO bag = new MemberVO();// 가방만들어서,
					//가방에 넣기
		         	//Object(vo) Relational DB(row) Mapping(ORM)
					bag.setId(rs.getString("id"));
					bag.setPw(rs.getString("pw"));
					bag.setName(rs.getString("name"));
					bag.setTel(rs.getString("tel"));
		         // 컨테이너에 넣기
		         list.add(bag);
		      }
		      return list;
		      // bag은 참조형 변수, 주소를 전달!
		   }
	   
	
	   public List<MemberVO> all2(String tel) throws Exception {

		      // 3. sql문을 만든다.
		      String sql = "select * from member where tel like '" + tel + "%'";
		      
		      
		      PreparedStatement ps = con.prepareStatement(sql);
		      
		      // 4. sql문은 전송
		      // select의 결과는 검색결과가 담긴 테이블(항목+내용)
		      // 내용에는 없을 수도 있고, 많은 수도 있음.
		      ResultSet rs = ps.executeQuery();
		      System.out.println("4. SQL문 전송 성공.!!");
		      // 가방을 넣는 컨테이너 역할을 하게 됨.!
		      // <>안에는 컨테이너에 무엇을 넣을지 지정!
		     List<MemberVO> list = new ArrayList<MemberVO>();
		      while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
		         MemberVO bag = new MemberVO();// 가방만들어서,
					//가방에 넣기
		         	//Object(vo) Relational DB(row) Mapping(ORM)
					bag.setId(rs.getString("id"));
					bag.setPw(rs.getString("pw"));
					bag.setName(rs.getString("name"));
					bag.setTel(rs.getString("tel"));
		         // 컨테이너에 넣기
		         list.add(bag);
		      }
		      return list;
		      // bag은 참조형 변수, 주소를 전달!
		   }
	   
	
	// id중복체크
	public int read(String id) throws Exception {
		// 3. sql문을 만든다.(create)
		String sql = "select * from member1 where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		int result = 0;// 없음.
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			// if(rs.next())와 동일함.
			// if문은 rs.next()가 true때만 실행되므로!
			System.out.println("검색결과가 있어요.");
			result = 1; // 있음.
//			rs.getInt("no");//정수 가지고 올때
//			rs.getDouble("num");//실수 가지고 올때
			String id2 = rs.getString("id");
			String pw = rs.getString("pw");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			System.out.println("검색결과 id: " + id2);
			System.out.println("검색결과 pw: " + pw);
			System.out.println("검색결과 name: " + name);
			System.out.println("검색결과 tel: " + tel);
		} else {
			System.out.println("검색결과가 없어요.");
		}
		
		rs.close();
		ps.close();
		con.close();
		return result;
		// 0이 넘어가면, 검색결과 없음.
		// 1이 넘어가면, 검색결과 있음.
	}

	// id, pw맞는지 로그인 처리
	public boolean read(String id, String pw) throws Exception {

		// 3. sql문을 만든다.(create)
		String sql = "select * from member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);

		// 4. sql문은 전송
		// select의 결과는 검색결과가 담긴 테이블(항목+내용)
		// 내용에는 없을 수도 있고, 많은 수도 있음.
		ResultSet rs = ps.executeQuery();
		System.out.println("4. SQL문 전송 성공.!!");
		boolean result = false;// 로그인이 not!인 상태!
		if (rs.next() == true) { // 결과가 있는지 없는지 체크해주는 메서드
			System.out.println("로그인 ok.");
			result = true; // 있음.
		} else {
			System.out.println("로그인 not.");
		}
		rs.close();
		ps.close();
		con.close();
		return result;
		// false면 로그인not.
		// true면 로그인ok.
	}

	public boolean update(MemberVO vo) throws Exception {
	
		// 3. sql문을 만든다.(create)
		String sql = "update member set pw = ?, name = ?, tel = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getPw());
		ps.setString(2, vo.getName());
		ps.setString(3, vo.getTel());
		ps.setString(4, vo.getId());
		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}

	public boolean delete(String id) throws Exception {
		// 3. sql문을 만든다.(create)
		String sql = "delete from member where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		System.out.println("3. SQL생성 성공.!!");

		// 4. sql문은 전송
		int row = ps.executeUpdate();
		System.out.println("4. SQL문 전송 성공.!!");
		ps.close();
		con.close();
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		return result;
	}
}