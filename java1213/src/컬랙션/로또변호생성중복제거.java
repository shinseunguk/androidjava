package �÷���;

import java.util.HashSet;
import java.util.Random;

public class �ζǺ�ȣ�����ߺ����� {

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
