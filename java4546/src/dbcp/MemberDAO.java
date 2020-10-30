package dbcp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.MemberVO;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class MemberDAO {
	
	Connection con;
	DBConnectionMgr dbcp;
	public MemberDAO() throws Exception{
				dbcp = DBConnectionMgr.getInstance();
				System.out.println("2. db연결 성공.!!");
	}
	public List<MemberVO2> all(String tel) throws Exception {
		
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
	     List<MemberVO2> list = new ArrayList<MemberVO2>();
	      while (rs.next()) { // 결과가 있는지 없는지 체크해주는 메서드
	         MemberVO2 bag = new MemberVO2();// 가방만들어서,
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

	
}