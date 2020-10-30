package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BbsDAO {
	Connection con;
	String url ="String url = \"jdbc:mysql://localhost:3366/shop1?characterEncoding=UTF-8\";";
	String user ="root";
	String passworld= "1234";
	public BbsDAO() throws SQLException, ClassNotFoundException {
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
		
		con = DriverManager.getConnection(url, user, passworld);
		System.out.println("2. shop���� ����!!");
	}
	
	public boolean create(BbsVO vo) throws SQLException, ClassNotFoundException{
		
		
		//db���� index�� 1���� ���� 
		String sql = "insert into bbs values (?,?, ?, ?)";
		
		//��ǻ�ʹ� �� ������ �׳� String���� �ν�
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, vo.getNo());
		ps.setString(2, vo.getTitle());
		ps.setString(3, vo.getContent());
		ps.setString(4, vo.getWriter());
		
		System.out.println("3. SQL�� ���� ����!!");
		
		int row = ps.executeUpdate();
		System.out.println("4. SQL���� mySQL�� ��Ʈ��ũ ���� ����!!");
		boolean result = false;
		if(row==1) {
			result = true;
		}
		ps.close();
		con.close();
		
		return result;
	}
	public BbsVO update(BbsVO vo) throws ClassNotFoundException, SQLException {
		
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
		ps.close();
		con.close();
		return bag;
	}
	public BbsVO delete(int no) throws ClassNotFoundException, SQLException {
		
		// 3. sql���� ���� ����
		String sql = "delete from bbs where no = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		System.out.println("3. SQL���� ����");
		// 4. sql���� ����
		ps.executeUpdate();
		System.out.println("4. SQL�� ���� ����.");
		
		BbsVO bag = new BbsVO();
		
		ps.close();
		con.close();
		return bag;
	}
	public BbsVO one(int no) throws Exception {


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
     ps.close();
		con.close();
     return bag;
     // bag�� ������ ����, �ּҸ� ����!
  }
	
	 public List<BbsVO> all(String title) throws Exception {

	      // 3. sql���� �����.
	      String sql = "select * from bbs where title = ?";
	      
	      
	      PreparedStatement ps = con.prepareStatement(sql);
	      ps.setString(1, title);
	      // 4. sql���� ����
	      // select�� ����� �˻������ ��� ���̺�(�׸�+����)
	      // ���뿡�� ���� ���� �ְ�, ���� ���� ����.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. SQL�� ���� ����.!!");
	      // ������ �ִ� �����̳� ������ �ϰ� ��.!
	      // <>�ȿ��� �����̳ʿ� ������ ������ ����!
	     List<BbsVO> list = new ArrayList<BbsVO>();
	      while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
	         BbsVO bag = new BbsVO();// ���游��,
				//���濡 �ֱ�
	         	//Object(vo) Relational DB(row) Mapping(ORM)
				bag.setNo(rs.getInt("no"));
				bag.setTitle(rs.getString("title"));
				bag.setContent(rs.getString("content"));
				bag.setWriter(rs.getString("writer"));
	         // �����̳ʿ� �ֱ�
	         list.add(bag);
	      }
	      return list;
	      // bag�� ������ ����, �ּҸ� ����!
	   }
  

  public List<BbsVO> all2(String content) throws Exception {

	      // 3. sql���� �����.
	      String sql = "select * from bbs where content like '" + content + "%'";
	      
	      
	      PreparedStatement ps = con.prepareStatement(sql);
	      
	      // 4. sql���� ����
	      // select�� ����� �˻������ ��� ���̺�(�׸�+����)
	      // ���뿡�� ���� ���� �ְ�, ���� ���� ����.
	      ResultSet rs = ps.executeQuery();
	      System.out.println("4. SQL�� ���� ����.!!");
	      // ������ �ִ� �����̳� ������ �ϰ� ��.!
	      // <>�ȿ��� �����̳ʿ� ������ ������ ����!
	     List<BbsVO> list = new ArrayList<BbsVO>();
	      while (rs.next()) { // ����� �ִ��� ������ üũ���ִ� �޼���
	         BbsVO bag = new BbsVO();// ���游��,
				//���濡 �ֱ�
	         	//Object(vo) Relational DB(row) Mapping(ORM)
	         bag.setNo(rs.getInt("no"));
				bag.setTitle(rs.getString("title"));
				bag.setContent(rs.getString("content"));
				bag.setWriter(rs.getString("writer"));
	         // �����̳ʿ� �ֱ�
	         list.add(bag);
	      }
	      return list;
	      // bag�� ������ ����, �ּҸ� ����!
	   }
	
	
	
	public ArrayList<BbsVO> all() throws Exception {
	      // ������ �ִ� �����̳� ������ �ϰ� ��.!
	      // <>�ȿ��� �����̳ʿ� ������ ������ ����!
	      ArrayList<BbsVO> list = new ArrayList<BbsVO>();
//	       DB���α׷� ������ ���߾ �ڵ�
//	       1. connector����
	     

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
	      ps.close();
			con.close();
	      return list;
	      // bag�� ������ ����, �ּҸ� ����!
	   }
	
}
