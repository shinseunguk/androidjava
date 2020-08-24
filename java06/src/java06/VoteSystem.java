package java06;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class VoteSystem {

	public static void main(String[] args) {

		
		String[] names = {"블랙핑크","유재석","아이유","이효리","비"};
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("투표시스템");
		System.out.println("------------------------------");
		
		int[] 투표수 =  new int[5];
		for(int i =0;i<10; i++) {
			String choice =JOptionPane.showInputDialog("투표");
			int choice2 = Integer.parseInt(choice);
			if(!(choice2<0 || choice2>4)) {
				
				투표수[choice2]++;
			}
			for (int i1 = 0; i1<투표수.length;i1++) {
				System.out.println(1+"번째 "+ "");
			}
		}
		
		
	}

}
