package 배열기본;

import java.util.Random;

public class 답안지 {

	public static void main(String[] args) {

		int count =0;
		Random r = new Random();
		int array[] = new int[1000];
		int array1[] = new int[1000];
		String a ="";
		
		for (int i = 0; i < array.length; i++) {
					array[i]=r.nextInt(3);
					array1[i]=r.nextInt(3);
					System.out.println("문항    정답   내답    처리");
					System.out.println("------------------");
					if(array[i]==array1[i]) {
						a = "정답";
						count++;
					}else {
						a = "오답";
					}
						
					System.out.print(i+"   "+array[i]+ "   "+ array1[i]+ "  "+ a);
					System.out.println("");
					System.out.println("");
					
					
					
		}
		System.out.println("총 맞은 갯수는 : "+count);
		
		
		
		
		
	}

}
