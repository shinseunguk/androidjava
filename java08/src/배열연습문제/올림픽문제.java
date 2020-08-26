package 배열연습문제;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 올림픽문제 {

	public static void main(String[] args) {

		int korea = 0;
		int china = 0;
		int japan = 0;
		int kGoldMedal = 0;
		int kSilverMedal = 0;
		int kBronzeMedal = 0;
		
		int cGoldMedal = 0;
		int cSilverMedal = 0;
		int cBronzeMedal = 0;
		int jGoldMedal = 0;
		int jSilverMedal = 0;
		int jBronzeMedal = 0;
		int scoreGold = 10;
		int scoreSilver = 6;
		int scoreBronze = 3;
		int count = 0;
		String sport[] = {"피겨","스키","스피드스케이팅","쇼트트랙","스켈레톤"}; 
		Scanner sc = new Scanner(System.in);
		String country[] = { "korea", "china", "japan" };
		int country1[]= new int[3];
		Random r = new Random();


		System.out.println("종료 >> -1");
		while(true) {
			
			
			System.out.println(sport[count]+"의 순위");
			
			for (int i = 0; i < country.length; i++) {
				System.out.println("1.한국  2.중국  3.일본");
				int a =sc.nextInt();
				
				switch (a) {// 한국
				case 1:
					System.out.println("한국은 몇등?");
					int b=sc.nextInt();
					if(b==1) {
					System.out.println("한국 1등");
					kGoldMedal++;
					korea += scoreGold;
				}else if(b==2) {
					System.out.println("한국 2등");
					kSilverMedal++;
					korea += scoreSilver;
				}else if(b==3) {
					System.out.println("한국 3등");
					kBronzeMedal++;
					korea += scoreBronze;
				}
					
					break;
					
				case 2:
					System.out.println("중국은 몇등?");
					int c=sc.nextInt();
					if(c==1) {//중국
						System.out.println("중국 1등");
						cGoldMedal++;
						china += scoreGold;
					}else if(c==2) {
						System.out.println("중국 2등");
						cSilverMedal++;
						china += scoreSilver;
					}else if(c==3) {
						System.out.println("중국 3등");
						cBronzeMedal++;
						china += scoreBronze;
					}
					break;
				case 3:
					System.out.println("일본은 몇등?");
					int d=sc.nextInt();
					if(d==1) {//일본
						System.out.println("일본 1등");
						jGoldMedal++;
						japan += scoreGold;
					}else if(d==2) {
						System.out.println("일본 2등");
						jSilverMedal++;
						japan += scoreSilver;
					}else if(d==3) {
						System.out.println("일본 3등");
						jBronzeMedal++;
						japan += scoreBronze;
					}
				}
					
				
				
				
		}
			
			
			count++;
			if(count==5) {
				System.out.println("프로그램종료");
				break;
			}
		}//while
		System.out.println("한국메달 "+(kGoldMedal+kSilverMedal+kBronzeMedal)+"개");
		System.out.println("중국메달 "+(cGoldMedal+cSilverMedal+cBronzeMedal)+"개");
		System.out.println("일본메달 "+(jGoldMedal+jSilverMedal+jBronzeMedal)+"개");
		
		
		System.out.println(korea);
		System.out.println(china);
		System.out.println(japan);

//		System.out.println("스키 메달은?");
//
//		for (int i = 0; i < country.length; i++) {
//
//			System.out.println(country_copy[i] + " " + (i + 1) + "등 입니다.");
//		}
//
//
//		System.out.println("스피드스케이팅 메달은?");
//
//		for (int i = 0; i < country.length; i++) {
//
//			System.out.println(country_copy[i] + " " + (i + 1) + "등 입니다.");
//		}
//
//		System.out.println("쇼트트랙 메달은?");
//
//		for (int i = 0; i < country.length; i++) {
//
//			System.out.println(country_copy[i] + " " + (i + 1) + "등 입니다.");
//		}
//
//		System.out.println("스켈레톤 메달은?");
//
//		for (int i = 0; i < country.length; i++) {
//
//			System.out.println(country_copy[i] + " " + (i + 1) + "등 입니다.");
//		}

	}

}
