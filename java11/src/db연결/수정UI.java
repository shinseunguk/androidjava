package db연결;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class 수정UI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		String id = JOptionPane.showInputDialog("검색할 id입력");
		String tel = JOptionPane.showInputDialog("수정할 tel입력");
		
		MemberDAO db = new MemberDAO();
		
		
		
	}

}
