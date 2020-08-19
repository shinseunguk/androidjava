package 조건문;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class BankSystem2 {

	public static void main(String[] args) {

		int sum = 0;

		System.out.println("----------------");
		System.out.println("은행 입출금 시스템");
		System.out.println("----------------"); 
		
		while (true) {
			 	Scanner scanner = new Scanner(System.in);  
			 	System.out.println("1)입금 2)출금 3)잔고 4)종료"); 
		        int a = scanner.nextInt();  // 스캐너로 입력값을 받아 a에저장

			if (a == 1) { //사용자가 1을 입력했을때
				System.out.println("선택>> " + a);
				Scanner scnaeer = new Scanner(System.in);
				System.out.println("입금액 입력");
				int b = scanner.nextInt(); // 스캐너로 입력값을 받아 b에저장 
				sum += b; // sum(잔고)에 입금하는 시스템
			} 
			else if (a == 2) { //사용자가 2를 입력했을때
				System.out.println("선택>> " + a);
				Scanner scnaeer = new Scanner(System.in);
				System.out.println("입금액 입력");
				int c = scanner.nextInt(); // 스캐너로 입력값을 받아 c에저장 
				sum -= c; // sum(잔고)에 출금하는 시스템

			} else if (a == 3) { //사용자가 3을 입력했을때
				System.out.println("선택>>" + a);
				System.out.println("잔고는 " + sum + "원"); //총 잔고
			} else if (a == 4) { //사용자가 4를 입력했을때
				System.out.println("선택>>" + a);
				System.out.println("시스템을 종료합니다."); 
				break; // while 종료문
			}
		}

	}

}
