package �÷��Ǻ���;

import java.util.ArrayList;

public class ����5�� {
	public static void main(String[] args) {
	
		���� account1 = new ����("��浿","���⿹��",1000);
		���� account2 = new ����("�ֱ浿","��������",5000);
		���� account3 = new ����("�ڱ浿","���⿹��",6000);
		���� account4 = new ����("�ű浿","��������",7000);
		���� account5 = new ����("�̱浿","���⿹��",8000);
		
		ArrayList<����> list = new ArrayList<>();
		
			list.add(account1);
			list.add(account2);
			list.add(account3);
			list.add(account4);
			list.add(account5);
			
			
			������������  f = new ������������ ();
			f.save(list);
	
	}
}
