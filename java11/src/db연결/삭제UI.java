package db연결;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class 삭제UI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String id = JOptionPane.showInputDialog("id입력");
		
		MemberDAO db = new MemberDAO();
		
		db.delete(id);

	}

}
