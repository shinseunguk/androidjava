package �÷��Ǻ���;

public class ���� {

	String name;//���̸�
	String field; // ��������
	int money; // �ݾ�
	
	//�Է°��� �����鼭, Ŭ�����̸��� ������ �޼��� => �⺻������ �޼���
	//���α׷��Ӱ� �޼��带 ����
	//���α׷��Ӱ� �޼��带 �������� �ʾƵ�, �ڵ����� ���������
	
	//���� ��ü�� ������ ��, name, field, moeny�� ����������
	//��ü�� ���� ���ϰ� �ؾ���
	//�������� ���� �־��� ���� ���¸� �����ϵ��� ����
	
	//��ü ������, ��������� ���ִ� ������ �Ѳ����� Ȯ���ϰ��� �ϴ�
	//toString()�� ������
	
	
	public ����() {// �����ڴ� ��ȯ������ ������� ����.
		//��ü�����ø���, �ڵ����� �������־�� �ϴ� ó�� ����
		//�⺻ ������ void�� ���, ���� ������ ���� ��.
		//�ʱ�ȭ��ų ������ ������, �� �޼��忡�� ó�� ����
		//new�� �̿��ؼ� ��ü������ ������ ȣ��ǹǷ�,
		//������ �޼���(������)
		System.out.println("���� ��ü ������");
	}
	
	public ����(String name, String field, int money) {
		super();
		this.name = name;
		this.field = field;
		this.money = money;
	}

	@Override
	public String toString() {
		return "���� [name=" + name + ", field=" + field + ", money=" + money + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
