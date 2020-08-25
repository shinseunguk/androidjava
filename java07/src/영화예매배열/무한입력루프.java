package 영화예매배열;

import java.util.Scanner;

public class 무한입력루프 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] seat = new int[10]; // 좌석마다 예매상황을 저장할 공간들
		int count =0;
		while (true) {
			System.out.println("-----------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(i + 1 + "  ");

			}
			System.out.println();
			System.out.println("-----------------------------------");
			for (int i = 0; i < seat.length; i++) {
				System.out.print(seat[i] + "  ");
			}
			System.out.println();
			System.out.println("원하시는 좌석번호를 입력하세요(종료는 -1) : ");
			int seatN = scan.nextInt();
			if(seatN==-1) {
				System.out.println("프로그램 종료!");
				System.out.println("-----------------------------------");
				break;
			}
			
			
			if(seat[seatN-1]==0) {
				seat[seatN-1] =1;
				System.out.println("예약되었습니다.");
				count++;
			}else if (seat[seatN-1]==1) {
				
				System.out.println(seatN+"번 좌석은 이미 예약 되었습니다.");
				System.out.println("다른자리를 선택하세요");
			}
			
			
			

		}
		System.out.println(count+" 좌석 예매 되었습니다. 총 금액 "+count*10000+"원 입니다.");

	}

}
