package 배열기본;

import java.util.Random;

public class 아무값중50보다큰값찾아보자 {

	public static void main(String[] args) {
		int count = 0;
		Random r = new Random();
		int array[] = new int[1000];
		
		for(int i=0;i<array.length;i++) {
			
			array[i]=r.nextInt(100);
			
			if(array[i]>=50) {
				System.out.println(i+" : "+array[i]);
				count++;
			}
		}
		System.out.println("50보다 큰 갯수 : "+count);
		
		
		
		
		
		
	}

}
