package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public static void main(String[] args) {
		//ũ�Ѹ�����
		//������Ʈ���� ������ ������ ���� ��
		//�ܼ� : ��ũ����
		//�ܼ� + @ : ũ�Ѹ�
		//1. ����Ʈ����
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010");
		//2. �ش� ������ �ٿ�ε�(html)
		try {
			Document doc = con.get();
//			System.out.println(doc);
//			System.out.println(doc.select("a.nav"));
			Elements list = doc.select("dd > p > a");
			System.out.println(list);
			System.out.println(list.get(0).text());
			//elments == arraylist + @@
//			for (int i = 0; i < list.size(); i++) {
//				Element tag = list.get(i);
//				System.out.println(tag);
//				String text = tag.text();
//				System.out.println(text);
//			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//index.html
		//3. ���ϴ� ��ġ�� ������ �����س�
	}

}
