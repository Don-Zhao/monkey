package com.monkey.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/env")
@PropertySource("classpath:application.properties")
public class MultiEnvController {
	
	@Value("${test.url}")
	private String url;
	
	@RequestMapping("/url")
	public String dev() {
		return url;
	}
}
