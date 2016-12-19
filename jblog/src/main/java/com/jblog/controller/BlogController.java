package com.jblog.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jblog.security.AuthUser;
import com.jblog.service.BlogService;
import com.jblog.vo.BlogVo;
import com.jblog.vo.UserVo;

@Controller
@RequestMapping( "/blog" )
public class BlogController {
	
	@Autowired
	private BlogService blogService;
	
	@RequestMapping( "/blog-main" )
	public String main( ) {
		return "blog/blog-main";
	}
	
	@RequestMapping( "/blog-admin-basic")
	public String blog_admin() {
		return "blog/blog-admin-basic";
	}
	
	@RequestMapping( "/basic-admin" )
	public String basic_admin( @AuthUser UserVo authUser, @ModelAttribute @Valid BlogVo blogVo ){
		blogVo.setUsers_no( authUser.getNo() );
		blogService.update( blogVo );
		return "blog/blog-main";
	}
}
