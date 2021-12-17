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
				
				vo.setNo(rs.getString("no"));
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

	// 게시판 상세 조회
	public boardVO boardSearch(String no) {
		String sql = "select * from board where no =?";
		connect();
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, no);
			rs = psmt.executeQuery();
			if(rs.next()) {
				boardVO vo = new boardVO();
				vo.setNo(rs.getString("no"));
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
		String seqSql = "select board_seq.nextval from dual";
		String sql = "insert into board (no, title, content, writer) values(?,?,?,?)";
		connect();
		int seq = -1;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(seqSql);
			if(rs.next()) {
				seq = rs.getInt(1);
			}
			
			psmt = conn.prepareStatement(sql);
			psmt.setInt(1, seq);
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
				+ " set title=?"
				+ ",content=?"
				+ "where no =?";
		connect();
		
		try {
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getTitle());
			psmt.setString(2, vo.getContent());
			psmt.setString(3, vo.getNo());
			
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
	
	
	//검색
	public ArrayList<boardVO>getSearch(String searchField,String searchText){
		ArrayList<boardVO> list = new ArrayList<boardVO>();
		System.out.println(searchText);
		connect();
		String sql = "select * from board where "+searchField;
		try {
			if(searchText !=null && !searchText.equals("")) {
				sql +=" like '%"+searchText+"%'";
			}
			psmt = conn.prepareStatement(sql);
			rs=psmt.executeQuery();
			while(rs.next()) {
				boardVO vo = new boardVO();
				vo.setNo(rs.getString(1));
				vo.setTitle(rs.getString(2));
				vo.setContent(rs.getString(3));
				vo.setWriter(rs.getString(4));
				
				list.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		disconnect();
		return list;
	}
	
	
	
}
