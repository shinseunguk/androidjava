package 크롤링;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버메인크롤링 {

	public static void main(String[] args) {
		//크롤링순서
		//웹사이트에서 정보를 가지고 오는 것
		//단순 : 스크랩핑
		//단순 + @ : 크롤링
		//1. 사이트연결
		Connection con = Jsoup.connect("https://movie.naver.com/movie/bi/mi/basic.nhn?code=190010");
		//2. 해당 페이지 다운로드(html)
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
		//3. 원하는 위치의 정보를 추출해냄
	}

}
