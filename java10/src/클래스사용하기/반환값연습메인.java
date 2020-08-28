package 클래스사용하기;

import java.util.Date;

import DB연결.반환값연습;

public class 반환값연습메인 {

	public static void main(String[] args) {

		반환값연습 p = new 반환값연습();
		Date date = p.add();
		System.out.println(date.getDate());
		System.out.println(date.getHours());

		boolean result = p.add(true);
		System.out.println(result);

		int[] result2 = p.add(100);
		for (int i = 0; i < result2.length; i++) {
			System.out.println(result2[i]);
		}

		double result3 = p.add(55.5, 100);
		System.out.println(result3);

		int result4 = p.add(500, 400);
		System.out.println(result4);

		String result5 = p.add("나는 ", 100);
		System.out.println(result5);

	}

}
