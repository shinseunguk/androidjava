package com.mega.mvc06;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BbsService {

	@Autowired
	BbsDAO dao; //��������
	
	//���������� �ּ�/�� �� �ִ� ���
	//1. �Ķ���� �ִ� �����ڸ� ����ض�.
	//2. set�޼��带 ������.
	//
//	public BbsService(BbsDAO dao) {
//		this.dao = dao;
//	}
	
	
	public void setDao(BbsDAO dao) {
		this.dao = dao;
	}
}
