package 스태틱;

public class 창업 {

	public static void main(String[] args) {

		직원 em1 = new 직원("홍길동", "남자", 20);
		System.out.println("고용한 직원수 : " + 직원.count + "명");
		직원 em2 = new 직원("김길동", "여자", 22);
		System.out.println("고용한 직원수 : " + 직원.count + "명");
		직원 em3 = new 직원("이길동", "남자", 25);
		System.out.println("고용한 직원수 : " + 직원.count + "명"); // 직원수

		System.out.println("평균 나이 : " + (double) 직원.sumAge / 직원.count); //평균나이 구하기

		System.out.println(em1); //직원 정보 프린트
		System.out.println(em2); //직원 정보 프린트
		System.out.println(em3); //직원 정보 프린트
		System.out.println(em1.getAvg());
		System.out.println();
	}

}
