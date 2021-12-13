package com.shop.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.productVO;
import com.shop.service.productService;

public class productDeleteController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String PId = req.getParameter("pId");
		String pName = req.getParameter("pName");
		
		productVO vo = new productVO();
		vo.setpId(PId);
		vo.setpName(pName);
		
		productService service = new productService();
		service.delete(PId);
		
		req.setAttribute("product", vo);
		
		req.getRequestDispatcher("product/productDeleteOutput.jsp").forward(req, res);
		
	}

}
