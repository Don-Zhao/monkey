package com.monkey.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {
	
	@RequestMapping("/hello")
	@ResponseBody
	public String app() {
		System.out.println("in controller");
		return "hello, world";
	}
	
	@RequestMapping("/api/hello")
	@ResponseBody
	public String appTest() {
		return "hello, world";
	}
	
	@RequestMapping("/api/username")
	@ResponseBody
	public String requestListenerTest(HttpServletRequest request) {
		request.setAttribute("username", "zhao.jiahong");
		
		return "zhao.jiahong";
	}
}
