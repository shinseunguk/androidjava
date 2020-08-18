package 제어문;

public class 반복문프린트 {

	public static void main(String[] args) {

		int x = 100; // RAM에 x 값을 100으로 저장

		while (x >= 1) { // CPU의 처리과정 x가 1보다 크거나 같으면 while문 반복

			System.out.println(x); // x를 화면에 출력
			x--; // 출력후 x를 1씩 감소 한 결과를 RAM 의 저장 1보다 크거나 같다면 다시 반복문 실행(CPU 처리과정)

		}
		System.out.println("----------------------------");
		int a = 5; // RAM 에 a 값을 5로 저장

		while (a <= 10) { // CPU 의 처리과정 a가 10보다 작거나 같으면 while문 반복

			System.out.println(a); // a 값을 화면에 출력
			a++; // 출력후 a를 1씩 증가 a++; 은 a = a + 1; 과 같은 결과임. 결과를 RAM 의 저장한다. 10보다 작거나 같다면 다시 반복문
					// 실행(CPU 처리과정)
		}
		System.out.println("----------------------------");

		int i = 1; // RAM에 i 값을 1로 저장

		while (i <= 100) {// CPU 의 처리과정 i가 100보다 작거나 같으면 while문 반복

			System.out.println(i);// 화면에 i값을 출력

			i += 2;// 출력후 i를 2씩 증가 i += 2; 는 i = i+ 2; 와 같은 결과. i+2 값을 다시 i에 저장(RAM 에서 일어나는 과정). i가
					// 100보다 작거나 같다면 다시 반복문 실행(CPU 처리과정)
		}

	}

}
