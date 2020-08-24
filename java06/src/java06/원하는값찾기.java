package java06;

import java.util.Random;

public class 원하는값찾기 {

	public static void main(String[] args) {

		Random r = new Random(2);

		int array[] = new int[1000];

		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(1000);

			System.out.println(i + 1 + "번째 배열의 값은 " + array[i]);

		}

		
		
		int target = 100;
		int count = 0;
		for (int i = 0; i < array.length; i++) {

			if (array[i] == target) {
				System.out.println(target + "의 위치는 " + i);
				count++;

			}

		}
		System.out.println("100의 개수는 : " + count);

	}

}
