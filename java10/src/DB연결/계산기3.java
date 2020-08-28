package DB연결;

public class 계산기3 {

	
	//자바에서는 메서드 이름을 동일하게 쓸 수 있다.
	
	public void add() {
		System.out.println("더하기 기능");
	}
	public void add(int x) {
		
		System.out.println(x);
	}
	public void add(int x, int y) {
		
		System.out.println(x+y);
	}
	public void add(double x, int y) {
		System.out.println(x+y);
	}
	public void add(int x, double y) {
		System.out.println((x+y));
	}
}
