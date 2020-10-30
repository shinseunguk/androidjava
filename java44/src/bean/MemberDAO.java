package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;

//CRUD중심으로 기능을 정의
//데이터와 관련된 작업(Data Access Object: DAO)
public class MemberDAO {
	
	Connection con;
	
	public MemberDAO() throws Exception{
				dbcp = DBConnectionMgr.getInstance();
				System.out.println("2. db연결 성공.!!");
	}
	public boolean create(MemberVO2 vo) throws Exception {
		// 3. sql문을 만든다.(create)
		String sql = "insert into member2 values (?,?,?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getFirst_name());
		ps.setString(3, vo.getLast_name());
		ps.setString(4, vo.getEmail());
		ps.setString(5, vo.getGender());
		ps.setString(6, vo.getIp_address());
		
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