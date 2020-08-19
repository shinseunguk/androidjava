package 조건문;

import java.util.Scanner;

public class 요일판별 {

	public static void main(String[] args) {

		System.out.println("입력 월은 몇일 까지 있나요?");
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		

		switch (month) {
		case 2:
			System.out.println("28일");
			break;
		case 4: case 6: case 9:case 11:
			System.out.println("30일");
			break;
		default:
			System.out.println("31일");
			break;
		}

	}

}
