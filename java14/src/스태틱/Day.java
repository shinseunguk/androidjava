package ����ƽ;

public class Day {

	String doing;
	int time;
	String location;
	static int count; // ���������� �ڵ��ʱ�ȭ�� �� 0���� �ʱ�ȭ
	static int sum;
	static final String company = "mega";
	public Day(String doing, int time, String loaction) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = loaction;
	}
	
	//static �޼��� (���� �޼���) : ��ü�������� �ʾƵ�, �� ����� �ٷ� ��� ����
		//Ŭ���� �̸����� �ٷ� �����ؼ� ����� �� �ִ� �޼���� ����� ���� ����.
		public static String getName() {
			return company;//static�޼��� �������� �ν��Ͻ� ���� ��� �Ұ�
			
		}	
		
		//���� ����ϴ� ����� �޼���� �ٷ� �ٷ� �� �� �ְ� �����δ� ���� ����.
		//Integer.parseInt()
		
		public int getAvg() {
			return sum/count;
			
		}
	
	//�Ķ���͸� ���ؼ� ���� ����������� �Ѳ����� ����ϰ��� �ϴ°��
	//toString()�� ������
	
	@Override// ������, �������̵�, �������̵�
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", loaction=" + location + "]";
	}
	
	
	
	
}
