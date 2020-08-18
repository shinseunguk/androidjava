package 연산자;

import javax.swing.JOptionPane;

public class 논리연산잔 {

	public static void main(String[] args) {

			
		String 가입id= "root";
		String 가입pw = "pass";
		
		
		String 로그인id = JOptionPane.showInputDialog("아이디 입력");
		String 로그인pw = JOptionPane.showInputDialog("비밀번호 입력");
		if ( 가입id.equals(로그인id)  && 가입pw.equals(로그인pw)) {
			//and연산자, 여러 조건이 모두 true 일 때,
			//전체 논리적인 판단을 true라고 판단하는 경우
			System.out.println("로그인 ok");
		}else {
			System.out.println("로그인 not");
		}
		
	}

}
