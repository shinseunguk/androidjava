package 클래스사용하기;

import 클래스만들기.Bbs;

public class BbsMain {

	public static void main(String[] args) {

		Bbs g1 = new Bbs();
		g1.id=1;
		g1.title="java";
		g1.content="fun java";
		g1.writer="park";
		System.out.println(g1.id+", "+g1.title+", "+g1.content+", "+g1.writer);
		g1.write();
		System.out.println();
		Bbs g2 = new Bbs();
		g2.id=2;
		g2.title="jsp";
		g2.content="fun jsp";
		g2.writer="kim";
		System.out.println(g2.id+", "+g2.title+", "+g2.content+", "+g2.writer);
		g2.delete();
		
		
	}

}
