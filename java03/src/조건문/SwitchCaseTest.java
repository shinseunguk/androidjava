package 조건문;

public class SwitchCaseTest {

	public static void main(String[] args) {

		String food = "알밥";
		
		switch (food) {
		
		case "알밥" :
			System.out.println("분식집");break;
		case "국수" :
			System.out.println("국수집");break;
		case "짜장면" :
			System.out.println("중국집");break;
		case "냉면" :
			System.out.println("일식집");break;
		default:
			System.out.println("아무데나");break;
		
		
		
		
		}
		
		
	}

}
