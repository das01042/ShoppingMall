package com.shop.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.memberVO;
import com.shop.service.memberService;

public class memberSearchController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		String job = req.getParameter("job");
		
		memberService service = new memberService();
		memberVO vo = service.searchOne(id);
		req.setAttribute("member", vo);
		
		if(job.equals("search")) {
			req.getRequestDispatcher("member/memberSearchOutput.jsp").forward(req, res);
		}else if(job.equals("update")) {
			req.getRequestDispatcher("member/memberUpdateForm.jsp").forward(req, res);
		}else if(job.equals("delete")) {
			req.getRequestDispatcher("member/memberDeleteForm.jsp").forward(req, res);
		}
	}

}
