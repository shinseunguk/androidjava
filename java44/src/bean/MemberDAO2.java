package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//CRUD�߽����� ����� ����
//�����Ϳ� ���õ� �۾�(Data Access Object: DAO)
public class MemberDAO2 {
	String url = "jdbc:mysql://localhost:3366/shop?characterEncoding=UTF-8";
	String user = "root";
	String password = "1234";
	Connection con;
	
	public MemberDAO2() throws Exception{
				// 1. connector����
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("1. connector���� ����.!!");

				// 2. db����
//				String url = "�����ϴ¹��://ip:port/db��";
				con = DriverManager.getConnection(url, user, password);
				System.out.println("2. db���� ����.!!");
	}
	public boolean create(MemberVO vo) throws Exception {
		// 3. sql���� �����.(create)
		String sql = "insert into news values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getPubDate());
		ps.setString(3, vo.getLink());
		ps.setString(4, vo.getThumbnail());
		
		System.out.println("3. SQL���� ����.!!");

		// 4. sql���� ����
		int row = ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.!!");
		boolean result = false;
		if(row == 1) {
			result = true;
		}
		ps.close();
		con.close();
		return result;
	}

	
}