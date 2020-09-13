package 컬랙션;

import java.util.ArrayList;

import db연결.BbsVO;

public class 아무거나묶어보자 {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(19);
		list.add("자바과정");
		list.add(25.5);
		list.add(false);
		list.add(new BbsVO());
		System.out.println(list.size()+"개 들어있음.");// list의 개수는 list.size()
		list.remove(0);
		System.out.println(list.get(0)); //꺼내올 때는 get(index)메서드 사용
		System.out.println(list.get(1));
		
		System.out.println(list.size()+"개 들어있음.");
		System.out.println(list.get(0));
		list.add(0, "홍길동"); // 중간에 끼워 넣을때는 add (끼워넣을위치, 값)메서드
		System.out.println(list.size()+"개 들어있음.");
		System.out.println(list.get(0));
		list.set(0, "김길동");// 값을 변경할 때는 set(변경할위치, 값)메서드 사용
		System.out.println(list.get(0));
		for (int i=0;i<list.size();i++) {
			System.out.println((i+1)+": "+list.get(i));
		}
		
	}

}
