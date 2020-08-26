package 배열연습문제;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {

		int game = 0;
		int comwin = 0;
		int csi = 0;
		int rock = 0;
		int paper = 0;
		int draw = 0;
		
		Scanner sc = new Scanner(System.in); //가위 0 바위1 보2  값받기
		Random r = new Random(); //난수생성
		
		while(true) {
		System.out.println("--------------------------------------");
		System.out.println("-------------Game Start---------------");
		System.out.println("가위 0, 바위1, 보2 중 하나를 입력해주세요.[종료는 4]>>");
		
		int a = sc.nextInt(); 
		int b = r.nextInt(3); // 난수생성 0~2
		System.out.println(b);
		if(a==0 && b==0) {//가위 0 바위1 보2
			System.out.println("나 : 가위");
			System.out.println("컴퓨터 : 가위");
			System.out.println("비겼습니다.")
			;
			draw++; // 비긴횟수 증가
		}else if(a==0 && b==1 ) {
			System.out.println("나 : 가위");
			System.out.println("컴퓨터 : 바위");
			System.out.println("졌습니다.");
			comwin++;// 컴퓨터가 이긴횟수 증가
		}else if(a==0 && b==2) {
			System.out.println("나 : 가위");
			System.out.println("컴퓨터 : 보");
			System.out.println("이겼습니다.");
			csi++;// 가위로 이긴횟수 증가
		}
		
		if(a==1 && b==0) { //가위 0 바위1 보2
			System.out.println("나 : 바위");
			System.out.println("컴퓨터 : 가위");
			System.out.println("이겼습니다.");
			rock++;
		}else if(a==1 && b==1 ) {
			System.out.println("나 : 바위");
			System.out.println("컴퓨터 : 바위");
			System.out.println("비겼습니다.");
			draw++;
		}else if(a==1 && b==2) {
			System.out.println("나 : 바위");
			System.out.println("컴퓨터 : 보");
			System.out.println("졌습니다.");
			comwin++;
		}
		if(a==2 && b==0) { //가위 0 바위1 보2
			System.out.println("나 : 보");
			System.out.println("컴퓨터 : 가위");
			System.out.println("졌습니다.");
			comwin++;
		}else if(a==2 && b==1 ) {
			System.out.println("나 : 보");
			System.out.println("컴퓨터 : 바위");
			System.out.println("이겼습니다.");
			paper++;
		}else if(a==2 && b==2) {
			System.out.println("나 : 보");
			System.out.println("컴퓨터 : 보");
			draw++;
		}
		if(a==4) {
			break;
		}
		
		
		
		
		game++;
		System.out.println("게임 전체 횟수"+ game+"회");
		System.out.println("컴퓨터 전체 승리 횟수"+ comwin+"회");
		System.out.println("나의 가위로 이긴 횟수"+ csi+"회");
		System.out.println("나의 바위로 이긴 횟수"+ rock+"회");
		System.out.println("나의 보로 이긴 횟수"+ paper+"회");
		System.out.println("게임 전체 비긴 횟수"+ draw+"회");
	}//while
		
		
}
}