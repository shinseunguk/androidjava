package DB연결;

public class 반환값연습2 {

	public static void main(String[] args) {
		String data = "나는 자바 프로그래머 정말";
		String[] dataset = data.split(" ");
		// Stirng [] dataset = {"나는", "자바", "프로그래머", "정말"}		
		
		System.out.println(dataset.length);
		for (String a : dataset) {
			System.out.println(a);
		}
		
		System.out.println("---------------");
		String data2 = "02-844-1234";
		String[] dataset2 = data2.split("-");
				System.out.println(dataset2.length);
				for (String a : dataset2) {
					System.out.print(a+" ");
				}
	}

}
