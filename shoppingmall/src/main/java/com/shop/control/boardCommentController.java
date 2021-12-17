package com.shop.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.shop.VO.commentVO;
import com.shop.service.commentService;

public class boardCommentController implements Controller {

	@Override
	public void excute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String no = req.getParameter("no");
		String job = req.getParameter("job");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		String pwd = req.getParameter("pwd");
		
		commentVO vo = new commentVO();
		vo.setCommentBoardNo(no);
		vo.setCommentWriter(writer);
		vo.setCommentCont(content);
		vo.setCommentPwd(pwd);
		
		
		commentService service = new commentService();
		service.insert(vo);
		
		
		
		req.getRequestDispatcher("boardSearch.do").forward(req, res);
		
		
		
	}

}
