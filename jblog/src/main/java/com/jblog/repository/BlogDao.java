package com.jblog.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jblog.vo.BlogVo;

@Repository
public class BlogDao {
	@Autowired
	private SqlSession sqlSession;
	
	public void insert( Long no ){
		sqlSession.insert( "blog.insert", no );
	}
	
	public void update( BlogVo vo ){
		sqlSession.update( "blog.update", vo );
	}
}
