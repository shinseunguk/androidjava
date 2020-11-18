package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AOPController {
	
	@Autowired
	ASiteInterface a;
	@Autowired
	BSiteInterface b;
	@Autowired
	AOPService service;
	
	@RequestMapping("a.do")
	public void aop1() {
		a.person();
	}
	
	@RequestMapping("b.do")
	public void aop2() {
		b.basket();
		b.orderr();
	}
	
	@RequestMapping("aopError.do")
	public void aop3() {
		try {
			service.error();
		} catch (Exception e) {
			
		}
	}

}
