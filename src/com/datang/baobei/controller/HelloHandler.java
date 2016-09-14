package com.datang.baobei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloHandler {

	//使用 @RequestMapping 来映射请求.
	@RequestMapping("/hellowold")
	public String hello(){
		System.out.println("hello world.");
		return "success";
	}
	
}
