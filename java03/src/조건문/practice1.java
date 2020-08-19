package 조건문;

import java.util.Scanner;

public class practice1 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		int value = 0; // 합, 차 ,곱, 나눗셈 의 계산

		System.out.println("+, -, *, /");

		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0); // 스캐너로 값을받고 char형 으로 변환

		switch (input) {// cpu의 처리과정
		case '+': // +일때
			value = num1 + num2;
			System.out.println(value);
			break;
		case '-': // -일때
			value = num1 - num2;
			System.out.println(value);
			break;
		case '*': // *일때
			value = num1 * num2;
			System.out.println(value);
			break;
		case '/': // /일때
			value = num1 / num2;
			System.out.println(value);
			break;

		default:
			System.out.println("+, -, *, / 가 아닌 다른값을 입력하였습니다.");
			break;
		}

	}

}
