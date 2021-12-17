package com.shop.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.productVO;
import com.shop.service.productService;

public class productListController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		productService service = new productService();
		List<productVO> list = service.searchAll();
		
		req.setAttribute("productList", list);
		
		req.getRequestDispatcher("product/productList.jsp").forward(req, res);
		
	}

}
