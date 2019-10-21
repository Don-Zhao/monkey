package com.monkey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monkey.config.ServerSettings;

@Controller
@RequestMapping("/tl")
public class ThymeleafController {
	
	@Autowired
	private ServerSettings serverSettings;
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("setting", serverSettings);
		return "tl/hello";
	}
}
