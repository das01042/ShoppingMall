package com.shop.service;

import java.util.List;

import com.shop.DAO.productDAO;
import com.shop.VO.productVO;

public class productService {
	productDAO dao = new productDAO();
	
	//상품 전체 조회
	public List<productVO> searchAll(){
		return dao.productList();
	}
	//상품 한건 조회
	public productVO searchOne(String id) {
		return dao.productSearch(id);
	}
	
	//상품 입력
	public productVO insert(productVO vo) {
		return dao.productInsert(vo);
	}
	
	//상품 수정
	public productVO update(productVO vo) {
		return dao.productUpdate(vo);
	}
	
	//상품 삭제
	public productVO delete(String id) {
		return dao.productDelete(id);
	}
		
	
}
