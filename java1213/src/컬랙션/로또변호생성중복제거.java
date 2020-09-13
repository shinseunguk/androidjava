package 컬랙션;

import java.util.HashSet;
import java.util.Random;

public class 로또변호생성중복제거 {

	public static void main(String[] args) {

		Random r = new Random();

		HashSet hash = new HashSet();

		while (true) {

			hash.add(r.nextInt(45) + 1);
			if (hash.size() == 6) {
				break;
			}
		}
		System.out.println(hash);

	}

}
