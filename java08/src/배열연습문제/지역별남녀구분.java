package 배열연습문제;

import java.util.Random;

public class 지역별남녀구분 {

	public static void main(String[] args) {

		Random r = new Random();
		int hNumber[] = new int[100];
		int human[] = new int[100];
		int area[] = new int[100];
		int seoul = 0;
		int busan = 0;
		int jeju = 0;
		int etc = 0;
		int sMan = 0;
		int sWoman = 0;
		int bMan = 0;
		int bWoman = 0;
		int jMan = 0;
		int jWoman = 0;
		int eMan = 0;
		int eWoman = 0;

		for (int i = 0; i < hNumber.length; i++) {

			hNumber[i] = r.nextInt(4000000) + 1000000; // 1000000~4999999 난수 생성
			human[i] = hNumber[i] / 1000000; // 몫구하여 이용한 주민번호 앞자리 
			area[i] = (hNumber[i] % 1000000) / 100000; // 나머지와 몫을 이용한 주민번호 둘째자리 

			if (area[i] == 1) { // 지역이 서울일때
				seoul++; // 증감연산자 서울 +1
				if (human[i] == 1 || human[i] == 3) { //지역이 서울이고 주민번호 앞자리가 1,3 일때
					sMan++;// 서울 남자 +1
				} else if (human[i] == 2 || human[i] == 4) {//지역이 서울이고 주민번호 앞자리가 2,4 일때
					sWoman++;// 서울 여자 +1
				}
			} else if (area[i] == 2) { // 지역이 부산일때
				busan++;//증감연산자 부산 +1
				if (human[i] == 1 || human[i] == 3) {//지역이 부산이고 주민번호 앞자리가 1,3 일때
					bMan++; //부산 남자 +1
				} else if (human[i] == 2 || human[i] == 4) {//지역이 부산이고 주민번호 앞자리가 2,4 일때
					bWoman++;//부산 여자 +1
				}
			} else if (area[i] == 3) {// 지역이 제주일때
				jeju++;//증감연산자 제주 +1
				if (human[i] == 1 || human[i] == 3) {//지역이 제주고 주민번호 앞자리가 1,3 일때
					jMan++;//제주 남자 +1
				} else if (human[i] == 2 || human[i] == 4) {//지역이 제주고 주민번호 앞자리가 2,4 일때
					jWoman++;//제주 여자 +1
				}
			} else if (area[i] == 4) {// 지역이 기타일때
				etc++;//증감연산자 제주 +1
				if (human[i] == 1 || human[i] == 3) {//지역이 제주고 주민번호 앞자리가 1,3 일때
					eMan++;//제주 남자 +1
				} else if (human[i] == 2 || human[i] == 4) {//지역이 제주고 주민번호 앞자리가 2,4 일때
					eWoman++;//제주 여자 +1
				}
			}

		}
		System.out.println("서울지역" + seoul + "명 중 남자는" + sMan + "명, 여자는 " + sWoman + "명 입니다.");
		System.out.println("부산지역" + busan + "명 중 남자는" + bMan + "명, 여자는 " + bWoman + "명 입니다.");
		System.out.println("제주지역" + jeju + "명 중 남자는" + jMan + "명, 여자는 " + jWoman + "명 입니다.");
		System.out.println("기타지역" + etc + "명 중 남자는" + eMan + "명, 여자는 " + eWoman + "명 입니다.");

	}

}
