package com.shop.service;

import java.util.List;

import com.shop.DAO.memberDAO;
import com.shop.VO.memberVO;

public class memberService {
	//로그인 체크
	public memberVO loginCheck(String id, String pw) {
		return dao.loginCheck(id, pw);
	}
	
	memberDAO dao = new memberDAO();
	//회원 리스트
	public List<memberVO> searchAll(){
		return dao.memberList();
	}
	//단일 조회
	public memberVO searchOne(String id) {
		return dao.memberSearch(id);
	}
	//등록
	public memberVO insert(memberVO vo) {
		return dao.memberInsert(vo);
	}
	//수정
	public memberVO update(memberVO vo) {
		return dao.memberUpdate(vo);
	}
	//삭제
	public memberVO delete(String id) {
		return dao.memberDelete(id);
	}
}
