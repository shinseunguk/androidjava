package �÷��Ǻ���;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ������������ {

	
	public void save(ArrayList<����> list) {
		
		System.out.println("�� ���� ���� : "+list.size()+"��");
		
		for (int i = 0; i <list.size(); i++) {
			
			���� account = list.get(i);
			
			try {
				FileWriter fw = new FileWriter(account.name+".txt");
				fw.write(account.name +"\n");
				fw.write(account.field+"\n");
				fw.write(account.money+"\n");
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	
}
