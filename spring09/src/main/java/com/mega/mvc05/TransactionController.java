package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransactionController {
	
	@Autowired
	TransactionService service;
	
	@RequestMapping("transaction.do")
	public void transaction(BbsVO bbsVO, MemberVO memberVO,Model model) {
		System.out.println("트랜잭션 컨트롤러 call");
		System.out.println(bbsVO);
		System.out.println(memberVO);
		
		int result = 0; // 에러가있는상황
		
		try {
			result = service.tran(memberVO, bbsVO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			System.out.println("결과 받은 값>>"+ result);
			if(result ==1) {
				model.addAttribute("result", "모든 db처리 성공 commit됨");
			}else {
				model.addAttribute("result", "db처리 중 에러가발생!! rollback됨");
			}
			
			
	}

}
