package 拿发记;

import java.util.HashMap;

public class 绊按包府矫胶袍 {

	public static void main(String[] args) {

		HashMap client = new HashMap();
		
		client.put(100, "辫单捞");
		client.put(200, "辫荤傈");
		client.put(300, "辫备炼");
		client.put(400, "辫磊丰");
		System.out.println(client);
		client.remove(200);
		client.put(300, "辫面己");
		
		System.out.println("-----------");
		System.out.println(client);
	}

}
