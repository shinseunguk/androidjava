package dbcp;

public class SingleTonTest {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			ConManager con = ConManager.getInstatnce();
			System.out.println(con);
			con.dbconnet();
		}
			
		}

}
