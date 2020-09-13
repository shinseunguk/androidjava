package ũ�Ѹ�;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ���̹�����ũ�Ѹ� {

	public  String[] crawl(String code ) {
		//005930 �Ｚ���� 293490 īī��������  019170 ��ǳ���� 253840 ������ 047820 �ʷϹ�
		//ũ�Ѹ�����
		//������Ʈ���� ������ ������ ���� ��
		//�ܼ� : ��ũ����
		//�ܼ� + @ : ũ�Ѹ�
		//1. ����Ʈ����
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+ code);
		//2. �ش� ������ �ٿ�ε�(html)
		String[] result = null;
		try {
			Document doc = con.get();
			Elements list = doc.select(" h2 > a");
//			System.out.println(list);s
			String name = list.get(0).text();
			System.out.println("ȸ���̸� : " + name);
			
			Elements list2 = doc.select("span.code");
			String code2 = list2.get(0).text();
			System.out.println("ȸ���ڵ� : "+ code2);
			
			Elements list3 = doc.select("div.today");
//			System.out.println(list3);
			Elements list4 = list3.select(".blind");
//			System.out.println(list4);
			String now = list4.get(0).text(); //����
			String dif = list4.get(1).text(); // ����
			String rates = list4.get(2).text(); // ��������
			System.out.println("���簡 : "+now);
			System.out.println("�������� ���� : "+dif);
			System.out.println("�������� : "+rates);
			
			
			
			Elements list5 = doc.select("td.first");
			Elements exlist5 = list5.select(".blind");
//			System.out.println(exlist5);
			String before = exlist5.get(0).text(); // ����
			
			Elements list6 = doc.select("em.no_up");
			Elements exlist6 = list6.select(".blind");
//			System.out.println(exlist6);
			String high = exlist6.get(0).text(); //��
			
			System.out.println("���� : "+before);
			System.out.println("�� : "+high);
			System.out.println("------------------");
			
			result = new String[] {name, code2, now,dif, rates,before,high};
			
//			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//index.html
		return result ;
	}//class

}
