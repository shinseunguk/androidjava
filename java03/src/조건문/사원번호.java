package 조건문;

import javax.swing.JOptionPane;

public class 사원번호 {

	public static void main(String[] args) {

		String number = JOptionPane.showInputDialog("사원번호입력");
		
		char key = number.charAt(0);
		String key2 = number.substring(1, 3);
		//인덱스 1~3범위 추출이면 substring(1,3)
		//endIndex는 3보다 1큰 4를 써주어야 함.
		
		
		
		
		switch (key) {
		case 'A':
			System.out.println("사원부서는 기획부입니다.");
			break;
		case 'B':
			System.out.println("사원부서는 총무부입니다.");
			break;
		case 'C':
			System.out.println("사원부서는 개발부입니다.");
			break;

		default:
			System.out.println("해당부서 없음");
			break;
		}
		
		System.out.println("사원고유 번호는 "+key2+"입니다.");
		
		
		
		
		
		
	}

}
