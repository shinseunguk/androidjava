package 조건문;

import javax.swing.JOptionPane;

public class IfTest3 {

	public static void main(String[] args) {

		int count = 0; //전체횟수
		int x = 0; // 틀린횟수
		

		while (true) {
			count++;//증감연산자, while문이 총 몇번 돌았는지 확인하는 과정
			
			String correct = JOptionPane.showInputDialog("답은?"); //메소드를 이용하여 RAM안 correct에 값을저장
			int correct1 = Integer.parseInt(correct);

			if (correct1 == 88) { // 88을 정답값으로 지정
				System.out.println("정답입니다.");
				System.out.println(x + "번 만에 맞췄습니다."); 
				break;

			} else { // correct1 값이 88이 아닐때
				System.out.println("정답이 아닙니다.");
				if (correct1 < 88) {

					System.out.println("정답 보다 작습니다.");
					x++;//증감연산자
				} else if (correct1 > 88) {
					System.out.println("정답 보다 큽니다.");
					x++;//증감연산자
				}//else if
			}//else
			System.out.println("틀린횟수 : " + x);
			
		}// while
		System.out.println("전체횟수 : "+ count);
	}// main

}// class
