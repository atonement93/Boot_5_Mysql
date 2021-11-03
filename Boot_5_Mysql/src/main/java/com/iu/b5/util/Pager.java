package com.iu.b5.util;

public class Pager {

	private String kind;
	private String search;
	
	//----------------------
	
	private Integer perPage; //한 페이지에 글 몇개
	private Integer pn; //현재페이지 번호
	private Integer startRow; //limit의 시작번호
	
	
	public void makeRow() {
		this.startRow = (this.getPn()-1)*this.getPerPage();
	}
	
	public Integer getPn() {
		if(this.pn==null || this.pn==0) {
			this.pn=1;
		}
		return pn;
	}
	
	public String getSearch() {
		if(this.search==null) {
			this.search="";
		}
		return this.search;
	}
	
	public Integer getPerPage() {
		if(this.perPage==null || this.perPage<1) {
			this.perPage=10;
		}
		return perPage;
	}
	
	//---------------- getter, setter
	

	public void setPerPage(Integer perPage) {
		this.perPage = perPage;
	}

	public void setPn(Integer pn) {
		this.pn = pn;
	}

	public Integer getStartRow() {
		return startRow;
	}

	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setSearch(String search) {
		this.search = search;
	}
	

}
