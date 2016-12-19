package com.jblog.repository;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jblog.exception.UserDaoException;
import com.jblog.vo.UserVo;

@Repository
public class UserDao {
	@Autowired
	private SqlSession sqlSession;
	
	public void insert( UserVo vo ){
		sqlSession.insert("user.insertUser", vo);
	}
	
	// 인증(로그인)
	public UserVo get( String id, String password ) throws UserDaoException {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put( "id", id );
		map.put( "password", password);
		
		return sqlSession.selectOne( "user.getByIdAndPassword", map);
	}
}
