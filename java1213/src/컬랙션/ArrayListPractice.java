package �÷���;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {

		
		ArrayList array = new ArrayList();
		
		array.add("�ڽ�Ű");
		array.add("�۽�Ű");
		array.add("�轺Ű");
		array.add("����Ű");
		
		for(int i = 0;i<array.size();i++) {
			
			System.out.println((i+1)+"�� "+array.get(i));
		}
		System.out.println("-----------------");
		System.out.println("2�� ��Ģ��");
		System.out.println("-----------------");
		array.remove(1);
		
		for(int i = 0;i<array.size();i++) {
			
			System.out.println((i+1)+"�� "+array.get(i));
		}
		
		
		
	}

}
