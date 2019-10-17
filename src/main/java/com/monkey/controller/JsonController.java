package com.monkey.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.model.User;

@RestController
public class JsonController {
	
	@RequestMapping("/")
	public String home() {
		return "Hello, World";
	}
	
	@RequestMapping("/test")
	public Map<String, String> testMap() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "spring boot");
		return map;
	}
	
	@GetMapping("/testjson")
	public Object testjson() {
		User user = new User(null, "18745687954", 23, "24975@qq.com", new Date());
		
		return user;
	}
}
