package com.mega.mvc07;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	
	@Autowired
	MemberService service;
	
	@RequestMapping("one.do")
	public void one(MemberVO memberVO, Model model) {
		MemberVO vo = service.one(memberVO);
		model.addAttribute("vo", vo);
	}
	@RequestMapping("list.do")
	public void list(Model model) {
		 List<MemberVO> list = service.list();
		 model.addAttribute("list", list);
	}
	@RequestMapping("insert.do")
	public void create2(MemberVO memberVO) {
		service.insert(memberVO);
	}
	@RequestMapping("update.do")
	public void update(MemberVO memberVO) {
		service.update(memberVO);
	}
	@RequestMapping("delete.do")
	public void delete(MemberVO memberVO) {
		service.delete(memberVO);
	}
}
