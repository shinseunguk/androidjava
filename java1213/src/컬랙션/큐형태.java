package �÷���;

import java.util.LinkedList;

public class ť���� {
	public static void main(String[] args) {
		LinkedList subject = new LinkedList();
		subject.add("����");
		subject.add("����");
		subject.add("����");
		subject.add("��ǻ��");
		System.out.print("��ü ���躼 ���� ����: ");
		for (int i = 0; i < subject.size(); i++) {
			System.out.print(subject.get(i) + ", ");
		}
		subject.remove();
		System.out.println();
		System.out.print("1���� ���躻 �� ���� ����: ");

		for (int i = 0; i < subject.size(); i++) {

			System.out.print(subject.get(i) + ", ");
		}
		subject.remove();
		System.out.println();
		System.out.print("2���� ���躻 �� ���� ����: ");

		for (int i = 0; i < subject.size(); i++) {

			System.out.print(subject.get(i) + ", ");
		}
		subject.remove();
		System.out.println();
		System.out.print("3���� ���躻 �� ���� ����: ");

		for (int i = 0; i < subject.size(); i++) {

			System.out.print(subject.get(i) + " ");
		}
	}
}
