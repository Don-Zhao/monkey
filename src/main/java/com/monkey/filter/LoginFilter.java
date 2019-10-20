package com.monkey.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebFilter(urlPatterns="/api/*", filterName="loginFilter")
public class LoginFilter implements Filter {

	/**
	 * 容器加载时候调用
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("init loginFilter");
	}

	/**
	 * 容器在销毁的时候调用
	 */
	@Override
	public void destroy() {
		System.out.println("destroy loginFilter");
	}

	/**
	 * 请求被拦截的时候调用
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("doFilter loginFilter");
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
		
//		String username = req.getParameter("username");
//		if ("monkey".equals(username)) {
			chain.doFilter(request, response);
//		} else {
//			resp.sendRedirect("index.html");
//			return;
//		}
	}

}
