package 컬랙션;

import java.util.HashSet;

public class 해쉬연습 {
	public static void main(String[] args) {

		HashSet bag = new HashSet();
		
		bag.add("디자이너");
		bag.add("프로그래머");
		bag.add("DB관리자");
		bag.add("프로그래머");
		
		System.out.println(bag.size());
		System.out.println(bag);
	}
}
