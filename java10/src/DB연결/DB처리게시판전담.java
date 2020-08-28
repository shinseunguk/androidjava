package DB연결;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import 클래스만들기.DB처리전담;

public class DB처리게시판전담 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String title = JOptionPane.showInputDialog("title입력");
		String content = JOptionPane.showInputDialog("content입력");
		String writer = JOptionPane.showInputDialog("writer입력");

		DB처리전담 db = new DB처리전담();
		db.create(title, content, writer);

	}
}
