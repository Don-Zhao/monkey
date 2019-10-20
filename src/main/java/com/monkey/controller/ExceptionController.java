package com.monkey.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.exception.MonkeyException;
import com.monkey.model.User;

@RestController
public class ExceptionController {

	@RequestMapping(value="/exception/index")
	public Object index() {
		int i = 8 / 0;
		return new User("123", "12345678941", 22, "2344@163.com", new Date());
	}
	
	@RequestMapping(value="/exception/test")
	public Object test() {
		throw new MonkeyException("100", "我定义的异常");
	}
	
}
