package com.shop.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.VO.productVO;

public class productDAO extends DAO{

	// 상품 전체 조회
	public List<productVO> productList() {
		List<productVO> list = new ArrayList<>();
		String sql = "select * from product order by 1";
		connect();
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				productVO vo = new productVO();
				
				//학원가서 컬럼명 한번더 확인 
				
				vo.setpId(rs.getString("p_id"));
				vo.setpName(rs.getString("p_name"));
				vo.setpDesc(rs.getString("p_desc"));
				vo.setOriginPrice(rs.getInt("origin_price"));
				vo.setSalePrice(rs.getInt("sale_price"));
				vo.setStar(rs.getDouble("star"));
				vo.setImage(rs.getString("image"));
				vo.setCount(rs.getInt("count"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}
	
	// 상품 상세 조회 (한개) 
	// 
	public productVO productSearch(String name) {
		String sql = "select * from product where p_name =?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, name);
			rs = psmt.executeQuery();
			if(rs.next()) {
				productVO vo = new productVO();
				vo.setpId(rs.getString("p_id"));
				vo.setpName(rs.getString("p_name"));
				vo.setpDesc(rs.getString("p_desc"));
				vo.setOriginPrice(rs.getInt("origin_price"));
				vo.setSalePrice(rs.getInt("sale_price"));
				vo.setStar(rs.getDouble("star"));
				vo.setImage(rs.getString("image"));
				vo.setCount(rs.getInt("count"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}
	
	// 상품 등록
	public productVO productInsert(productVO vo) {
		String sql = "insert into product values(?,?,?,?,?,?,?,?)";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getpId());
			psmt.setString(2, vo.getpName());
			psmt.setString(3, vo.getpDesc());
			psmt.setInt(4, vo.getOriginPrice());
			psmt.setInt(5, vo.getSalePrice());
			psmt.setDouble(6, vo.getStar());
			psmt.setString(7, vo.getImage());
			psmt.setInt(8, vo.getCount());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}
	
	// 상품 수정
	// 상품 뭐뭐 수정할지 정하기
	public productVO productUpdate(productVO vo) {
		String sql = "update product"
				+ "set p_name=?"
				+ ",p_desc=?"
				+ ",origin_price=?"
				+ ",sale_price=?"
				+ ",star=?"
				+ ",image=?"
				+ ",count=?"
				+ "where id =?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getpName());
			psmt.setString(2, vo.getpDesc());
			psmt.setInt(3, vo.getOriginPrice());
			psmt.setInt(4, vo.getSalePrice());
			psmt.setDouble(5, vo.getStar());
			psmt.setString(6, vo.getImage());
			psmt.setString(7, vo.getpId());
			psmt.setInt(8, vo.getCount());
			
			int r = psmt.executeUpdate();
			System.out.println(r + "건 수정");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}
	
	// 상품 삭제
	//productVO vo = productSearch(id); ??
	public productVO productDelete (String id) {
		productVO vo = productSearch(id);
		String sql = "delete product where p_name=?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.executeUpdate();
			return vo;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
}
