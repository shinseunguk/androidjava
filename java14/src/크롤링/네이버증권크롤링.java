package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링 {

	public  String[] crawl(String code ) {
		//005930 삼성전자 293490 카카오게임즈  019170 신풍제약 253840 수젠텍 047820 초록뱀
		//크롤링순서
		//웹사이트에서 정보를 가지고 오는 것
		//단순 : 스크랩핑
		//단순 + @ : 크롤링
		//1. 사이트연결
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.nhn?code="+ code);
		//2. 해당 페이지 다운로드(html)
		String[] result = null;
		try {
			Document doc = con.get();
			Elements list = doc.select(" h2 > a");
//			System.out.println(list);s
			String name = list.get(0).text();
			System.out.println("회사이름 : " + name);
			
			Elements list2 = doc.select("span.code");
			String code2 = list2.get(0).text();
			System.out.println("회사코드 : "+ code2);
			
			Elements list3 = doc.select("div.today");
//			System.out.println(list3);
			Elements list4 = list3.select(".blind");
//			System.out.println(list4);
			String now = list4.get(0).text(); //현재
			String dif = list4.get(1).text(); // 차이
			String rates = list4.get(2).text(); // 증감비율
			System.out.println("현재가 : "+now);
			System.out.println("어제와의 차이 : "+dif);
			System.out.println("증감비율 : "+rates);
			
			
			
			Elements list5 = doc.select("td.first");
			Elements exlist5 = list5.select(".blind");
//			System.out.println(exlist5);
			String before = exlist5.get(0).text(); // 전일
			
			Elements list6 = doc.select("em.no_up");
			Elements exlist6 = list6.select(".blind");
//			System.out.println(exlist6);
			String high = exlist6.get(0).text(); //고가
			
			System.out.println("전일 : "+before);
			System.out.println("고가 : "+high);
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
