package ����ƽ;

public class â�� {

	public static void main(String[] args) {

		���� em1 = new ����("ȫ�浿", "����", 20);
		System.out.println("����� ������ : " + ����.count + "��");
		���� em2 = new ����("��浿", "����", 22);
		System.out.println("����� ������ : " + ����.count + "��");
		���� em3 = new ����("�̱浿", "����", 25);
		System.out.println("����� ������ : " + ����.count + "��"); // ������

		System.out.println("��� ���� : " + (double) ����.sumAge / ����.count); //��ճ��� ���ϱ�

		System.out.println(em1); //���� ���� ����Ʈ
		System.out.println(em2); //���� ���� ����Ʈ
		System.out.println(em3); //���� ���� ����Ʈ
		System.out.println(em1.getAvg());
		System.out.println();
	}

}
