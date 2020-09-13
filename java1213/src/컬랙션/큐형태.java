package 컬랙션;

import java.util.LinkedList;

public class 큐형태 {
	public static void main(String[] args) {
		LinkedList subject = new LinkedList();
		subject.add("국어");
		subject.add("수학");
		subject.add("영어");
		subject.add("컴퓨터");
		System.out.print("전체 시험볼 과목 과목: ");
		for (int i = 0; i < subject.size(); i++) {
			System.out.print(subject.get(i) + ", ");
		}
		subject.remove();
		System.out.println();
		System.out.print("1일차 시험본 후 남은 과목: ");

		for (int i = 0; i < subject.size(); i++) {

			System.out.print(subject.get(i) + ", ");
		}
		subject.remove();
		System.out.println();
		System.out.print("2일차 시험본 후 남은 과목: ");

		for (int i = 0; i < subject.size(); i++) {

			System.out.print(subject.get(i) + ", ");
		}
		subject.remove();
		System.out.println();
		System.out.print("3일차 시험본 후 남은 과목: ");

		for (int i = 0; i < subject.size(); i++) {

			System.out.print(subject.get(i) + " ");
		}
	}
}
