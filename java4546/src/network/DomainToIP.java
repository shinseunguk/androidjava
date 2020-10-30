package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

//domain name: www.naver.com  
//DNS(Domain Name System) ���� ==>ip�ּ�
public class DomainToIP {

	public static void main(String[] args) throws UnknownHostException {
		String domain = "www.naver.com";
		InetAddress ip = InetAddress.getByName(domain);
		
		System.out.println("ip�ּ� : " + ip.getHostAddress());
	}

}
