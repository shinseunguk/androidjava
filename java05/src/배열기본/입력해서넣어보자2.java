package 배열기본;

import java.util.Random;

import javax.swing.JOptionPane;

public class 입력해서넣어보자2 {

	public static void main(String[] args) {
		// 입력을 받아서, 저장공간에 넣어 scanner
		// 나중에 꺼내서 연산이나 출력을 하고자 하는 경우

//		String data = null; //참조형은 null로 초기화 시켜줘라
		Random r = new Random(); //아무거나 만들어주는 클래스 
		
		int data[] = new int[100000];
		
		for (int i = 0; i < 100000; i++) {
			// 변수 선언의 위치가 변수를 사용할 수 있는 범위(지역)을 결정!
			data[i]= r.nextInt(100);
			
		}
		for (int x : data) {
			System.out.println(x);
		}

	}

}
