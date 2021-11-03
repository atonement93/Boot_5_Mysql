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
	
	public void makeNum(Long totalCount) { //104개
		//2. 전체 페이지 갯수 구하기
		Long totalPage = totalCount/this.getPerPage();//10
		if(totalCount%this.getPerPage() != 0) {
			totalPage++;//11
		}
		
		//3. 총 블럭의 갯수 구하기
		Long perBlock=5L;//1~5, 6~10, 11~15, 16~20, 21 ?
		Long totalBlock = totalPage/perBlock; //2
		if(totalPage%perBlock != 0) {
			totalBlock++;//3
		}
		
		//4. pn으로 현재 블럭 번호 구하기
		Long curBlock = this.getPn()/perBlock;
		if(this.getPn()%perBlock !=0) {
			curBlock++;
		}
		
		//5. curBlock으로 시작번호와 끝번호 구하기
		Long startNum = (curBlock-1)*perBlock+1;
		Long lastNum = curBlock*perBlock;
		
		System.out.println("시작번호 : "+startNum);
		System.out.println("끝번호 : "+lastNum);
	}
	
	//---------------- getter, setter
	
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
