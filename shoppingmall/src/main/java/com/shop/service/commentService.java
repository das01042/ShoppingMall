package com.shop.service;

import java.util.List;

import com.shop.DAO.board_commentDAO;
import com.shop.VO.commentVO;

public class commentService {
	board_commentDAO dao = new board_commentDAO();
	//댓글 리스트
	public List<commentVO> commentList(String no){
		return dao.commentList(no);
	}
	
	//댓글 등록
	public commentVO insert(commentVO vo) {
		return dao.commentInsert(vo);
	}
	
	//댓글 수정
	public commentVO update(commentVO vo) {
		return dao.commentUpdate(vo);
	}
	
	//댓글 삭제
	public commentVO delete(String no) {
		return dao.commentDelete(no);
	}
}
