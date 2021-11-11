package com.iu.b5.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.b5.board.BoardVO;
import com.iu.b5.util.Pager;
@Service
public class QnaService {
	@Autowired //DI
	private QnaRepository qnaRepository;
	
	//@Override
	public int setInsert(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaRepository.setInsert(boardVO);
	}

	//@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaRepository.setUpdate(boardVO);
	}

	//@Override
	public int setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaRepository.setDelete(boardVO);
	}

	//@Override
	public BoardVO getSelectOne(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return qnaRepository.getSelectOne(boardVO);
	}

	//@Override
	public List<BoardVO> getSelectList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRow();
		//1. 총 글의 갯수 - DB에서 조회
		Long totalCount = qnaRepository.getTotalCount(pager);
		System.out.println("총 글의 갯수 : "+totalCount);
		pager.makeNum(totalCount);
		return qnaRepository.getSelectList(pager);
	}
}
