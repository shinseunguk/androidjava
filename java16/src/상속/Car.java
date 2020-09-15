package 상속;

public class Car {

	String name;
	int size;
	
	public void ride() {
		System.out.println("타다");
		
	}
	public void drive() {
		System.out.println("운전하다");
		
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", size=" + size + "]";
	}
	
	
}
