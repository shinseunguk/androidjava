package 배열연습문제;

import java.util.Scanner;

public class 이차원배열 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int seat[][] = new int[3][10]; // 2차원배열 선언
		int count = 0; // 예매수 카운트
		String abc = "ABC"; // 

		System.out.println("영화 예매 시스템  ");
		while (true) {

			System.out.println("------------------------------------------------------");
			System.out.println();
			System.out.print("  ");
			for (int i = 0; i < 10; i++) { // for 문을 이용하여 예매 행 출력  1, 2, 3 ....

				System.out.print("   " + (i + 1) + " ");

			}
			System.out.println();

			System.out.println("-------------------------------------------------------");

			for (int j = 0; j < 3; j++) {
				char ch1 = abc.charAt(j);

				System.out.print(ch1);
				for (int i = 0; i < 10; i++) {

					System.out.print("    " + seat[j][i]);
				}
				System.out.println();
			}
			System.out.println("예매할 좌석을 선택하세요");
			System.out.println("몇행 몇열?");
			System.out.println("종료>> -1 입력");
			System.out.println("A열은 : 1  B열은 : 2  C열은 : 3 으로 입력");
			int a = sc.nextInt(); // 행 입력 
			if (a == -1) { // a 에 -1 입력시 시스템 종료
				System.out.println("시스템 종료");
				break;
			}
			int b = sc.nextInt(); // 열 입력
			if (b == -1) { // b 에 -1 입력시 시스템 종료
				System.out.println("시스템 종료");
				break;
			}

			if (seat[a - 1][b - 1] == 0) { // 배열은 [0][0] 부터 시작하기 때문에  a-1, b-1
				System.out.println((a  ) + "행" + (b ) + "열로 예약 되었습니다.");
				seat[a - 1][b - 1] = 1; // 예매 했을시 1로 표현
				count++; // 예매수 카운트
			} else if (seat[a - 1][b - 1] == 1) { // 배열은 [0][0] 부터 시작하기 때문에  a-1, b-1
				System.out.println((a ) + "행" + (b ) + "열은 " + "이미 예약된 자석입니다.");
			}

		} // while

		System.out.println(count + "좌석 예약 완료. 총금액" + count * 10000); // 총 금액
	}

}
