package 컬렉션복습;

import java.util.ArrayList;

public class 나의일지 {
	
	public static void main(String[] args) {
		
		Day day1 = new Day("자바공부", 10,"강남");
//		System.out.println(day1);
		Day day2 = new Day("여행", 15,"강원도");
//		System.out.println(day2);
		Day day3 = new Day("운동", 11,"피트니스");
//		System.out.println(day3);

		ArrayList<Day> list = new ArrayList<>();
		list.add(day1);
		list.add(day2);
		list.add(day3);
		
		파일로저장 file = new 파일로저장();
		file.save(list);
		
	}
}
