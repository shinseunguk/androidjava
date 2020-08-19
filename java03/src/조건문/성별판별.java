package 조건문;

import javax.swing.JOptionPane;

public class 성별판별 {

	public static void main(String[] args) {

			String ssn = JOptionPane.showInputDialog("주민번호입력");
			
			
			char gender = ssn.charAt(7);
			String sub = ssn.substring(7);//7
			
			//위치를 가지고 특정한 문자 한개를 추출하면 됨.
			// 위치 = index, 인덱스
			//인덱스는 0 부터 시작
			
			switch (gender) {
			case '1': case '3':
				System.out.println("남자");
				break;

			case '2': case '4':
				System.out.println("여자");
				break;
			default:
				System.out.println("값을 잘못 입력하셨습니다.");
				break;
			}
		
		
			
		
	}

}
