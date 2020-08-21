package 배열기본;

import java.util.jar.Attributes.Name;

import javax.xml.stream.events.Namespace;

public class 배열개념 {

	public static void main(String[] args) {

		int[] jumsu =new int [1000];
		System.out.println(jumsu);
		//int변수 1000개가 모두 이름이 jumsu
		//jumsu를 인덱스(위치값)로 구분
		//첫 번째 jumsu는 index는 0! ->jumsu[0]
		//두 번째 jumsu의 index는 1! =>jumsu[1]
		//마지막 jumsu의 index는 전체개수 -1! => jumsu[전체개수-1]
		//기본형 변수 : 기본형 데이터만 저장된 변수
		// 			=> 기본형 변수는 변수 안에 해당 타입의 값 저장
		
		
		//기본형 데이터가 저장되는변수
		//		1) 기본형 변수: 정수, 실수, 문자, 논리
		//		변수에 해당되는 타입의 "값"이 저장
		// 		배열은 해당되는 타입의 0. false로 자동 초기화
		//		2) 참조형 변수: 기본형 데이터 이외가 저장되는 변수
		//		배열, 클래스 인터페이스 ..
		//		변수에 "주소가"가 저장
		//		배열은 null로 자동 초기화
		
		jumsu[0]= 100;
		jumsu[10]= 200;
		jumsu[999]= 1000;
		System.out.println("1번째 값 : "+ jumsu[0]);
		System.out.println("11번째 값 : "+ jumsu[10]);
		System.out.println("마지막 값 : "+ jumsu[999]);
		System.out.println("500번째 값 : "+ jumsu[499]);
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(i + " : " +jumsu[i]);
			
		}
		
		String[] name = new String[1000];
		System.out.println(name[0]);
		System.out.println(name[name.length-1]);
		
		
		
		
	}

}
