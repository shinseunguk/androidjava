package 상속;

public class 원더우먼 extends 우먼{

	boolean swim;

	public 원더우먼(String name, int age, String food, boolean swim) {
		super(name, age, food);
		this.swim = swim;
	}

	@Override
	public String toString() {
		return "원더우먼 [swim=" + swim + ", food=" + food + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
