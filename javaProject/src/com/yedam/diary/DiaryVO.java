package com.yedam.diary;

import java.io.Serializable;

//기능 담당..
public class DiaryVO implements Serializable{
	//속성
	private static final long serialVersionUID = 1L;
	private String wdate;
	private String contents;
	
	
	//메소드
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
	
	@Override
	public String toString() {
		return "DiaryVO [wdate=" + wdate + ", contents=" + contents + "]";
	}
	
	
}
