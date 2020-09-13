package 컬렉션복습;

public class 은행 {

	public static void main(String[] args) {
		

		계좌 account1 = new 계좌("홍길동", "정기적금", 1000); 
		// 동적메모리할당 => 객체생성시마다 객체별로 멤버변수가 복사가 되어 변수가 생성
		System.out.println(account1);
		계좌 account2 = new 계좌("김길동", "정기예금", 2000);
		System.out.println(account2); 
		계좌 account3 = new 계좌();
		System.out.println(account3);
	}

}
