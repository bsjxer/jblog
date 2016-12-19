package com.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jblog.repository.UserDao;
import com.jblog.vo.UserVo;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;
	
	public void join( UserVo vo ){
		userDao.insert(vo);
	}
	
	public UserVo login( String id, String password ) {
		UserVo userVo = null;
		userVo = userDao.get( id, password );
		return userVo;
	}
}
