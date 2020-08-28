package DB연결;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import 클래스만들기.DB처리전담;

public class DB입력UI {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String id =JOptionPane.showInputDialog("id입력");
		String pw =JOptionPane.showInputDialog("pw입력");
		String name =JOptionPane.showInputDialog("name입력");
		String tel =JOptionPane.showInputDialog("tel입력");
		
		DB처리전담 db = new DB처리전담();
		
//		db.create(id, pw, name, tel);
		
	}

}
