package 제어문;

import javax.swing.JOptionPane;

public class 조건문2score {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog("먹고싶은음식은 ?");
		
		String result="";
		if (a.equals("아이스크림")) {
			result="뚜레주르로 가요";
		} else if (a.equals("아이스커피")) {
			result="이디야로 가요";
		} else {
			result="물";
		}
			System.out.println(result);
	}

}
