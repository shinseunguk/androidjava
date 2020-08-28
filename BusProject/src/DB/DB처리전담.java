package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;



//특정한 방법을 처리하는 클래스: 방법(model, db처리)클래스
public class DB처리전담 {
//DB처리하는 방법이 4단계로 정해져 있다.
	public void create(String user_id,String user_pw,String user_name, String user_birth,String user_pnumber,String user_email) throws ClassNotFoundException, SQLException {
			System.out.println("DB에 저장 처리함.");
			//1. connector 설정
			Class.forName("com.mysql.jdbc.Driver");//connector의 시작점
			//자바에서는 에러가 너무 많이 발생할 것 같은 상황에서는 반드시
			//에러처리를 반드시 해주어야함.
			//네트워크연결, db연결, 파일연결, cpu연결
			System.out.println("1. connector 설정 성공!");
			//2. db연결 
//			1)ip+port+db명
			//  2)username: root
			//  3)password: 1234
			String url ="jdbc:mysql://localhost:3366/profile";
			String user ="root";
			String passworld= "1234";
			Connection con = DriverManager.getConnection(url, user, passworld);
			System.out.println("2. shop연결 성공!!");
			
			
			//db연동 index는 1부터 시작 
			String sql = "insert into signup values (?, ?, ?, ?, ?, ?)";
			
			//컴퓨터는 이 문장을 그냥 String으로 인식
			PreparedStatement ps = con.prepareStatement(sql);
//			System.out.println(user_id);
//			System.out.println(user_pw);
//			System.out.println(user_name);
//			System.out.println(user_birth);
//			System.out.println(user_pnumber);
//			System.out.println(user_email);
			ps.setString(1, user_id);
			ps.setString(2, user_pw);
			ps.setString(3, user_name);
			ps.setString(4, user_birth);
			ps.setString(5, user_pnumber);
			ps.setString(6, user_email);
			
			System.out.println("3. SQL문 생성 성공!!");
			
			ps.executeUpdate();
			System.out.println("4. SQL문을 mySQL로 네트워크 전송 성공!!");
		}

		
			public void read() {
				JOptionPane.showMessageDialog(null, "DB에 검색처리 함.");
			}
			public void update() {
				JOptionPane.showMessageDialog(null, "DB에 수정처리 함.");
			}
			public void delete() {
				JOptionPane.showMessageDialog(null, "DB에 삭제처리 함.");
			}
	

}
