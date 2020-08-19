package 조건문;

import java.util.Scanner; 

public class Store {

	public static void main(String[] args) {

		int StickerSum = 0; // 스티커 총금액
		int NoteSum = 0; // 노트 총금액
		int sum = 0; // 총금액

		System.out.println("구매할 스티커 갯수? : ");

		Scanner a = new Scanner(System.in);
		int sticker = a.nextInt();// 스캐너로 스티커 갯수를 받는다.
		System.out.println("스티커 개수: " + sticker);
		System.out.println("");
		System.out.println("스티커 가격 ? : ");

		Scanner b = new Scanner(System.in);
		int stmoney = b.nextInt(); // 스캐너로 스티커의 가격을 받는다.
		System.out.println("스티커 가격: " + stmoney);
		System.out.println("");

		System.out.println("노트 갯수? : ");

		Scanner c = new Scanner(System.in);
		int note = c.nextInt();// 스캐너로 노트의 개수를 받는다.
		System.out.println("노트 개수: " + note);
		System.out.println("");

		System.out.println("노트 가격 ? : ");

		Scanner d = new Scanner(System.in);
		int nomoney = d.nextInt();// 스캐너로 노트의 가격을 받는다.
		System.out.println("노트 가격: " + nomoney);
		System.out.println("");

		StickerSum = sticker * stmoney; //스티커의 갯수 x 스티커의 가격 을 StickerSum에 값을 저장
		NoteSum = note * nomoney;// 노트의 갯수 x 노트의 가격 을 NoteSum에 값을 저장
		sum = StickerSum + NoteSum;// 노트의 총금액 + 스티커의 총금액 = 총금액

		if (sum >= 25000) { // if문을 이용하여 25000원을 넘길시

			sum -= 3000; // 3000원을 할인

		}

		System.out.println("스티커 총 가격" + StickerSum);
		System.out.println("노트 총 가격" + NoteSum);

		System.out.println("-----------------------------------");
		System.out.println("총 결제금액: " + sum + "원(25000원이상이면 3000원 할인)");

	}

}
