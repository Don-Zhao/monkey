package com.monkey.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.monkey.interceptor.MyHandlerInterceptor;
import com.monkey.interceptor.MyTwoHandlerInterceptor;

@Configuration
public class CustomWebMvcConfigurer implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new MyTwoHandlerInterceptor()).addPathPatterns("/**");
//		registry.addInterceptor(new MyHandlerInterceptor()).addPathPatterns("/**");
		
		WebMvcConfigurer.super.addInterceptors(registry);
	}

}
