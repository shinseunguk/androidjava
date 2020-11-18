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
	
	//Ʈ��������� ���� �޼��� ����
	
	@Transactional
	public int tran(MemberVO vo, BbsVO vo2) throws Exception {
		System.out.println("service ȣ��");
		int result = 1;//�������� ��
		dao.insert(vo);
		
		if(0 == dao2.insert(vo2)) {
			System.out.println("bbs �Խù� ���Խ� ���� �߻�");
			result = 0;
		}
		return result;
	}

}
