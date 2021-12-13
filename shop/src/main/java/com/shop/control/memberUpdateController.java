package com.shop.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.memberVO;
import com.shop.service.memberService;
import com.shop.VO.memberVO;

public class memberUpdateController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		
		memberVO vo = new memberVO();
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setEmail(email);
		
		memberService service = new memberService();
		service.update(vo);
		
		req.setAttribute("member", vo);
		
		req.getRequestDispatcher("member/memberUpdateOutput.jsp").forward(req, res);
	}

}
