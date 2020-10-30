package 클래스;

public abstract class Applecar implements carr{

	public abstract void turnLeft();
	
	
	@Override
	public void drive() {
		System.out.println("운전하다");
	}

	@Override
	public void ride() {
		System.out.println("타다");
	}

	@Override
	public void on() {
		System.out.println("시동걸다");
		
	}

	@Override
	public void music() {
		System.out.println("음악틀다");
	}

	@Override
	public void parking() {
		System.out.println("주차하다");
	}

}
