package com.shop.VO;

public class commentVO {
	private String commentNo;
	private String commentBoardNo;
	private String commentWriter;
	private String commentCont;
	private String commentPwd;
	
	
	public commentVO() {
		super();
	}
	@Override
	public String toString() {
		return "board_commentVO [commentNo=" + commentNo + ", commentBoardNo=" + commentBoardNo + ", commentWriter="
				+ commentWriter + ", commentCont=" + commentCont + ", commentPwd=" + commentPwd + "]";
	}
	public String getCommentNo() {
		return commentNo;
	}
	public void setCommentNo(String commentNo) {
		this.commentNo = commentNo;
	}
	public String getCommentBoardNo() {
		return commentBoardNo;
	}
	public void setCommentBoardNo(String commentBoardNo) {
		this.commentBoardNo = commentBoardNo;
	}
	public String getCommentWriter() {
		return commentWriter;
	}
	public void setCommentWriter(String commentWriter) {
		this.commentWriter = commentWriter;
	}
	public String getCommentCont() {
		return commentCont;
	}
	public void setCommentCont(String commentCont) {
		this.commentCont = commentCont;
	}
	public String getCommentPwd() {
		return commentPwd;
	}
	public void setCommentPwd(String commentPwd) {
		this.commentPwd = commentPwd;
	}
	
}
