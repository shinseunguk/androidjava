package com.mega.mvc01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	//2. ��Ʈ�ѷ����� �޾��ְ�
	@RequestMapping("page2.mega")
	public void page2(String id, String pw) {
		System.out.println("�� �޼��尡 �ڵ� ȣ���..");
		System.out.println("��Ʈ�ѷ����� ���� id:"+ id);
		System.out.println("��Ʈ�ѷ����� ���� pw:"+ pw);
		//3. DAO��ü�Ἥ dbó��
		String result="�α��� ����";
	    if(id.equals("root")&& pw.equals("1234")){
	    	result ="�α��� ����";
	    }
		//4. ó������� ������ jsp �������� ����.
	    
	}
	
}
