package db����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class �Խ�����ü�������Ʈ {

	public static void main(String[] args) throws Exception {
		
		BbsDAO dao = new BbsDAO();
		ArrayList<BbsVO> list = dao.all();
		System.out.println("�Խ����� ����: "+ list.size()+"��");
		for (int i = 0; i < list.size(); i++) {
			
			BbsVO bag = list.get(i);
			System.out.println(bag.getNo());
			System.out.println(bag.getTitle());
			System.out.println(bag.getContent());
			System.out.println(bag.getWriter());
			System.out.println();
		}
	}
}
