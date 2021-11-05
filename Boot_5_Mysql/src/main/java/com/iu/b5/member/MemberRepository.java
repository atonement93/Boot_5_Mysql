package com.iu.b5.member;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Repository - Mapper가 있어 생략가능
@Mapper
public interface MemberRepository {
	
	//로그인
	public MemberVO getSelectOne(MemberVO memberVO) throws Exception;
	
	//회원가입
	public int setInsert(MemberVO memberVO) throws Exception;
	
	//회원파일
	public int setFileInsert (MemberFilesVO memberFilesVO) throws Exception;
}
