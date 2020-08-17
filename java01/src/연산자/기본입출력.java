package 연산자;

import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class 기본입출력 {

	public static void main(String[] args) {
		// 창을 띄워서 입력을 받자
		// 창을 띄워서 출력을 하자
		// 자주 사용하는 것은 부품의 대문자를 그대로 쓴다 jop + ctrl + spacebar
		String name = JOptionPane.showInputDialog("당신의 이름은"); 
		// name변수값에 JoptionPane으로 데이터 값을 입력한다 
		
		System.out.println("당신의 이름은 " + name); 
		// name변수값 안에 저장된 값을 출력함.
		// RAM 에서 name변수값 을 출력한다, 이때 결합연산자는 CPU가 처리한다.
		
		String age = JOptionPane.showInputDialog("당신의 나이는");
		// age변수값에 JoptionPane으로 데이터 값을 입력한다 ,
		//이때 int 값으로 받지 못하는 이유는 키보드로 입력
		//한 데이터 타입은 무조건 String 으로 받아야함.
		
//		System.out.println("당신의 나이는 " + age);
		
		//키보드로 입력한 데이터 타입은 무조건 String
		//String으로 저장된 데이터를 int/String 쓸지는 내가 결정
		//계산의 유무에 따라 계산해야하는 경우는 int로 변환해주어야 함
		//숫자로 바꿔보자
		
		int age2 = Integer.parseInt(age);
		//현재 age는 String 자료형으로 변수가 저장 되어 있다. 계산하지 않는다면 자료형을 int로 바꿀필요는 없지만 
		//계산을 해야한다면 int자료형 으로 바꿔야함. 
		int lastAge = age2 - 1 ;
		//int자료형으로  바꾼 age2 를 연산후 int자료형 RAM 에 담겨있는 lastAge에 변수저장
		System.out.println("당신의 작년 나이는 " + lastAge);
		//출력
	}

}
