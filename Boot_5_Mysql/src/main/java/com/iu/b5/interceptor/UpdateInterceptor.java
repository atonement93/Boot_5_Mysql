package com.iu.b5.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.iu.b5.board.BoardVO;
import com.iu.b5.member.MemberVO;
@Component
public class UpdateInterceptor implements HandlerInterceptor{

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		//1. 로그인 유저
		MemberVO memberVO = (MemberVO) request.getSession().getAttribute("member");
		
		//2. 작성자
		Map<String, Object> model = modelAndView.getModel();
		BoardVO boardVO = (BoardVO) model.get("boardVO");
		
		if(!memberVO.getId().equals(boardVO.getWriter())) {
			modelAndView.addObject("msg", "작성자 아님");
			modelAndView.addObject("path", "./selectList");
			modelAndView.setViewName("commom/result");
		}
	}
}
