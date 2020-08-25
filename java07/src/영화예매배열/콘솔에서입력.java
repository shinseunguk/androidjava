package 영화예매배열;

import java.util.Scanner;

public class 콘솔에서입력 {

	public static void main(String[] args) {
		// 콘솔에서 입력 :
		// 모든 입력의 데이터 타입은 String

		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력>> ");
		String a = scan.nextLine();
		System.out.println("이름: " + a);

		System.out.println("나이릅 입력 >>");
		int y = scan.nextInt();
		System.out.println("내년 나이는" + (y + 1) + "세");
		System.out.println("현재키 입력 >>");
		double i = scan.nextDouble();
		System.out.println("내년키 :" + (i + 20));
		System.out.println("밖에 비가 오나요 ?  true / false");
		boolean x = scan.nextBoolean();
		if (x) {
			System.out.println("우산을 가지고 가자");
		} else {
			System.out.println("우산을 놓고 가자");

			
		}
		System.out.println("당신의 목표는>>");
		scan.nextLine();
		String life = scan.nextLine();
		System.out.println("목표는 "+ life);

	}

}
