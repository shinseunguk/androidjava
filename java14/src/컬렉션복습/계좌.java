package 컬렉션복습;

public class 계좌 {

	String name;//고객이름
	String field; // 계좌종류
	int money; // 금액
	
	//입력값이 없으면서, 클래스이름과 동일한 메서드 => 기본생성자 메서드
	//프로그래머가 메서드를 정의
	//프로그래머가 메서드를 정의하지 않아도, 자동으로 만들어진다
	
	//계좌 객체를 생성할 때, name, field, moeny를 넣지않으면
	//객체를 하지 못하게 해야함
	//세가지의 값을 넣었을 때만 계좌를 개설하도록 정의
	
	//객체 생성후, 멤버변수에 들어가있는 값들을 한꺼번에 확인하고자 하는
	//toString()을 만들자
	
	
	public 계좌() {// 생성자는 반환유무를 명시하지 않음.
		//객체생성시마다, 자동으로 실행해주어야 하는 처리 내용
		//기본 성격이 void인 경우, 보통 생략을 많이 함.
		//초기화시킬 내용이 있으면, 이 메서드에다 처리 내용
		//new를 이용해서 객체생성시 무조건 호출되므로,
		//생성자 메서드(생성자)
		System.out.println("내가 객체 생성시");
	}
	
	public 계좌(String name, String field, int money) {
		super();
		this.name = name;
		this.field = field;
		this.money = money;
	}

	@Override
	public String toString() {
		return "계좌 [name=" + name + ", field=" + field + ", money=" + money + ", getClass()=" + getClass()
		+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
