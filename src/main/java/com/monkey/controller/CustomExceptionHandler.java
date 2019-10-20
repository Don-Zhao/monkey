package com.monkey.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.monkey.exception.MonkeyException;

@RestControllerAdvice
public class CustomExceptionHandler {

	@ExceptionHandler(value=Exception.class)
	public Object HandleException(Exception e, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 100);
		map.put("msg", e.getMessage());
		map.put("url", request.getRequestURI());
		
		return map;
	}
	
//	@ExceptionHandler(value=MonkeyException.class)
//	public Object handleMyException(Exception e) {
//		ModelAndView modelAndView = new ModelAndView();
//		modelAndView.setViewName("error.html");
//		modelAndView.addObject("msg", e.getMessage());
//		return modelAndView;
//	}
	
	@ExceptionHandler(value=MonkeyException.class)
	public Object handleMyException(Exception e) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", 100);
		map.put("msg", e.getMessage());
		
		return map;
	}
}
