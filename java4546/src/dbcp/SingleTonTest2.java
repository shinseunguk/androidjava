package dbcp;

public class SingleTonTest2 {

	public static void main(String[] args) {
		ConManager con = ConManager.getInstatnce();
		System.out.println(con);
		ConManager con2 = ConManager.getInstatnce();
		System.out.println(con2);

	}

}
