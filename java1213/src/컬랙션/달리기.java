package 컬랙션;

import java.util.ArrayList;

public class 달리기 {

	public static void main(String[] args) {

		ArrayList run = new ArrayList();
		run.add("박소정");
		run.add("김정민");
		run.add("소지현");
		run.add("김개념");
		
		for (int i = 0; i < run.size(); i++) {
				System.out.println((i+1)+"등 " +run.get(i));
		}
		
		System.out.println("2등 반칙 - > 탈락");
		run.remove(1);
		for (int i = 0; i < run.size(); i++) {
			System.out.println((i+1)+"등 " +run.get(i));
	}
	}

}
