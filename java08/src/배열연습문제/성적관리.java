package 배열연습문제;

import java.util.Scanner;

public class 성적관리 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int fMid;
		int fLast;
		int sMid;
		int sLast;
		int all;
		String names[] = new String[20];
		int count[] = new int[20];
		int start = 0;

		while (true) {
			System.out.println();
			System.out.println("성적관리 시스템\n------------------------------------------ \n종료 >> 0입력");
			System.out.println();
			System.out.println("학번 입력");
			System.out.println("------------------------------------------");
			int sNumber = sc.nextInt();
			if (sNumber == 0) { // 프로그램 종료 조건
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("이름 입력"); // 이름 입력
			String name = sc.next();
			if (name == "0") {// 프로그램 종료 조건
				System.out.println("프로그램 종료");
				break;
			}
			System.out.println("--------------------");
			System.out.println("1학기 중간고사 점수 입력");
			fMid = sc.nextInt();
			System.out.println("1학기 기말고사 점수 입력");
			fLast = sc.nextInt();
			System.out.println("2학기 중간고사 점수 입력");
			sMid = sc.nextInt();
			System.out.println("2학기 기말고사 점수 입력");
			sLast = sc.nextInt();

			all = fMid + fLast + sMid + sLast; // 1,2학기 중간 기말 총합

			System.out.println("1학기 중간고사 점수 : " + fMid);
			System.out.println("1학기 중간고사 점수 : " + fLast);
			System.out.println("1학기 중간고사 점수 : " + sMid);
			System.out.println("1학기 중간고사 점수 : " + sLast);

			int first = Math.abs(fMid - fLast);
			int second = Math.abs(sMid - sLast);

			System.out.println("1학기 중간고사, 기말고사 성적차 : " + first);
			System.out.println("2학기 중간고사, 기말고사 성적차 : " + second);

			if (fMid + fLast > sMid + sLast) {
				System.out.println("1학기의 점수가 더높습니다");
			} else if (fMid + fLast < sMid + sLast) {
				System.out.println("2학기의 점수가 더높습니다");
			} else {
				System.out.println("1학기, 2학기 합계가 동일 합니다.");
			}

			count[start] = all; // 점수 배열 에 점수 넣기
			names[start] = name; // 이름 배열 에 이름 넣기
			for (int i = 0; i <= start; i++) {

				System.out.println(names[i] + "의 1~2학기 중간, 기말 최종 합계 점수 :" + count[i]);

			}
			start++;

		}

	}

}
