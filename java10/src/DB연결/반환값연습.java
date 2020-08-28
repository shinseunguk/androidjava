package DB연결;

import java.util.Date;
import java.util.Random;

public class 반환값연습 {

	public int add(int x, int y ) {
		return x+y;
	}
	public double add	(double x, int y ) {
		
		return x+y;
	}
	public int[] add(int x) {
		int num[] = {1,2,x};
		
		return num;// 배열에 접근할수있는 주소
	}
	public String add(String x, int y) {
		
		
		return x+y;
	}
	public Date add() {

		Date date = new Date();
		return date;
	}
	public boolean add(boolean x) {
		Random r = new Random();
		return r.nextBoolean();
		
	}
	
	
	
}
