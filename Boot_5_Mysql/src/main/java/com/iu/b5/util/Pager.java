package com.iu.b5.util;

public class Pager {

	private String kind;
	private String search;
	
	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		if(this.search==null) {
			this.search="";
		}
		return this.search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
}
