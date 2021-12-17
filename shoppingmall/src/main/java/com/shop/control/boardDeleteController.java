package com.shop.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.boardVO;
import com.shop.service.boardService;

public class boardDeleteController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String no = req.getParameter("no");
		String writer = req.getParameter("writer");
		
		boardVO vo = new boardVO();
		vo.setNo(no);
		vo.setWriter(writer);
		
		boardService service =new boardService();
		service.delete(no);
		
		req.setAttribute("board", vo);
		
		req.getRequestDispatcher("board/boardDeleteOutput.jsp").forward(req, res);
	}

}
