package 배열기본;

import java.util.Random;

public class 임의의값 {

	public static void main(String[] args) {

		int array[] = new int[100];
		int sum = 0;
		Random r = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = r.nextInt(100);
			System.out.println(array[i]);

			sum = array[0] + array[99];

		}
		System.out.println("첫번째 배열과 마지막 배열의 합은 "+ sum +"입니다,");
	}

}
