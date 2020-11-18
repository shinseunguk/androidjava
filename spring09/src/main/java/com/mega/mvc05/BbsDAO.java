package com.mega.mvc05;

import java.util.List;
import java.util.ArrayList;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BbsDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public int insert(BbsVO vo) throws Exception {
		int result = 0;
		result = mybatis.insert("bbs.create", vo);
		return result; 
	}
	public void delete(BbsVO vo) {
		mybatis.delete("bbs.delete", vo);
	}
	public void update(BbsVO vo) {
		mybatis.update("bbs.update", vo);
	}
	public BbsVO select(BbsVO vo) {
		BbsVO vo2 = mybatis.selectOne("bbs.one", vo);
		System.out.println("검색결과1: "+ vo2);
		return vo2;
	}
	public List<BbsVO> list() {
		List<BbsVO> list = mybatis.selectList("bbs.list");
		return list;
	}
	
	public List<BbsVO> select(int no) {
		List<BbsVO> list = new ArrayList<BbsVO>();
		list.add(mybatis.selectOne("bbs.one", no));
		return list;
	}
	
	
}
