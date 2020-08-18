package 연산자;

public class 기본형형변환2 {

	public static void main(String[] args) {

		
	byte x = 100;
	int y = x; //자동형변환
	
	System.out.println(y);
	
//	int a = 300;   형변환 하는 byte 의 범위가 -128 ~ 127 까지 이기 때문
//	byte b= a;
	
	
	
	double i = 400;
	int j = (int)i;
	
	System.out.println(j);
	
	int t = 400;
	double o = t; //자동형변환
	
	System.out.println(o);
		
		
		
		
	}

}
