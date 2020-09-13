package 컬랙션;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {

		
		ArrayList array = new ArrayList();
		
		array.add("박스키");
		array.add("송스키");
		array.add("김스키");
		array.add("정스키");
		
		for(int i = 0;i<array.size();i++) {
			
			System.out.println((i+1)+"등 "+array.get(i));
		}
		System.out.println("-----------------");
		System.out.println("2등 반칙패");
		System.out.println("-----------------");
		array.remove(1);
		
		for(int i = 0;i<array.size();i++) {
			
			System.out.println((i+1)+"등 "+array.get(i));
		}
		
		
		
	}

}
