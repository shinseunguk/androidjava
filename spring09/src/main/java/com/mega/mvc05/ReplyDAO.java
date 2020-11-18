package com.mega.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
//persistence layer(�۽ý��Ͻ� ���̾�, ��)

@Repository
public class ReplyDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	public int delete(ReplyVO vo) {
		int result = mybatis.delete("reply.delete", vo );
		return result;
	}
	
	public int create(ReplyVO vo) {
		int result = mybatis.insert("reply.create", vo);
				return result;
	}
	public List<ReplyVO> list(int original) {
		 List<ReplyVO> list= mybatis.selectList("reply.list", original);
		 System.out.println("��� ����Ʈ===========");
		 System.out.println(list);
		 return list;
	}
}
