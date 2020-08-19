package 조건문;

public class practice2 {

	public static void main(String[] args) {

		//짝수단만 출력
		
		for(int a=1; a<10 ;a++) { //
			if(a%2!=0) { //2로 나워서 0으로 떨어지지 않으면 continue; 
				continue; 
				}
			for(int b=1; b<10;b++) {
				System.out.println(a+" x "+b+" = "+(a*b));
			}
			
		}
		
		
	}//main

}//class
