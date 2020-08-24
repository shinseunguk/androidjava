package java06;

public class 과목별점수 {

	public static void main(String[] args) {

		String a1[] = { "국어", "수학", "과학", "컴퓨터", "영어" };
		int a[] = { 100, 99, 44, 87, 66 };
		int a2[] = a.clone();
		int sum1 = 0;
		int sum2 = 0;
		int avg1 = 0;
		int avg2 = 0;
		int count = 0;
		String bc = "";
		String c;
		a2[2] = 88;//두번째배
		a2[4] = 55;

		for (int i = 0; i < a2.length; i++) {

			sum1 += a[i];
			sum2 += a2[i];

			avg1 = sum1 / 5;
			avg2 = sum2 / 5;

			if (!(a[i] == a2[i])) {
				count++;
			}

		}
		if (avg1 > avg2) {
			c = "첫번째 배열의 평균이 더높다";
		} else if (avg1 < avg2) {
			c = "두번째 배열의 평균이 더높다";
		} else {
			c = "두 배열의 평균이 같다";
		}

		System.out.println("1학기 점수");
		System.out.println("국어\t수학\t과학\t컴퓨터\t영어");
		System.out.print(a[0] + "\t" + a[1] + "\t" + a[2] + "\t" + a[3] + "\t" + a[4] + "\t");
		System.out.println("");
		System.out.println("");
		System.out.println("2학기 점수");
		System.out.print(a2[0] + "\t" + a2[1] + "\t" + a2[2] + "\t" + a2[3] + "\t" + a2[4] + "\t");
		System.out.println("");
		System.out.println("점수가 변경된 과목의 수는? " + count);
		System.out.println("첫번째 배열의 평균 : " + avg1);
		System.out.println("두번째 배열의 평균 : " + avg2);
		System.out.println("두 배열의 평균중  높은 평균의 배열 :" + c);
		System.out.print("점수가 변경된 과목명은 : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] != a2[i]) {

				bc = a1[i];
				System.out.print(bc + " ");
			}

		}

	}

}
