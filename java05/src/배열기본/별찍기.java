package 배열기본;

public class 별찍기 {

	public static void main(String[] args) {

		
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int a=0;a<5-i;a++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		
		
	}

}
