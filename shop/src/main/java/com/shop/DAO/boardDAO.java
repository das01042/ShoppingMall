package com.shop.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.VO.boardVO;

public class boardDAO extends DAO{

	// 게시판 전체 조회
	public List<boardVO> boardList(){
		List<boardVO> list = new ArrayList<>();
		String sql = "select * from board order by 1";
		connect();
		try {
			stmt = conn.prepareStatement(sql);
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				boardVO vo = new boardVO();
				
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getNString("writer"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return list;
	}

	// 게시판 상세 조회 (한개)
	public boardVO boardSearch(String no) {
		String sql = "select * from board where no =?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, no);
			rs = psmt.executeQuery();
			if(rs.next()) {
				boardVO vo = new boardVO();
				vo.setNo(rs.getInt("no"));
				vo.setTitle(rs.getString("title"));
				vo.setContent(rs.getString("content"));
				vo.setWriter(rs.getString("writer"));
				return vo;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return null;
	}

	// 게시판 등록
	public boardVO boardInsert(boardVO vo) {
		String sql = "insert into board values(?,?,?,?)";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, vo.getNo());
			psmt.setString(2, vo.getTitle());
			psmt.setString(3, vo.getContent());
			psmt.setString(4, vo.getWriter());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}
	
	// 게시판 수정
	public boardVO boardUpdate(boardVO vo) {
		String sql = "update board"
				+ "set title=?"
				+ ",content=?"
				+ "where no =?";
		connect();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getContent());
			psmt.setInt(3, vo.getNo());
			
			int r = psmt.executeUpdate();
			System.out.println(r+"건 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
		return vo;
	}

	// 게시판 삭제
	public boardVO boardDelete (String no) {
		boardVO vo = boardSearch(no);
		String sql = "delete board where no =?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, no);
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
