package �÷���;

import java.util.HashMap;

public class �������ý��� {

	public static void main(String[] args) {

		HashMap client = new HashMap();
		
		client.put(100, "�赥��");
		client.put(200, "�����");
		client.put(300, "�豸��");
		client.put(400, "���ڷ�");
		System.out.println(client);
		client.remove(200);
		client.put(300, "���漺");
		
		System.out.println("-----------");
		System.out.println(client);
	}

}
