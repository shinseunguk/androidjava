package java06;

public class 우리집식구 {

	public static void main(String[] args) {

		String a[] = {"아버지","어머니","형","나","동생"};
		int b[] = {100,88,33,24,10};
		double c[] = {177.5,152.2,190.3,167.7,155.3};
		
		System.out.println("           우리집 식구 정리");
		System.out.println("-----------------------");
		System.out.println("  이름\t"+"나이\t"+"키");
		
		for(int i=0; i<a.length;i++) {
			
			System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]);
		
			
		}
		
		
		
	}

}
