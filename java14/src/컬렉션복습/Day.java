package �÷��Ǻ���;

public class Day {

	String doing;
	int time;
	String location;
	static int count; // ���������� �ڵ��ʱ�ȭ�� �� 0���� �ʱ�ȭ
	static int sum;
	public Day(String doing, int time, String loaction) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = loaction;
	}
	
	//�Ķ���͸� ���ؼ� ���� ����������� �Ѳ����� ����ϰ��� �ϴ°��
	//toString()�� ������
	
	@Override// ������, �������̵�, �������̵�
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", loaction=" + location + "]";
	}
	
	
	
	
}
