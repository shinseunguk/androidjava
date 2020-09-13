package 클래스연습;

public class 계산기 {

	//=>맴버변수(전역변수, global변수, 클래스전체영역에서 사용가능)
	
	String color;//참조형(null)
	int price;//기본형(0)
	int size;//기본형(0)
	
	public int 더하다(int a, int b) {
		
		
		return  a + b;
	}
	public int 빼다(int a, int b) {
		
		
		return a-b;
	}
	public int 곱하다(int a, int b) {
		
		return a * b ;
	}
	public int 나누다(int a, int b) {
		
		
		return a / b;
	}
	
}
