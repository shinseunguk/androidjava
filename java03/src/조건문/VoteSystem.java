package 조건문;

import java.util.Scanner;

public class VoteSystem {

	public static void main(String[] args) {

		System.out.println("투표시스템(무한 루프)");
		System.out.println("---------------");
		System.out.println("인기투표 선택해주세요  1:아이유, 2:유재석, 3:방탄, 4:종료");

		int iu = 0; //아이유의 득표수를 0으로 초기화
		int you = 0; //유재석의 득표수를 0으로 초기화
		int army = 0; //방탄의 득표수를 0으로 초기화

		while (true) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt(); //스캐너로 값을 받아 a에 저장

			if (a == 1) {// 아이유를 투표했을때
				System.out.println("아이유를 투표했습니다.");
				iu++; // 증감연산자
			} else if (a == 2) { // 유재석을 투표
				System.out.println("유재석을 투표했습니다.");
				you++; // 증감연산자
			} else if (a == 3) {// 방탄을투표
				System.out.println("방탄을 투표했습니다.");
				army++; // 증감연산자

			} else if (a == 4) { //투표종료
				System.out.println("투표를 종료합니다.");
				break; //while문 종료
			} else {
				System.out.println("잘못된 입력입니다.");
			} // else

		} // while
		System.out.println("아이유 득표수 : " + iu);
		System.out.println("유재석 득표수 : " + you);
		System.out.println("방탄 득표수 : " + army);

	}// main

}// class
