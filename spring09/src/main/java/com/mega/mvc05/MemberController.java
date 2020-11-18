package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping("insert.do")
	public void create2(MemberVO memberVO) {
		service.create(memberVO);
		System.out.println(memberVO.getId());
		System.out.println(memberVO.getPw());
		System.out.println(memberVO.getName());
		System.out.println(memberVO.getTel());
	}

}
