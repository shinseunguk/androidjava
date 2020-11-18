package com.mega.mvc05;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {
	
	@Autowired
	BbsService service;
	
	
	@RequestMapping("json.do")
	@ResponseBody
	public ArrayList<BbsVO> json() {
		BbsVO vo = new BbsVO();
		vo.setNo(100);
		vo.setTitle("coffee");
		vo.setContent("good coffee");
		vo.setWriter("park");
		
		BbsVO vo2 = new BbsVO();
		vo2.setNo(200);
		vo2.setTitle("bbe");
		vo2.setContent("good bbe");
		vo2.setWriter("kim");
		
		ArrayList<BbsVO> list = new ArrayList<>();
		list.add(vo);
		list.add(vo2);
		
		
		return list;
	}
	
	@RequestMapping("json1.do")
	@ResponseBody
	public List<BbsVO> rowJson(@RequestParam int no) {
		List<BbsVO> list = service.one(no);
		System.out.println(no);
			return list;
	}

	@RequestMapping("json2.do")
	@ResponseBody
	public List<BbsVO> wholeJson() {
		List<BbsVO> list = service.list();
			return list;
	}
}
