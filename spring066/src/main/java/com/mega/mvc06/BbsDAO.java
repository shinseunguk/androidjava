package com.mega.mvc06;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(BbsVO vo) {
		mybatis.insert("bbs.create", vo);
	}
	public void delete(BbsVO vo) {
		mybatis.delete("bbs.delete", vo);
	}
	public void update(BbsVO vo) {
		mybatis.update("bbs.update", vo);
	}
	public BbsVO select(BbsVO vo) {
		BbsVO vo2 = mybatis.selectOne("bbs.one", vo);
		return vo2;
	}
	public List<BbsVO> list(BbsVO vo) {
		List<BbsVO> list = mybatis.selectList("bbs.list", vo);
		return list;
	}
	
	
}
