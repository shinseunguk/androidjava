package �÷���;

import java.util.ArrayList;

import db����.BbsVO;

public class �ƹ��ų������ {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(19);
		list.add("�ڹٰ���");
		list.add(25.5);
		list.add(false);
		list.add(new BbsVO());
		System.out.println(list.size()+"�� �������.");// list�� ������ list.size()
		list.remove(0);
		System.out.println(list.get(0)); //������ ���� get(index)�޼��� ���
		System.out.println(list.get(1));
		
		System.out.println(list.size()+"�� �������.");
		System.out.println(list.get(0));
		list.add(0, "ȫ�浿"); // �߰��� ���� �������� add (����������ġ, ��)�޼���
		System.out.println(list.size()+"�� �������.");
		System.out.println(list.get(0));
		list.set(0, "��浿");// ���� ������ ���� set(��������ġ, ��)�޼��� ���
		System.out.println(list.get(0));
		for (int i=0;i<list.size();i++) {
			System.out.println((i+1)+": "+list.get(i));
		}
		
	}

}
