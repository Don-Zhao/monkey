package com.monkey.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("map")
	public Map<String, String> map() {
		Map<String, String> map = new HashMap<>();
		map.put("name", "赵嘉鸿");
		map.put("age", "33");
		
		return map;
	}
}
