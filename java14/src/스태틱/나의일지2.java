package ����ƽ;



public class ��������2 {

	public static void main(String[] args) {

		Day day1 = new Day("�ڹٰ���", 10, "����");
		System.out.println(Day.count + "�� ������.");
		System.out.println(Day.sum+"�ð� ������");
		
		Day day2 = new Day("����", 15, "������");
		System.out.println(Day.count + "�� ������.");
		System.out.println(Day.sum+"�ð� ������");
		
		Day day3 = new Day("�", 11, "��Ʈ�Ͻ�");
		System.out.println(Day.count + "�� ������.");
		System.out.println(Day.sum+"�ð� ������");
		
		System.out.println("��� �ð��� "+ Day.sum/Day.count+"�ð�");
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		System.out.println(Day.company);
		
	}
}
