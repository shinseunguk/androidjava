package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("insert.do")
	public void insert(String id, String pw, Model model) {
		System.out.println("�޼������");
		System.out.println("�Է��� id : "+id);
		System.out.println("�Է��� pw : "+pw);
		String result ="�α��� ����";
		if(id.equals("root")&&pw.equals("1234")) {
			result="�α��� ����";
		}
		model.addAttribute("result" ,result);
	}
	
}
