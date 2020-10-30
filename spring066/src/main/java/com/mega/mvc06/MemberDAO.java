package com.mega.mvc06;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(MemberVO memberVO) {
		mybatis.insert("member.create", memberVO);
	}
	
	
	
}
