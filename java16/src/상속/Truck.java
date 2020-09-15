package 상속;

public class Truck extends Car {

	String color;
	
	public void carry() {
		System.out.println("물건을 나르다");
		
	}

	@Override
	public String toString() {
		return "Truck [color=" + color + ", name=" + name + ", size=" + size + "]";
	}
	
	
}
