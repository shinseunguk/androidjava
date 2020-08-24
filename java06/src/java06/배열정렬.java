package java06;

import java.util.Arrays;
import java.util.Iterator;

public class 배열정렬 {

	public static void main(String[] args) {

		int[] age = {99,10,100,88,33,24,10,77};
		//배열 복사할때는 clone()함수 사용!
		//깊은 복사, 배열은 깊은 복사를 해야 한다.
		int[] age2 = age.clone();// cpu 에 클론 
		
		for (int x : age) {
			System.out.print(x + " ");
			
		}
		System.out.println("");
		age2[0]= 999;
		for (int x : age2) {
			System.out.print(x + " ");
		}
		System.out.println("");
		System.out.println("---------------------");
		Arrays.sort(age);
		for (int i : age) {
			System.out.print(i + " ");
		}
		
		}
}
		
	
