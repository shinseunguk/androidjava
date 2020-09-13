package 스태틱;

public class 직원 {

	String name; //이름
	String gender; //성별
	int age; // 나이
	static int sumAge; // 총 나이 (전역변수 0으로 자동 초기화)
	static int count; // 직원수
	final static String company = "mega";
	public 직원(String name, String gender, int age) {
		sumAge+=age;
		count++;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "직원 [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
