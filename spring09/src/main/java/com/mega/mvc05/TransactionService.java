package com.mega.mvc05;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionService {

	@Autowired
	MemberDAO dao;
	
	@Autowired
	BbsDAO dao2;
	
	//트랜잭션으로 묶을 메서드 정의
	
	@Transactional
	public int tran(MemberVO vo, BbsVO vo2) throws Exception {
		System.out.println("service 호출");
		int result = 1;//성공했을 때
		dao.insert(vo);
		
		if(0 == dao2.insert(vo2)) {
			System.out.println("bbs 게시물 삽입시 에러 발생");
			result = 0;
		}
		return result;
	}

}
