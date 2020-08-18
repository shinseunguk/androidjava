package 기본입출력;

import javax.swing.JOptionPane;

public class 다이얼로그2 {

	public static void main(String[] args) {

		int sum;
		
		String a = JOptionPane.showInputDialog("첫번째 숫자입력");
		String b = JOptionPane.showInputDialog("두번째 숫자입력");
		
		int a1 =Integer.parseInt(a);
		int b1 =Integer.parseInt(b);
		
		sum = a1 + b1;
		
		System.out.println("두 수의 합은 : "+sum); //1번
		
		System.out.println("------------------");
		
		while(a1<=b1) { // 2번
			
			System.out.println(a1);
			
			a1++;
			
			
		}
		
		System.out.println("------------------");
		
		String d = JOptionPane.showInputDialog("첫번째 숫자입력"); // 3. 첫번째 숫자입력
		String e = JOptionPane.showInputDialog("문자입력"); // 3. 문자입력 받기
		
		int d1 =Integer.parseInt(d); // 3. string 문자열 int 로 변환
		
		
		
		
		
		for(int i=0;i<d1;i++) {
			
			System.out.print(e+" ");
			
		}
		
		
		
		
		
	}

}
