package 스태틱;

public class Day {

	String doing;
	int time;
	String location;
	static int count; // 전역변수는 자동초기화가 됨 0으로 초기화
	static int sum;
	static final String company = "mega";
	public Day(String doing, int time, String loaction) {
		count++;
		sum = sum + time;
		this.doing = doing;
		this.time = time;
		this.location = loaction;
	}
	
	//static 메서드 (정적 메서드) : 객체생성하지 않아도, 이 기능을 바로 사용 가능
		//클래스 이름으로 바로 접근해서 사용할 수 있는 메서드로 만드는 것이 좋다.
		public static String getName() {
			return company;//static메서드 내에서는 인스턴스 변수 사용 불가
			
		}	
		
		//자주 사용하는 기능의 메서드는 바로 바로 쓸 수 있게 만들어두는 것이 좋다.
		//Integer.parseInt()
		
		public int getAvg() {
			return sum/count;
			
		}
	
	//파라미터를 통해서 만든 멤버변수값을 한꺼번에 출력하고자 하는경우
	//toString()을 재정의
	
	@Override// 재정의, 오버라이드, 오버라이딩
	public String toString() {
		return "Day [doing=" + doing + ", time=" + time + ", loaction=" + location + "]";
	}
	
	
	
	
}
