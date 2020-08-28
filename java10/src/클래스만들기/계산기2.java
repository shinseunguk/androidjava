package 클래스만들기;

public class 계산기2 {

	public int add(int a, int b) {
		// x, y변수는 add메서드 지역에서만 쓸 수 있는 지역변수
		// local 변수, 로컬변수
		// 지역변수는 자동초기화 되지 않음.
		// 각 부품의 기능을 정의할 때는 메서드를 쓴다.
		// 메소드의 입력값 잠깐 저장할 용도로 선언된 변수, 메소드의
		// 사용과 처리의 중간ㄷ ㅏ리역할을 변수 : 매개변수(parameter,파라미터)
		int sum = a + b;
		return sum;
	}

	public int minus(int a, int b) {

		int sum;
		sum = a - b;
		return sum;
	}

	public int mul(int a, int b) {
		int sum = a * b;
		return sum;
	}
	

	public int div(int a, int b) {
		
		int sum = a/b;
		return sum;
	}

}
