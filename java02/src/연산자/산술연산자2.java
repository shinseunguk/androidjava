package 연산자;

public class 산술연산자2 {

	public static void main(String[] args) {

			int x = 200;
			int y = 100;
			
			int sum = x + y;
			//java에서는 int끼리의 계산은 무조건 int
			System.out.println("두 수의 합은 " + sum);
			
			double div = (double)y / x;
			//8byte double <- 4byte int
			//자바에서는 하나라도 double 이면 무조건 double
			//하나만 정수를 실수로 강제로 변환해서 계산시 사용할 수 있다.
			//강제로 타입을 바꾸는 것 : 타입변환(형변환)
			
			System.out.println("두 수의 나눗셈은 "+ div);
		
		
	}

}
