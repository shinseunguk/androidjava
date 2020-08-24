package java06;

public class ArrayProblem5 {

	public static void main(String[] args) {

		
		int num[] = {66,77,88,99};
		int max = num[0];
		
		
		for (int i = 0; i < num.length; i++) {

			if(num[i]>max) {
				
				max = num[i];
				
			}
			
			
		}
		System.out.println("최대값 : " + max);
		
	}

}
