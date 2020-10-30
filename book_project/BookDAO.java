package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//CRUD�߽����� ����� ����
//�����Ϳ� ���õ� �۾�(Data Access Object: DAO)
public class BookDAO {
	DBConnectionMgr dbcp;
	Connection con;

	public BookDAO() throws Exception {
		dbcp = DBConnectionMgr.getInstance();
		System.out.println("2. db���� ����.!!");
	}

public boolean create(BookDTO vo) throws Exception {
		con = dbcp.getConnection();
		System.out.println("==>" + vo);
		// db���� index�� 1���� ����
		String sql = "insert into book_product(id,bookName,content,publish,writer) values (?,?,?,?,?)";

		// ��ǻ�ʹ� �� ������ �׳� String���� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, vo.getId());
		ps.setString(2, vo.getBookname());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getPublish());
		ps.setString(5, vo.getWriter());
		
		System.out.println("3. SQL�� ���� ����!!");

		int row = ps.executeUpdate();
		System.out.println("4. SQL���� mySQL�� ��Ʈ��ũ ���� ����!!");
		boolean result = false;
		if (row == 1) {
			result = true;
		}
		ps.close();
		con.close();

		return result;
	}
}