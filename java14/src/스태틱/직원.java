package ����ƽ;

public class ���� {

	String name; //�̸�
	String gender; //����
	int age; // ����
	static int sumAge; // �� ���� (�������� 0���� �ڵ� �ʱ�ȭ)
	static int count; // ������
	final static String company = "mega";
	public ����(String name, String gender, int age) {
		sumAge+=age;
		count++;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "���� [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
