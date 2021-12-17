package com.shop.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.boardVO;
import com.shop.VO.commentVO;
import com.shop.service.boardService;
import com.shop.service.commentService;

public class commentDeleteController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String cno = req.getParameter("comment_no");
		String job = req.getParameter("job");
		String no = req.getParameter("no");
		
		commentService service = new commentService();
		service.delete(cno);
		
	
		req.getRequestDispatcher("boardSearch.do").forward(req, res);
		
	}

}
