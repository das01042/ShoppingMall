package com.shop.service;

import java.util.ArrayList;
import java.util.List;

import com.shop.DAO.boardDAO;
import com.shop.VO.boardVO;

public class boardService {
	boardDAO dao = new boardDAO();
	
	//게시판 전체 조회
	public List<boardVO> searchAll(){
		return dao.boardList();
	}
	//게시판 상세 조회
	public boardVO searchOne(String no) {
		return dao.boardSearch(no);
	}
	//게시판 등록
	public boardVO insert(boardVO vo) {
		return dao.boardInsert(vo);
	}
	//게시판 수정
	public boardVO update(boardVO vo) {
		return dao.boardUpdate(vo);
	}
	//게시판 삭제
	public boardVO delete(String no) {
		return dao.boardDelete(no);
	}
	//게시판 검색
	public ArrayList<boardVO> search(String searchField,String searchText){
		return dao.getSearch(searchField, searchText);
	}
}
