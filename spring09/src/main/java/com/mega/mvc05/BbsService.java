package com.mega.mvc05;

import java.util.List;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {

	@Autowired
	BbsDAO dao; //��������
	
	public BbsVO one (BbsVO vo) {
		return dao.select(vo); 
	}
	public List<BbsVO> one (int no) {
		return dao.select(no); 
	}
	public List<BbsVO> list () {
		return dao.list(); 
	}
	
	
}
