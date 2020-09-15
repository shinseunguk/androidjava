package 상속;

public class 우먼 extends 사람 {

	String food;

	public 우먼(String name, int age, String food) {
		super(name, age);
		this.food = food;
	}

	@Override
	public String toString() {
		return "우먼 [food=" + food + ", name=" + name + ", age=" + age + "]";
	}
	
	
}
