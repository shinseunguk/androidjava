package com.mega.mvc02;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("insert.do")
	public void insert(String id, String pw, Model model) {
		System.out.println("메서드실행");
		System.out.println("입력한 id : "+id);
		System.out.println("입력한 pw : "+pw);
		String result ="로그인 실패";
		if(id.equals("root")&&pw.equals("1234")) {
			result="로그인 성공";
		}
		model.addAttribute("result" ,result);
	}
	
}
