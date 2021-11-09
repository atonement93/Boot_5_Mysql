package com.iu.b5.member;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/**")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping("memberLogin")
	public void getSelectOne() throws Exception{
		
	}
	
	@PostMapping("memberLogin")
	public String getSelectOne(MemberVO memberVO, HttpSession session) throws Exception{
		memberVO = memberService.getSelectOne(memberVO);
		
		if(memberVO != null) {
			session.setAttribute("member", memberVO);
		}
		return "redirect:../";
	}
	
	//회원가입 폼으로 이동
	@GetMapping("memberJoin")
	public void setInsert(@ModelAttribute MemberVO memberVO) throws Exception{
//		방법1 - 리턴 String
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("member/memberJoin");
//		return "member/memberJoin";
		
		//방법2 - 리턴 그냥 void
	}
	
	//회원가입 처리
	@PostMapping("memberJoin")
	public String setInsert(@Valid MemberVO memberVO, BindingResult bindingResult, MultipartFile files) throws Exception{
		if(bindingResult.hasErrors()) {
			return "member/memberJoin";
		}
		
//		int result = memberService.setInsert(memberVO, files);
//		방법1 - 리턴 String
		return "redirect:../";
		
//		방법2 - 비추천, 코드만 길어짐
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("redirect:../");
//		
//		return "redirect:../";
	}
}
