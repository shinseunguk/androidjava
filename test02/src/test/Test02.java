package test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int money1= 0;  // money1 ~ money5  변수 초기화 
		int money2= 0;
		int money3= 0;
		int money4= 0;
		int money5= 0;
		String client1 = null; // client1 ~ client5 변수 초기화
		String client2 = null;
		String client3 = null;
		String client4 = null;
		String client5 = null;
		
		while (true) { // 무한루프로 사용자가 종료를 원할때까지 코드반복
			System.out.println("-----------------------------------");
			System.out.println("1.입력, 2.출력, 3.수정, 4.정리, 5.종료"); // 기능을 고르는과정
			int number = sc.nextInt(); //switch문  위 기능들중 하나를 고르는 과정
			switch (number) { // switch문  위 기능들중 하나를 고르는 과정

			case 1: // 입금
				System.out.println("----------------");
				System.out.println("입금");
				System.out.println("----------------");
				
					System.out.println("입금자 이름 : ");
					client1 = sc.next();
					System.out.println("예금액 : ");
					money1 = sc.nextInt();
					System.out.println("입금자 이름 : ");
					client2 = sc.next();
					System.out.println("예금액 : ");
					money2 = sc.nextInt();
					System.out.println("입금자 이름 : ");
					client3 = sc.next();
					System.out.println("예금액 : ");
					money3 = sc.nextInt();
					System.out.println("입금자 이름 : ");
					client4 = sc.next();
					System.out.println("예금액 : ");
					money4 = sc.nextInt();
					System.out.println("입금자 이름 : ");
					client5 = sc.next();
					System.out.println("예금액 : ");
					money5 = sc.nextInt();
				// 여기까지 입금자명, 예금액 입력
				break;
				
			case 2 : // 출력하는 과정
				System.out.println("----------------");
				System.out.println("출력");
				System.out.println("----------------");
				System.out.println("입금자 이름: "+client1 +", 예금액 : "+money1);
				System.out.println("입금자 이름: "+client2 +", 예금액 : "+money2);
				System.out.println("입금자 이름: "+client3 +", 예금액 : "+money3);
				System.out.println("입금자 이름: "+client4 +", 예금액 : "+money4);
				System.out.println("입금자 이름: "+client5 +", 예금액 : "+money5);
				break;
				
			case 3 ://금액 수정 구문
				System.out.println("----------------");
				System.out.println("수정");
				System.out.println("----------------");
				System.out.println("입금자명을 입력하세요");
				String a = sc.next(); // 입금자명을 입력하는 구문
				if(client1.equals(a)){ // 전에 입력한 입금자명과 위에 입력한 입금자명이 동일한지 확인하는 코드
					System.out.println(client1+"의 현재 입금액:"+ money1);
					System.out.println("수정할 입금액 : ");
					money1=sc.nextInt(); //기존에 있던 money1이 sc.nextInt()로 수정되는부분
				}else if (client2.equals(a)) { // 전에 입력한 입금자명과 위에 입력한 입금자명이 동일한지 확인하는 코드
					System.out.println(client2+"의 현재 입금액:"+ money2);
					System.out.println("수정할 입금액 : ");
					money2=sc.nextInt(); //기존에 있던 money2이 sc.nextInt()로 수정되는부분
				}else if (client3.equals(a)) { // 전에 입력한 입금자명과 위에 입력한 입금자명이 동일한지 확인하는 코드
					System.out.println(client3+"의 현재 입금액:"+ money3);
					System.out.println("수정할 입금액 : ");
					money3=sc.nextInt(); //기존에 있던 money3이 sc.nextInt()로 수정되는부분
				}else if (client4.equals(a)) { // 전에 입력한 입금자명과 위에 입력한 입금자명이 동일한지 확인하는 코드
					System.out.println(client4+"의 현재 입금액:"+ money4);
					System.out.println("수정할 입금액 : ");
					money4=sc.nextInt(); //기존에 있던 money4이 sc.nextInt()로 수정되는부분
				}else if (client5.equals(a)) { // 전에 입력한 입금자명과 위에 입력한 입금자명이 동일한지 확인하는 코드
					System.out.println(client5+"의 현재 입금액:"+ money5);
					System.out.println("수정할 입금액 : ");
					money5=sc.nextInt(); //기존에 있던 money5이 sc.nextInt()로 수정되는부분
				}else{// 입금자명이 동일하지않을때
					System.out.println("입금자명이 동일하지 않습니다."); 
				}
				break;
				
			case 4: //int numebr가 4일때
				System.out.println("----------------");
				System.out.println("정리");
				System.out.println("----------------");
				int sum = money1+money2+money3+money4+money5; // 총합계
				int avg = sum / 5; // 총평균
				System.out.println("입금액 합계 : "+sum);
				System.out.println("입금액 평군 : "+avg);
				break;
				
			case 5://int numebr가 5일때
				System.out.println("프로그램 종료");
				System.exit(0); // 프로그램 종료 구문
				break;
			}//switch

		}//while

	}//main

}//class
