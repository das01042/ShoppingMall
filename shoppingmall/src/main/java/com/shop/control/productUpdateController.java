package com.shop.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.productVO;
import com.shop.service.productService;

public class productUpdateController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String pId = req.getParameter("pId");
		String pName = req.getParameter("pName");
		String pDesc = req.getParameter("pDesc");
		int originPrice=Integer.parseInt(req.getParameter("originPrice"));
		int salePrice=Integer.parseInt(req.getParameter("salePrice"));
		double star = Double.parseDouble(req.getParameter("star"));
		String image = req.getParameter("image");
		int count=Integer.parseInt(req.getParameter("count"));
		
		productVO vo =new productVO();
		vo.setpId(pId);
		vo.setpName(pName);
		vo.setpDesc(pDesc);
		vo.setOriginPrice(originPrice);
		vo.setSalePrice(salePrice);
		vo.setStar(star);
		vo.setImage(image);
		
		productService service = new productService();
		service.update(vo);
		
		req.setAttribute("pid", pId);
		req.setAttribute("pName", pName);
		req.setAttribute("pDesc", pDesc);
		req.setAttribute("originPrice", originPrice);
		req.setAttribute("salePrice", salePrice);
		req.setAttribute("star", star);
		req.setAttribute("image", image);
		
		req.getRequestDispatcher("product/productUpdateOutPut.jsp").forward(req, res);
	}

}
