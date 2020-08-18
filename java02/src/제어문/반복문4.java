package 제어문;

public class 반복문4 {

	public static void main(String[] args) {

		int count = 0 ;
		
		for (int i = 0; i < 100; i++) {
			
			if(i%4==0) {
				System.out.println(i);
				count++;
			}
			
		}
		
		
		System.out.println("갯수 : "+count);
	}

}
