package com.shop.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.boardVO;
import com.shop.service.boardService;

public class boardListController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		boardService service = new boardService();
		List<boardVO> list = service.searchAll();
		
		req.setAttribute("boardList", list);
		
		req.getRequestDispatcher("board/boardList.jsp").forward(req, res);
	}

}
