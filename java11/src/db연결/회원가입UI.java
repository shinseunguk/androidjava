package db����;

import java.sql.SQLException;

import javax.swing.JOptionPane;

public class ȸ������UI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String id = JOptionPane.showInputDialog("id�Է�");
		String pw = JOptionPane.showInputDialog("pw�Է�");
		String name = JOptionPane.showInputDialog("name�Է�");
		String tel = JOptionPane.showInputDialog("tel�Է�");
		
		MemberDAO db = new MemberDAO();
		
		db.create(id,pw,name,tel);
		
	}

}
