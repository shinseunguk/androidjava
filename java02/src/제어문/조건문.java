package 제어문;

import javax.swing.JOptionPane;

public class 조건문 {

	public static void main(String[] args) {

		
		String b1 = JOptionPane.showInputDialog("점수를입력하세요.");
		int score =Integer.parseInt(b1);
		
		if (score>= 90) {
			System.out.println("A");
		}
		else if (score>= 80) {
			System.out.println("B");
		}
		else if (score>= 70) {
			System.out.println("C");
		}else if(score>= 60) {
			System.out.println("D");
		}else {
			System.out.println("F");
			
		}
		
		
		
		
		
		
	}

}
