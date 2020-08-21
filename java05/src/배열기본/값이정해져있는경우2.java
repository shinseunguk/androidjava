package 배열기본;

public class 값이정해져있는경우2 {

	public static void main(String[] args) {

		String name[] = { "홍길동","김길동","이길동","박길동","최길동" };
		for (String x : name) {
			System.out.println(x);
			
		}
		int age[] = { 33,22,11,44,55,66 };
		for (int i : age) {
			System.out.println(i);
		}
		char sex[] = { '남','여' };
		for (char c : sex) {
			System.out.println(c);
			
		}
		boolean breakfast[] = { true,false };
		double kg[] = { 52.52,34.34,22.22,11.11,22.22 };

		for(int i=0;i<name.length;i++) {
			
			System.out.print(name[i]+ " ");
			
			
		}
			System.out.println("");
			System.out.println("");
		for(int i=0;i<age.length;i++) {
			
			System.out.print(age[i]+ " ");
			
			
		}
		System.out.println("");
		for(int i=0;i<sex.length;i++) {
			
			System.out.print(sex[i]+ " ");
		}
		System.out.println("");
		for(int i=0;i<breakfast.length;i++) {
			
			System.out.print(breakfast[i]+ " ");
		}
		System.out.println("");
		for(int i=0;i<kg.length;i++) {
			
			System.out.print(kg[i]+ " ");
		}
		System.out.println("");

	}

}
