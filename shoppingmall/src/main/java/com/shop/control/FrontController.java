package com.shop.control;

import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

public class FrontController extends HttpServlet {
	HashMap<String , Controller> list = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		list = new HashMap<String , Controller>();
		//로그인
		list.put("/login.do", new LoginController());
	}

}
