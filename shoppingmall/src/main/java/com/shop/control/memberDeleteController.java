package com.shop.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.memberVO;
import com.shop.service.memberService;

public class memberDeleteController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		
		memberVO vo = new memberVO();
		
		vo.setId(id);
		vo.setName(name);
		
		memberService service = new memberService();
		service.delete(id);
		
		req.setAttribute("member", vo);
		
		req.getRequestDispatcher("member/memberDeleteOutput.jsp").forward(req, res);
	}

}
