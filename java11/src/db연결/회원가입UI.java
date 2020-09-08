package db연결;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class 회원가입UI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String id = JOptionPane.showInputDialog("id입력");
		String pw = JOptionPane.showInputDialog("pw입력");
		String name = JOptionPane.showInputDialog("name입력");
		String tel = JOptionPane.showInputDialog("tel입력");
		
		MemberDAO db = new MemberDAO();
		
		db.create(id,pw,name,tel);
		
	}

}
