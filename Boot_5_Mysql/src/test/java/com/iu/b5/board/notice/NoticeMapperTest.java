package com.iu.b5.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iu.b5.board.BoardVO;
@SpringBootTest
class NoticeMapperTest {

	@Autowired
	private NoticeMapper noticeMapper;
	
	//@Test
	void getSelectListTest() throws Exception {
//		List<BoardVO> ar = noticeMapper.getSelectList();
//		
//		assertNotEquals(0, ar.size());
	}
	
	//@Test
	void getSelectOneTest() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(5);
		System.out.println(boardVO.hashCode());
		boardVO = noticeMapper.getSelectOne(boardVO);
		System.out.println(boardVO.hashCode());
		
		assertNotNull(boardVO);
	}
	
	//@Test
	void setDeleteTest() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(4);
		
		int result = noticeMapper.setDelete(boardVO);
		assertNotEquals(0, result);
	}
	
	//@Test
	void setUpdateTest() throws Exception{
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("updateTitle");
		boardVO.setContents("updateContents");
		boardVO.setNum(3);
		
		int result = noticeMapper.setUpdate(boardVO);
		assertNotEquals(0, result);
	}
	
	@Test
	void setInsertTest() throws Exception{
		for(int i=0;i<100;i++) {
		BoardVO boardVO = new BoardVO();
		boardVO.setTitle("title"+i);
		boardVO.setContents("contents"+i);
		boardVO.setWriter("writer"+i);
		
		int result = noticeMapper.setInsert(boardVO);
		
		if(i%10==0) {
			Thread.sleep(500);
		}
		
		
		}
		System.out.println("Finish");
		
//		assertNotEquals(0, result);
		
	}

}
