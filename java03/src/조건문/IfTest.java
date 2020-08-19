package 조건문;

import javax.swing.JOptionPane;

public class IfTest {

	public static void main(String[] args) {
		
		//누적시키는 변수는 반복문안에 넣으면 안됨.
		//반복할 때마다 누적되지 않고, 초기화 되기 때문에.
		
		int OkCount = 0; 
		int NoCount = 0;
		int EtcCount = 0;
		
		for (int i=0 ;i<5;i++) { // 5번 반복 CPU처리
			String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타");
			if (data.equals("ok")) {
				System.out.println("긍정");
				OkCount++; //증감연산자
			} else if (data.equals("no")) {
				System.out.println("부정");
				NoCount++; //증감연산자
			} else {
				System.out.println("잘모르겠음");
				EtcCount++; //증감연산자
			}// else문 종료
			
			
		}// for문 종료
		System.out.println("ok 횟수 : "+OkCount);
		System.out.println("no 횟수 : "+NoCount);
		System.out.println("기타 횟수 : "+EtcCount);

	}// main 

}// class 
