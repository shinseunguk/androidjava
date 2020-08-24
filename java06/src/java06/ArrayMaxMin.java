package java06;

import java.util.Arrays;
import java.util.Random;

public class ArrayMaxMin {

	public static void main(String[] args) {

		Random r = new Random();
		int[] array = new int[100];
		int max = array[0];
		int min = array[0];
		int maxLocation = 0;
		int count = 0;

		for (int i = 0; i < array.length; i++) {

			array[i] = r.nextInt(1000);

			System.out.println(array[i]);

			if (max < array[i]) {

				max = array[i];

				if (array[i] == max) {

					maxLocation = i;
					count++;
				}
			}
			if (min > array[i]) {

				min = array[i];

			}

		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println(max +"의 위치 는" + maxLocation + "번째 배열");
		System.out.println(max + "의 개수: "+ count);

	}
}
