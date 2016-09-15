package com.datang.baobei.controller;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.datang.baobei.entities.User;
import com.datang.baobei.service.UserService;

@Controller
public class UserHandel {
	@Resource(name = "userService")
	private UserService userService;

	@RequestMapping("/findAllUser")
	public void findAllUser() {

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
