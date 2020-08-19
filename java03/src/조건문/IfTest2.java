package 조건문;

import javax.swing.JOptionPane;

public class IfTest2 {

	public static void main(String[] args) {

		// 누적시키는 변수는 반복문안에 넣으면 안됨.
		// 반복할 때마다 누적되지 않고, 초기화 되기 때문에.

		int OkCount = 0; // RAM에 OkCount값 초기화
		int NoCount = 0;
		int EtcCount = 0;

		while (true) { // while문, CPU가 처리
			
			String data = JOptionPane.showInputDialog("ok)긍정, no)부정, etc)기타, x)종료"); 
			//메소드를 이용하여 data 값을 키보드로 받아와 저장

			if (data.equals("ok")) {
				System.out.println("긍정");
				OkCount++; //증감연산자
			}
			else if (data.equals("no")) {
				System.out.println("부정");
				NoCount++; //증감연산자
			}
			else if (data.equals("x")) {
				System.out.println("반복문을 종료합니다.");
				break;//반복문(무한루프) 종료
				
			}
			else {
				System.out.println("기타");
				EtcCount++; //증감연산자
			}

		}
		System.out.println("ok 횟수 : "+OkCount); // ok를 입력한 횟수
		System.out.println("no 횟수 : "+NoCount); // no를 입력한 횟수
		System.out.println("기타 횟수 : "+EtcCount); // 기타를 입력한 횟수
		
	}
	


}
