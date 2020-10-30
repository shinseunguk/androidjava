package com.mega.mvc07;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//@Component (컴포넌트 == bean) 부모클래스!

@Repository
public class MemberDAO {
	
	@Autowired
	SqlSessionTemplate mybatis;
	
	
	public void insert(MemberVO vo) {
		mybatis.insert("member.insert", vo);
	}
	public void update(MemberVO vo) {
		mybatis.update("member.update", vo);
	}
	public void delete(MemberVO vo) {
		mybatis.delete("member.delete", vo);
	}
	public MemberVO one(MemberVO vo) {
		MemberVO vo2 = mybatis.selectOne("member.one", vo);
		return vo2;
						//(네임스페이스이름.id, 입력param)
	}
	public List<MemberVO> list() {
		List<MemberVO> list = mybatis.selectList("member.list");
		System.out.println("list size: " + list.size());
		return list;
	}

}
