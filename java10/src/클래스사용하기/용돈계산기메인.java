package 클래스사용하기;

import 클래스만들기.용돈계산기;

public class 용돈계산기메인 {

	public static void main(String[] args) {

		용돈계산기 a1 = new 용돈계산기();
		a1.money =100000;
		a1.month = 6;
		a1.wallet = 0;
		int sum1 = a1.mul(a1.month, a1.money);
		if(sum1>500000) {
			a1.wallet += sum1;
			System.out.println("상반기 받은 용돈 금액 "+a1.wallet/10000+"만원");
		}else {
			a1.wallet += a1.add(sum1, 150000);
			System.out.println("상반기 받은 용돈 금액 "+a1.wallet/10000+"만원");
		}

		용돈계산기 a2 = new 용돈계산기();
		a2.money =50000;
		a2.month = 6;
		a2.wallet = 0;
		int sum2 = a2.mul(a2.month, a2.money);
		if(sum2>500000) {
			a2.wallet += sum2;
			System.out.println("하반기 받은 용돈 금액"+a2.wallet/10000+"만원");
		}else {
			a2.wallet += a2.add(sum2, 150000);
			System.out.println("하반기 받은 용돈 금액 "+a2.wallet/10000+"만원");
		}
		
		System.out.println("일년 동안 받은 용돈은 "+((sum1+sum2)/10000)+"만원");
		
		
		
		
	}

}
