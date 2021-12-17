package com.shop.control;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.boardVO;
import com.shop.service.boardService;

public class boardSearchToolController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String searchField = req.getParameter("searchField");
		String searchText = req.getParameter("searchText");
		boardService service=new boardService();
		ArrayList<boardVO> list =service.search(searchField, searchText);
		req.setAttribute("board", list);
		
		req.getRequestDispatcher("board/searchOut.jsp").forward(req, res);
	}

}
