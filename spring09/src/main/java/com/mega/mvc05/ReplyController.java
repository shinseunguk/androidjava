package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReplyController {
	
	@Autowired
	ReplyService service;
	//������ ����(di)�� ���� ReplyServiceŬ������
	//�̱��� ��ü�� �ִ��� ã�Ƽ�, �� �ּҸ� ����
	//"Ŭ������ Ÿ��"�� ������ ����
	
	@RequestMapping("create.do")
	public String create(ReplyVO replyVO) {
		int result = service.create(replyVO);
		if(result==1) {
			return "ok";
		}else {
			return "fail";
		}
	}
	@RequestMapping("list.do")
	public void list(int original, Model model) {
		model.addAttribute("list", service.list(original));
	}
	@RequestMapping(value="delete3.do", method=RequestMethod.GET)
	public String delete(ReplyVO replyVO) {
		int result = service.delete(replyVO);
		if(result == 1) {
			//response.sendRedirect("one.do?no="+replyVO.getOriginal());
			return "redirect:one.do?no="+replyVO.getOriginal(); 
		}else {
			return "fail";// views/fail.jsp
		}
	}

}
