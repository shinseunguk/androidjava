package com.mega.mvc05;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//��Ʈ�ѷ����� db�� �Ѿ����/����� ������ �ͼ� 
//�߰��� ó���ؾ��ϴ� �κ�: �����Ͻ� ��(business layer)
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
