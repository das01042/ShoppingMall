package com.shop.VO;

public class boardVO {
	private String no;
	private String title;
	private String content;
	private String writer;
	
	public boardVO(String no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public boardVO() {
		super();
	}
	@Override
	public String toString() {
		return "boardVO [no=" + no + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	

	
}
