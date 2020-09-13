package db����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BbsDAO {

	public void create(BbsVO vo) throws SQLException, ClassNotFoundException{
		System.out.println("DB�� ���� ó����.");
		//1. connector ����
		Class.forName("com.mysql.jdbc.Driver");//connector�� ������
		//�ڹٿ����� ������ �ʹ� ���� �߻��� �� ���� ��Ȳ������ �ݵ��
		//����ó���� �ݵ�� ���־����.
		//��Ʈ��ũ����, db����, ���Ͽ���, cpu����
		System.out.println("1. connector ���� ����!");
		//2. db���� 
		//	1)ip+port+db��
		//  2)username: root
		//  3)password: 1234
		String url ="jdbc:mysql://localhost:3366/shop1";
		String user ="root";
		String passworld= "1234";
		Connection con = DriverManager.getConnection(url, user, passworld);
		System.out.println("2. shop���� ����!!");
		
		//db���� index�� 1���� ���� 
		String sql = "insert into bbs values (?,?, ?, ?)";
		
		//��ǻ�ʹ� �� ������ �׳� String���� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, vo.getNo());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());
		
		System.out.println("3. SQL�� ���� ����!!");
		
		ps.executeUpdate();
		System.out.println("4. SQL���� mySQL�� ��Ʈ��ũ ���� ����!!");
	}
	public BbsVO update(BbsVO vo) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//		String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "update bbs set title = ? , content = ?   where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, vo.getTitle());
		ps.setString(2, vo.getContent());
		ps.setInt(3, vo.getNo());
		
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ps.executeUpdate();

		System.out.println("4. SQL�� ���� ����.");
		BbsVO bag = new BbsVO();

		return bag;
	}
	public BbsVO delete(int no) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("1. connector���� ����");
		// 2. DB����
//		String url = "�����ϴ¹��://ip/port/db��"
		String url = "jdbc:mysql://localhost:3366/shop1";
		String user = "root";
		String password = "1234";
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("2. DB���� ����.");
		// 3. sql���� ���� ����
		String sql = "delete from bbs where no = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.");
		
		BbsVO bag = new BbsVO();
		
		
		return bag;
	}
	public BbsVO one(int no) throws Exception {
//      DB���α׷� ������ ���߾ �ڵ�
//      1. connector����
     Class.forName("com.mysql.jdbc.Driver");
     System.out.println("1. connector���� ����.!!");

     // 2. db����
//           String url = "�����ϴ¹��://ip:port/db��";
     String url = "jdbc:mysql://localhost:3366/shop1";
     String user = "root";
     String password = "1234";
     Connection con = DriverManager.getConnection(url, user, password);
     System.out.println("2. db���� ����.!!");

     // 3. sql���� �����.
     String sql = "select * from bbs where no = ?";
     //select * from member where id = 'park' //setString
     //select * from bbs where no = 1 //setInt
     PreparedStatement ps = con.prepareStatement(sql);
     ps.setInt(1, no);

     // 4. sql���� ����
     // select�� ����� �˻������ ��� ���̺�(�׸�+����)
     // ���뿡�� ���� ���� �ְ�, ���� ���� ����.
     ResultSet rs = ps.executeQuery();
     System.out.println("4. SQL�� ���� ����.!!");
     BbsVO bag = new BbsVO();//���游��,
     if (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
        System.out.println("�˻������ �־��.");
        int no2 = rs.getInt("no");
        String title = rs.getString("title");
        String content = rs.getString("content");
        String writer = rs.getString("writer");
        //���濡 �ֱ�
        bag.setNo(no2);
        bag.setTitle(title);
        bag.setContent(content);
        bag.setWriter(writer);
     } else {
        System.out.println("�˻������ �����.");
     }
     return bag;
     // bag�� ������ ����, �ּҸ� ����!
  }
	public ArrayList<BbsVO> all() throws Exception {
	      // ������ �ִ� �����̳� ������ �ϰ� ��.!
	      // <>�ȿ��� �����̳ʿ� ������ ������ ����!
	      ArrayList<BbsVO> list = new ArrayList<BbsVO>();
//	       DB���α׷� ������ ���߾ �ڵ�
//	       1. connector����
	      Class.forName("com.mysql.jdbc.Driver");
	      System.out.println("1. connector���� ����.!!");

	      // 2. db����
//	            String url = "�����ϴ¹��://ip:port/db��";
	      String url = "jdbc:mysql://localhost:3366/shop1";
	      String user = "root";
	      String password = "1234";
	      Connection con = DriverManager.getConnection(url, user, password);
	      System.out.println("2. db���� ����.!!");

	      // 3. sql���� �����.
	      String sql = "select * from bbs";
	      PreparedStatement ps = con.prepareStatement(sql);

	      // 4. sql���� ����
	      // select�� ����� �˻������ ��� ���̺�(�׸�+����)
	      // ���뿡�� ���� ���� �ְ�, ���� ���� ����.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. SQL�� ���� ����.!!");
	      while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
	         BbsVO bag = new BbsVO();// ���游��,
	         int no2 = rs.getInt("no");
	         String title = rs.getString("title");
	         String content = rs.getString("content");
	         String writer = rs.getString("writer");
	         // ���濡 �ֱ� 
	         bag.setNo(no2); //Ŀ��(��ġ�˷��ִ� ����)
	         bag.setTitle(title);
	         bag.setContent(content);
	         bag.setWriter(writer);
	         // �����̳ʿ� �ֱ�
	         list.add(bag);
	      }
	      return list;
	      // bag�� ������ ����, �ּҸ� ����!
	   }
	
}
