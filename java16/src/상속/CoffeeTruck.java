package 상속;

public class CoffeeTruck extends Truck{

	String coffee;
	
	public void coffee() {
		System.out.println("커피를 뽑는다");
		
	}

	@Override
	public String toString() {
		return "CoffeeTruck [coffee=" + coffee + ", color=" + color + ", name=" + name + ", size=" + size + "]";
	}
	
	
}
