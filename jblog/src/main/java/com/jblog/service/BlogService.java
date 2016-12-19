package com.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jblog.repository.BlogDao;
import com.jblog.vo.BlogVo;

@Service
public class BlogService {

	@Autowired
	private BlogDao blogDao;
	
	public void join( Long no ){
		blogDao.insert( no );
	}
	
	public void update( BlogVo vo ){
		blogDao.update( vo );
	}
}
