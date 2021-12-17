package com.shop.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.memberVO;
import com.shop.service.memberService;

public class memberListController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		memberService service = new memberService();
		List<memberVO> list =service.searchAll();
		
		req.setAttribute("memberList", list);
		
		req.getRequestDispatcher("member/memberList.jsp").forward(req, res);
		
	}

}
