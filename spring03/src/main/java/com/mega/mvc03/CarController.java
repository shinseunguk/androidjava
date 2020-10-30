package com.mega.mvc03;

//�Ϲ� �ڹ� ���� : POJO(Plain Old Java Object)
//Controller����� ���� Ŭ������ ����� ������, ���!!
//@Controller ������̼��� ����, ���������� �������� ��
// 1) ���
// 2) �ڵ巯���ۿ� Ű:���� ���, Ű) ��û�Ǵ� �ּ� ��)��ü�� �޼���

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarController {
	//��Ʈ�ѷ����� view���� �Ѿ�� ���� �׸�:
	//1. view ������ ����
	//2. model �� �Ӽ���
	@RequestMapping("car.do")
	public String car(String color, Model model) {
		System.out.println("��Ʈ�ѷ����� ���� ����" + color);
		model.addAttribute("color", color);
		return "img"; 
	}
}
