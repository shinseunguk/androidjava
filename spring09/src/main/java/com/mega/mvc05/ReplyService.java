package com.mega.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//컨트롤러에서 db로 넘어가기전/결과값 가지고 와서 
//중간에 처리해야하는 부분: 비지니스 층(business layer)
@Service
public class ReplyService {

	@Autowired
	ReplyDAO dao;
	
	public int delete(ReplyVO vo) {
		return dao.delete(vo);
	}
	
	public int create(ReplyVO vo) {
		int result = dao.create(vo);
		return result;
	}
	public List<ReplyVO> list(int original) {
		 return dao.list(original);
	}
	
	
	
	
}
