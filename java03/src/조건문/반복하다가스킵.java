package 조건문;

public class 반복하다가스킵 {

	public static void main(String[] args) {

		
		for (int i = 0; i < 100; i++) {
			//3의배수는 프린트를 안하고 싶음
			
			if(i%3==0) {
				continue;
			}
			
			System.out.println(i);
		}
			
		
		
		
	}

}
