package com.shop.control;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/CharsetFilter")
public class CharsetFilter implements Filter {

    public CharsetFilter() {
        // TODO Auto-generated constructor stub
    }

	public void destroy() {
		System.out.println("destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("doFilter() before");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		// pass the request along the filter chain
		chain.doFilter(request, response); // 서블릿실행
		System.out.println("doFilter() after");
	}

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init()");
	}

}
