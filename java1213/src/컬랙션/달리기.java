package �÷���;

import java.util.ArrayList;

public class �޸��� {

	public static void main(String[] args) {

		ArrayList run = new ArrayList();
		run.add("�ڼ���");
		run.add("������");
		run.add("������");
		run.add("�谳��");
		
		for (int i = 0; i < run.size(); i++) {
				System.out.println((i+1)+"�� " +run.get(i));
		}
		
		System.out.println("2�� ��Ģ - > Ż��");
		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.println((i+1)+"�� " +run.get(i));
	}
	}

}
