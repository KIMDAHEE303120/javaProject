package com.yedam.diary;

import java.util.List;

//기능을 담당하는 인터페이스,,, 
public interface DAO {
	public int insert(DiaryVO vo);
	public void update(DiaryVO vo);
	public int delete(String date);
	public DiaryVO selectDate(String date);
	public List<DiaryVO> selectContent(String content);
	public List<DiaryVO> selectAll();

}
