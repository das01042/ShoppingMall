package com.shop.control;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.boardVO;
import com.shop.VO.commentVO;
import com.shop.service.boardService;
import com.shop.service.commentService;

public class boardSearchController implements Controller {
	
	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String no = req.getParameter("no");
		String job = req.getParameter("job");
		boardService service = new boardService();
		commentService Cservice= new commentService();
		List<commentVO> cvo= Cservice.commentList(no);
		boardVO vo =service.searchOne(no);
		
		
		
		req.setAttribute("board", vo);
		req.setAttribute("comment", cvo);
		
		if(job.equals("search")) {
			req.getRequestDispatcher("board/boardSearchOutput.jsp").forward(req, res);
			
		}else if(job.equals("update")) {
			req.getRequestDispatcher("board/boardUpdate.jsp").forward(req, res);
		}else if(job.equals("delete")) {
			req.getRequestDispatcher("board/boardDelete.jsp").forward(req, res);
		}
		
	}

}
