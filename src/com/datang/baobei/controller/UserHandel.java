package com.datang.baobei.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
/**
 * 员工处理类
 * @author Administrator
 *
 */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.datang.baobei.entities.User;
import com.datang.baobei.service.UserService;
import com.sun.corba.se.impl.protocol.giopmsgheaders.RequestMessage;

@Controller
public class UserHandel {
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping(value="/findAllUser",method=RequestMethod.POST)
	@ResponseBody
	public List<User> findAllUser(HttpServletRequest request,HttpServletResponse response) throws IOException {
		System.out.println("asdfassd");
		return userService.findByProperty("password", "psuqgyy1");
	}

	@RequestMapping("/login")
	public String login1(HttpServletRequest request,HttpServletResponse response) {
		String username=request.getParameter("username").toString();
		String password=request.getParameter("password").toString();
		List<User> users = userService.findByProperty("username", username);
		if (users.size() == 0) {
			request.setAttribute("errorMsg","没有这个账号");
			return "../../index"; 
		} else { 
			if (users.get(0).getPassword().equals(password)) {
				return  "success";  
			} else {
				request.setAttribute("errorMsg","密码错误");
				return "../../index";
			}
		}
	}
}
