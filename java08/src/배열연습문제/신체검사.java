package 배열연습문제;

import java.util.Random;
import java.util.Scanner;

public class 신체검사 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		long sNumber;
		double height;
		double weight;
		double vision;
		int sick;
		double bmi = 0.0;
		int score = 0;
		int exemption = 0;
		int active = 0;
		System.out.println("신체검사 \n종료는 : 0 입력(아무곳에나)");
		while (true) {

			System.out.println("주민번호 입력 '-' 제외");
			sNumber = sc.nextLong();
			if (sNumber == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("키입력 ");
			height = sc.nextDouble();
			if (height == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("몸무게입력");
			weight = sc.nextDouble();
			if (weight == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("시력입력");
			vision = sc.nextDouble();
			System.out.println("병명 : 1.없음  2.평발  3.고혈압");
			sick = sc.nextInt();
			if (sick == 0) {
				System.out.println("프로그램 종료");
				break;
			}

			bmi = weight / ((height / 100) * (height / 100));

			if (height >= 150 || height <= 190) {

				score += 20;
			}
			if (weight >= 35 || weight <= 100) {

				score += 20;
			}
			if (vision >= 1.0) {
				score += 30;
			} else if (vision >= 0.5) {
				score += 20;
			} else if (vision >= 0.0) {
				score += 10;
			}

			if (sick == 1) {
				score += 30;
			} else if (sick == 2) {
				score += 20;

			} else if (sick == 3) {
				score += 10;
			}

			if (height < 150 || height > 190 || bmi > 30 || vision < 0.0) {
				System.out.println("면제대상 입니다.");
				exemption++;
			} else if (score >= 40) {
				System.out.println("현역입니다.");
				active++;
			} else {
				System.out.println("면제대상 입니다.");
				exemption++;
			}

			System.out.println("당신의 최종스코어" + score);
		} // while
		System.out.println("현역 대상자 " + active + "명");
		System.out.println("면제 대상자 " + exemption + "명");

	}

}
