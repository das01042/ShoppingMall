package com.shop.control;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	HashMap<String , Controller> list = null;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		list = new HashMap<String , Controller>();
		//로그인
		list.put("/login.do", new LoginController());
		//로그아웃
		list.put("/logout.do" , new LogoutController());
		
		//member
		//등록
		list.put("/memberInsert.do", new memberInsertController());
		//수정
		list.put("/memberUpdate.do", new memberUpdateController());
		//삭제
		list.put("/memberDelete.do", new memberDeleteController());
		//전체조회
		list.put("/memberList.do", new memberListController());
		//한건조회
		list.put("/memberSearch.do", new memberSearchController());
		
		
		//product
		//상품 전체 조회
		list.put("/productList.do", new productListController());
		//상품 검색
		list.put("/productSearch.do", new productSearchController());
		//상품 등록
		list.put("/productInsert.do", new productInsertController());
		//상품 수정
		list.put("/productUpdate.do", new productUpdateController());
		//상품 삭제
		list.put("/productDelete", new productDeleteController());
		
		//board
		//게시판 리스트
		list.put("/boardList.do", new boardListController());
		//게시판 상세 조회(댓글 기능)
		list.put("/boardSearch.do", new boardSearchController());
		//게시판 등록
		list.put("/boardInsert.do", new boardInsertController());
		//게시판 수정
		list.put("/boardUpdate.do",new boardUpdateController());
		//게시판 삭제
		list.put("/boardDelete.do", new boardDeleteController());
		//게시판 검색기능
		list.put("/boardSearchTool.do",new boardSearchToolController());
		//게시판 댓글 등록 기능
		list.put("/boardComment.do", new boardCommentController());
		//댓글 삭제
		list.put("/commentDelete.do", new commentDeleteController());
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url =req.getRequestURI();
		String context = req.getContextPath();
		String path = url.substring(context.length());
		
		Controller subCont = list.get(path);
		subCont.excute(req, resp);
	}

}
