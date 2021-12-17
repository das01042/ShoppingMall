package com.shop.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.shop.VO.commentVO;

public class board_commentDAO extends DAO{
	//댓글 전체 조회
	public List<commentVO> commentList(String no){
		List<commentVO> list =new ArrayList<>();
		String sql = "select * from board_comment where comment_board_no = ? order by 1 ";
		connect();
		try {
			psmt =conn.prepareStatement(sql);
			psmt.setString(1, no);
			
			
			rs = psmt.executeQuery();
			while(rs.next()) {
				commentVO vo = new commentVO();
				
				vo.setCommentNo(rs.getString("comment_no"));
				vo.setCommentBoardNo(rs.getString("comment_board_no"));
				vo.setCommentCont(rs.getString("comment_cont"));
				vo.setCommentWriter(rs.getString("comment_writer"));
				vo.setCommentPwd(rs.getString("comment_pwd"));
				list.add(vo);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return list;
	}

	//댓글 등록
	public commentVO commentInsert(commentVO vo) {
		String seqSql = "select comment_seq.nextval from dual";
		String sql = "insert into board_comment values(?,?,?,?,?)";
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
			psmt.setString(2, vo.getCommentBoardNo());
			psmt.setString(3, vo.getCommentWriter());
			psmt.setString(4, vo.getCommentCont());
			psmt.setString(5, vo.getCommentPwd());
			
			psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return vo;
	}
	
	//댓글 수정
	public commentVO commentUpdate(commentVO vo) {
		String sql = "update board_comment "
				+ " set comment_cont =?"
				+ " where comment_no=?";
		connect();
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, vo.getCommentCont());
			psmt.setString(2, vo.getCommentNo());
			
			int r = psmt.executeUpdate();
			System.out.println(r+"건 수정");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return vo;
		
	}
	
	//댓글 삭제
	public commentVO commentDelete(String no) {
		commentVO vo = new commentVO();
		String sql = "delete board_comment where comment_no=?";
		connect();
		
		try {
			psmt=conn.prepareStatement(sql);
			psmt.setString(1, no);
			psmt.executeUpdate();
			return vo;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			disconnect();
		}
		return null;
	}
	
}
