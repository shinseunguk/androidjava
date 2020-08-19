package 조건문;

public class 피라미드 {

	public static void main(String[] args) {

		int num = 2;

		for (int i = 0; i < 5; i++) {

			for (int j = 1; j < 5 - i; j++) {

				System.out.print(" ");
			}
			for (int k = 0; k < i * 2 + 1; k++) {
				System.out.print("*");
			}

			System.out.println("");

		}

	}

}
