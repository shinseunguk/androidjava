package 데이터;

import java.util.Scanner;

public class 기본데이터3 {

	public static void main(String[] args) {

		int a = 3;
		char b = '창';
		boolean c = true;
		boolean f = false;
		double d = 3.14;
		String name = "창";

		System.out.println("숫자를 입력해주세요");
		Scanner scn = new Scanner(System.in);
		int ab = scn.nextInt();

		System.out.println(ab);
		System.out.println("int형데이터 " + a);
		System.out.println("char형데이터 " + b);
		System.out.println("boolean형데이터 " + c);
		System.out.println("double형데이터 " + d);
		System.out.println(name);
		System.out.println(b);

	}

}
