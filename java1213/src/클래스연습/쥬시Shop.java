package Ŭ��������;

public class ���Shop {

	public static void main(String[] args) {

		���� cal = new ����();
		cal.color = "������";
		cal.price = 5000;
		cal.size = 15;
		
		int �꽺count=5;
		int Ŀ��count=3;
		
		int �꽺���� = cal.���ϴ�(�꽺count,3000);
		int Ŀ�ǰ��� = cal.���ϴ�(Ŀ��count, 2000);

		
		System.out.println("�꽺������ "+ �꽺���� +"��");
		System.out.println("Ŀ�ǰ����� "+ Ŀ�ǰ��� +"��");
		
		
		int ���� = cal.����(�꽺����, Ŀ�ǰ���);
		System.out.println("�� ���ᰣ�� �������̴� "+����+"��");
	}

}
