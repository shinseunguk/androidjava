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
		System.out.println("Ʈ����� ��Ʈ�ѷ� call");
		System.out.println(bbsVO);
		System.out.println(memberVO);
		
		int result = 0; // �������ִ»�Ȳ
		
		try {
			result = service.tran(memberVO, bbsVO);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
			System.out.println("��� ���� ��>>"+ result);
			if(result ==1) {
				model.addAttribute("result", "��� dbó�� ���� commit��");
			}else {
				model.addAttribute("result", "dbó�� �� �������߻�!! rollback��");
			}
			
			
	}

}
