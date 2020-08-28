package 클래스사용하기;

import 클래스만들기.계산기;

public class 집에서계산기사용 {

	public static void main(String[] args) {
		
		int n1 = 30;
		int n2 = 15;
		
		계산기 cal = new 계산기();
		int aSum = cal.add(n1,n2);
		int mSum = cal.minus(n1, n2);
		
		System.out.println(aSum);
		
		
		
	}

}
