package 상속;

public class CafeCoffee {

	public static void main(String[] args) {

		CoffeeTruck ct = new CoffeeTruck();
		ct.name="커피차";
		ct.color="갈색";
		ct.size= 50;
		ct.coffee = "아메리카노";
		
		
		System.out.println(ct);
		ct.drive();
		ct.ride();
		ct.carry();
		ct.coffee();
		
	}

}
