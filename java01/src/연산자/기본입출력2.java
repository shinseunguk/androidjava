package 연산자;

import javax.swing.JOptionPane;

public class 기본입출력2 {
// 두수를 입력받는다
// int형으로 변환
//	+
//	더한 결과값 출력
	public static void main(String[] args) {
		
		int sum;
		
		String a = JOptionPane.showInputDialog("첫번째 수를 입력하시오.");
		String b = JOptionPane.showInputDialog("두번째 수를 입력하시오.");
		
		int a1 = Integer.parseInt(a);
		int b1 = Integer.parseInt(b);
		
		System.out.println("첫번째 수 : "+ a1);
		System.out.println("두번째 수 : "+ b1);
		
		sum = a1 + b1;
		
		System.out.println("더한 결과값 : " + sum);
		
		

	}

}
