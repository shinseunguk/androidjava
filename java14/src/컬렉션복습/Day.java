package 컬렉션복습;

public class Day {

	String doing;
	int time;
	String location;
	static int count; // 전역변수는 자동초기화가 됨 0으로 초기화
	static int sum;
	public Day(String doing, int time, String loaction) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = loaction;
	}
	
	//파라미터를 통해서 만든 멤버변수값을 한꺼번에 출력하고자 하는경우
	//toString()을 재정의
	
	@Override// 재정의, 오버라이드, 오버라이딩
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", loaction=" + location + "]";
	}
	
	
	
	
}
