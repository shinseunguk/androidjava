package java06;

import java.util.Scanner;

public class DebugTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int avg = 0;
		int jumsu[] = new int[5];

		System.out.println("점수 5번을 입력하시오.");
		
		for (int i = 0; i < jumsu.length; i++) {

			int a = sc.nextInt();
			jumsu[i] = a;

			
			System.out.println(i + 1 + " 번째 점수는" + jumsu[i]);
		}
	
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];

			avg = sum / jumsu.length;
		}
		System.out.println("합계는 " + sum + "입니다.");
		System.out.println("평균은 " + avg + "입니다.");

	}

}
