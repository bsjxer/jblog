package com.jblog.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jblog.service.BlogService;
import com.jblog.service.UserService;
import com.jblog.vo.UserVo;

@Controller
@RequestMapping( "/user" )
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BlogService blogService;

	@RequestMapping( "/join" )
	public String joinform() {
		return "user/join";
	}
	
	@RequestMapping( "/joinsuccess" )
	public String join( @ModelAttribute @Valid UserVo userVo ) {
		userService.join( userVo );
		blogService.join( userVo.getNo() );
		return "user/joinsuccess";
	}
	
	@RequestMapping( "/loginform" )
	public String loginform() {
		return "user/login";
	}
}
