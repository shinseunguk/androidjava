package 컬렉션복습;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class 계좌파일저장 {

	
	public void save(ArrayList<계좌> list) {
		
		System.out.println("총 계좌 개수 : "+list.size()+"개");
		
		for (int i = 0; i <list.size(); i++) {
			
			계좌 account = list.get(i);
			
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
