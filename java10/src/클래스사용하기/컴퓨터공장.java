package 클래스사용하기;

import 클래스만들기.컴퓨터;

public class 컴퓨터공장 {

	public static void main(String[] args) {

		// 객체생성시 같은 패키지내에서 일단 찾음
		// 없으면 다른 패키지에서 찾게 됨.
		// 다른 패키지에 있는 객체를 사용하는 경우는
		// import로 경로를 명시해주어야 한다.

		컴퓨터 com1 = new 컴퓨터();
		com1.price = 100;
		com1.company = "apple";
		com1.size = 30;
		System.out.println("com1의 가격은 " + com1.price);
		System.out.println("com1의 회사는 " + com1.company);
		System.out.println("com1의 모니터크기 " + com1.size);
		System.out.println(com1);
		컴퓨터 com2 = new 컴퓨터();
		com2.price = 200;
		com2.company = "banana";
		com2.size = 20;
		System.out.println("com2의 가격은 " + com2.price);
		System.out.println("com2의 회사는 " + com2.company);
		System.out.println("com2의 모니터크기 " + com2.size);
		System.out.println(com2);

	}

}
