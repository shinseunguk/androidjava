package 클래스사용하기;
import 클래스만들기.계산기2;
public class 꽃가게 {

	public static void main(String[] args) {
		
		계산기2 cal2 = new 계산기2();
		
		int 화분 = 2;
		int 꽃 = 5;
		cal2.add(화분, 꽃);
		//void형, 반환값이 없는 메서드는 출력할 수 없고, 변수에 넣을 수도 없다.
		System.out.println(cal2.add(화분, 꽃));
		int 화분가격 = 15000;
		int sum = cal2.mul(화분, 화분가격);//2, 15000
		if(sum >= 25000) {
			System.out.println("당신의 결제 금액은" + (sum- 3000)+"원");
		}else {
			System.out.println("당신의 결제 금액은" + (sum)+"원");
		}
		
	}

}
