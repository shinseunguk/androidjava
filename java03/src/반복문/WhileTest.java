package 반복문;

import javax.swing.JOptionPane;

public class WhileTest {

	public static void main(String[] args) {

		//계속 반복하고자 하는경우
		while(true) {
			
			System.out.println("돈다");
			
			String choice = JOptionPane.showInputDialog("계속하실래요? y)yes or n)no ");
			if (choice.equals("n") || choice.equals("no") ) {
				System.out.println("루프 종료");
				System.exit(0);
//				break;
			}
			
		}
//		
		
//		int i = 0; // 시작값
//		while(i<10) { // 조건식
//			
//			System.out.println(i); // 실행내용
//			i++;
//		}
		
		
	}

}
