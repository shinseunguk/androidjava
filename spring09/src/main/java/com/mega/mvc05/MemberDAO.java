package com.mega.mvc05;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public int insert(MemberVO memberVO) {
	return	mybatis.insert("member.create", memberVO);
	}
	
	
	
}
