package java06;

import java.util.Scanner;

public class ArrayProblem4 {

	public static void main(String[] args) {

		int num[]= new int[5];
		
		System.out.println("값을 입력하시오.");
		
		for (int i = 0; i < num.length; i++) {
			
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			
			num[i]=a;
			
			
			
		}
		for (int i = 0; i < num.length; i++) {

			
			System.out.println(i+1+"번째 배열"+num[i]);
			
		}
		
		
		
	}

}
