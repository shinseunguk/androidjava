package 조건문;

public class 별찍기 {

	public static void main(String[] args) {

		
		for(int a=1;a<=5;a++) { // 초깃값 , 조건식, 증감값 조건이 맞다면 안쪽 for문 실행
			for(int b=1;b<=a;b++) { // 초깃값 , 조건식, 증감값 
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		for (int i=1;i<=4;i++) { // 초깃값 , 조건식, 증감값 조건이 맞다면 안쪽 for문 실행
			for(int j=i;j<=4;j++) { // 초깃값 , 조건식, 증감값 
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}

}
