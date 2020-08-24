package java06;

import java.util.Arrays;

public class 최대값찾기 {

	public static void main(String[] args) {

		
		int [] num = {55, 11, 22 ,99, 33};
		
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
//  		이전 까지의 최대값은 max에 들어있음.
//			배열의 인덱스의 값을 하나씩 꺼내서 이전까지의
//			최대값보다 큰지 비교
//			해당 인덱스의 값이 이전까지의 최대값보다 더 크면
//			해당 인덱스의 값을 최대값 변수에 저장
			if(num[i]>max) {
				//11 > 55 false => 55
				//22 > 55 false => 55
				//99 > 55 true => 99
				max = num[i];
				
				System.out.println(max);
			}
			
			
		}
		
		
		
		
		
//		Arrays.sort(num);
//		System.out.println("최솟값 : "+num[0]);
//		System.out.println("중간값 : "+num[2]);
//		System.out.println("최대값 : "+num[4]);
		
		
		
	}

}
