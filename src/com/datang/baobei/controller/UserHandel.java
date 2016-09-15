package com.datang.baobei.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
/**
 * 员工处理类
 * @author Administrator
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;

import com.datang.baobei.service.UserService;
@Controller
public class UserHandel {
	@Resource(name="userService")
	private UserService userService;
	@RequestMapping("/findAllUser")
	public void findAllUser(){
	
	}
	@RequestMapping("/login")
	public String login(){
		return "success";
	}
}
