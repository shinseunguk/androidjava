package com.mega.mvc06;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsController {

	@Autowired
	BbsService service;
	
	@RequestMapping("delete.do")
	public void delete() {
		//dbó���ϰ�
		
	}
	
		
	
	@RequestMapping("update.do")
	public void update(Model model) {
		String text = "��� �Դϴ�.";
		//db�˻��ؼ� ������ �´�
		//�˻��� ����� views�� �ִ� update.jsp�� �Ѱܾ� ��.
		model.addAttribute("result", text);
	}
	
	
	@RequestMapping("insert1.do")
	public void insert(BbsVO bbsVO, HttpSession session) {
		//�Է°����� vo�� �����ϴ� ���
		//1) ��ü����: prototype���
		//2) input name�Ӽ��� ������ set�޼��带 �ڵ����� ȣ��
		//3) �����̸��� Ŭ�����̸��� ù���ڸ� �ҹ��ڷ� �����ϴ� ���
		//   �ڵ����� vo�� model�� �Ӽ����� ����
		//	 views�� �Ʒ� jsp���Ͽ��� model�Ӽ����� ���� ���� ����.
		
		System.out.println(bbsVO.getNo());
		System.out.println(bbsVO.getTitle());
		System.out.println(bbsVO.getContent());
		System.out.println(bbsVO.getWriter());
		
		//model�� �ѹ��� request�� response�� �ϰ� �������.
		//�������� request���� Ư���� ���� �����ϰ� ����ϰ� ������
		//session���� �����ؾ� �Ѵ�.
		session.setAttribute("bbsVO2", bbsVO);
		
		
		
	}
	
}
