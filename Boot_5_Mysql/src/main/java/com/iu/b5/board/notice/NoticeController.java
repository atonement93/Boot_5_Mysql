package com.iu.b5.board.notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iu.b5.board.BoardVO;

@RestController
@RequestMapping("/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("insert")
	public void setInsert() throws Exception{
		
	}
	
	@GetMapping("selectOne")
	public BoardVO getSelectOne(int num) throws Exception{
		//String num = request.getParameter("num");
		//int n = Integer.parseInt(num);
		BoardVO boardVO = new BoardVO();
		boardVO.setNum(num);
		boardVO = noticeService.getSelectOne(boardVO);
		
		return boardVO;
	}

}
