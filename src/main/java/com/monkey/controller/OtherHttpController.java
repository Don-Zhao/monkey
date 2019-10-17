package com.monkey.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 主要测试post，put以及delete提交
 */

@RestController
public class OtherHttpController {
	
	private Map<String, Object> params = new HashMap<>();
	
	/**
	 * 功能描述：测试PostMapping
	 * @param id
	 * @param pwd
	 * @return
	 */
	@PostMapping("/v1/login")
	public Object login(String id, String pwd) {
		params.clear();
		params.put("id", id);
		params.put("pwd", pwd);
		
		return params;
	}
	
	@PutMapping("/v1/put")
	public Object put(String id) {
		params.clear();
		params.put("id", id);
		
		return params;
	}
	
	@DeleteMapping("/v1/del")
	public Object delete(String id) {
		params.clear();
		params.put("id", id);
		
		return params;
	}
}
