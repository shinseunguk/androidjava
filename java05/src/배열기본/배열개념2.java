package 배열기본;

public class 배열개념2 {

	public static void main(String[] args) {

//		배열은 일반적으로 같은 타입을 묶을 때 사용
//		다양한 타입을 묶을 때는 배열을 쓰지 않음
//		배열은 고정되니 크기를 가진다.
		
		int[] weather = new int[7];
		weather[0] = 36;
		weather[1] = 35;
		weather[2] = 34;
		weather[3] = 33;
		weather[4] = 32;
		weather[5] = 31;
		weather[6] = 30;
		
		
		for (int i = 0; i < weather.length; i++) {
			
			if(i==0) {
				String a = "월요일";
				System.out.println(a+" 온도는 "+weather[i]+"도");
			}
			else if(i==2) {
				String a = "화요일";
				System.out.println(a+" 온도는 "+weather[i]+"도");
			}
			else if(i==3) {
				String a = "수요일";
				System.out.println(a+" 온도는 "+weather[i]+"도");
			}
			else if(i==4) {
				String a = "목요일";
				System.out.println(a+" 온도는 "+weather[i]+"도");
			}
			else if(i==5) {
				String a = "금요일";
				System.out.println(a+" 온도는 "+weather[i]+"도");
			}
			else if(i==6) {
				String a = "토요일";
				System.out.println(a+" 온도는 "+weather[i]+"도");
			}
			else if(i==7) {
				String a = "일요일";
				System.out.println(a+" 온도는 "+weather[i]+"도");
				
			}
			
			
		}

	}

}
