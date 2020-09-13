package 크롤링;

import java.io.FileWriter;

public class 네이버증권UI {

	public static void main(String[] args) {
		//005930 삼성전자 293490 카카오게임즈  019170 신풍제약 253840 수젠텍 047820 초록뱀
		
		String[] codes= {"005930","293490","019170","253840","047820"};
		String[] names= {"삼성전자","카카오게임즈","신풍제약","수젠텍","초록뱀"};
		
		네이버증권크롤링 naver = new 네이버증권크롤링();
		for (int i = 0; i < codes.length; i++) {
			
			String[] result = naver.crawl(codes[i]);
			
			try {
				FileWriter file = new FileWriter(result[0]+".txt");
				file.write(result[0]+"\n"); //이름
				file.write(result[1]+"\n"); // 코드
				file.write(result[2]+"\n"); // 현재가
				file.write(result[3]+"\n"); // 어제와의 차이
				file.write(result[4]+"\n"); // 증감비율
				file.write(result[5]+"\n"); // 전일
				file.write(result[6]+"\n"); // 고가
				file.close();
			} catch (Exception e) {
				System.out.println("파일 저장 중 에러발생함!");
			}
		}
		
		
		
	}

}
