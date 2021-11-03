package com.iu.b5.board.notice;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iu.b5.board.BoardVO;

@RestController
@RequestMapping("/notice/**")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	@GetMapping("insert")
	public String setInsert() throws Exception{
		return "board/insert";
	}
	
	@PostMapping("insert")
	public String setInsert(BoardVO boardVO) throws Exception {
		int result = noticeService.setInsert(boardVO);
//		if(result>0) {
//			
//		}
		return "redirect:./selectList";
	}
	
	@GetMapping("update")
	public String setUpdate(BoardVO boardVO, Model model) throws Exception{
		boardVO = noticeService.getSelectOne(boardVO);
		model.addAttribute("boardVO", boardVO);
		
		return "board/update";
	}
	
	@PostMapping("update")
	public String setUpdate(BoardVO boardVO) throws Exception{
		int result = noticeService.setUpdate(boardVO);
		
		return "redirect:./selectList";
	}
	
	@GetMapping("selectOne")
	public BoardVO getSelectOne(BoardVO boardVO) throws Exception{
		//String num = request.getParameter("num");
		//int n = Integer.parseInt(num);
		//BoardVO boardVO = new BoardVO();
		//boardVO.setNum(num);
		boardVO = noticeService.getSelectOne(boardVO);
		
		return boardVO;
	}

}
