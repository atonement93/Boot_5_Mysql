package com.iu.b5.board;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class BoardVO {
	
	private Integer num;
	@NotBlank(message = "칸을 채워주세요.")
	private String title;
	private String contents;
	@Size(min=3, max=6)
	private String writer;
	private Integer hit;
	private Date regDate;
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Integer getHit() {
		return hit;
	}
	public void setHit(Integer hit) {
		this.hit = hit;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	

}
