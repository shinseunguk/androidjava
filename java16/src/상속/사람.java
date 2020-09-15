package 상속;

public class 사람 {
	//멤버변수, 멤버메서드
	String name;
	int age;
	
	
	public  사람(String name, int age) {
		// super(); 
		// object(); 부모의 기본생성자
		this.name = name;
		this.age = age;
		
	}
	public void eat() {
		System.out.println("먹다");
		
	}
	public void sleep() {
		eat();
		System.out.println("자다");
	}

	@Override
	public String toString() {
		return "사람 [name=" + name + ", age=" + age + "]";
	}
	
	
}
