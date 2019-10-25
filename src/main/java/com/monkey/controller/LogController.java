package com.monkey.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/log")
public class LogController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/log")
	public String log() {
		logger.debug("this is debug");
		logger.info("this is info");
		logger.warn("this is warn");
		logger.error("this is error");
		
		return "log";
	}
}
