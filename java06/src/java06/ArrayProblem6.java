package java06;

import java.util.Random;

public class ArrayProblem6 {

	public static void main(String[] args) {

		
		int[] num6 = {66,77,88,99};
		int imsi = num6[0];
		num6[0] = num6[3];
		num6[3] = imsi;
		
		for (int x : num6) {
			System.out.println(x + " ");
		}
		
	}

}
