package �÷��Ǻ���;

import java.util.ArrayList;

public class �������� {
	
	public static void main(String[] args) {
		
		Day day1 = new Day("�ڹٰ���", 10,"����");
//		System.out.println(day1);
		Day day2 = new Day("����", 15,"������");
//		System.out.println(day2);
		Day day3 = new Day("�", 11,"��Ʈ�Ͻ�");
//		System.out.println(day3);

		ArrayList<Day> list = new ArrayList<>();
		list.add(day1);
		list.add(day2);
		list.add(day3);
		
		���Ϸ����� file = new ���Ϸ�����();
		file.save(list);
		
	}
}
