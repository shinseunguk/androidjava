package db����;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ����UI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String id = JOptionPane.showInputDialog("id�Է�");
		
		MemberDAO db = new MemberDAO();
		
		db.delete(id);

	}

}
