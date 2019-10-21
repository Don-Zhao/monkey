package com.monkey.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monkey.config.ServerSettings;

@Controller
@RequestMapping("/ftl")
public class FreeMarkerController {
	
	@Autowired
	private ServerSettings serverSettings;
	
	@RequestMapping("/user")
	public String user(Model model) {
		model.addAttribute("setting", serverSettings);
		return "ftl/user";
	}
}
