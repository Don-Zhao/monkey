package com.monkey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.monkey.service.JmsService;

@RestController
@RequestMapping("/jms")
public class JmsController {
	
	@Autowired
	private JmsService jmsService;
	
	@RequestMapping("/send")
	public String send() {
		jmsService.sendMessage("zhao.jiahong");
		return "success";
	}
	
	@RequestMapping("/publish")
	public String publish(@RequestParam String text) {
		jmsService.publish(text);
		return "OK";
	}
}
