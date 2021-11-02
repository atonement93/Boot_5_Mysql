package com.iu.b5.board;

import java.util.List;

public interface BoardService {
	
	//Insert 글쓰기
	public int setInsert(BoardVO boardVO) throws Exception;

	//update 글수정
	public int setUpdate(BoardVO boardVO) throws Exception;
	
	//Delete 글삭제
	public int setDelete(BoardVO boardVO) throws Exception;

	//select 글 하나 조회
	public BoardVO getSelectOne(BoardVO boardVO) throws Exception;
	
	//select 글 리스트 조회
	public List<BoardVO> getSelectList() throws Exception;
}
