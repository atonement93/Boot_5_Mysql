package com.iu.b5.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.b5.util.FileManager;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRepository;
	@Autowired
	private FileManager fileManager;
	
	
	
	public int setInsert(MemberVO memberVO, MultipartFile files) throws Exception {
		int result = memberRepository.setInsert(memberVO);
		
		//파일이 실제 있을 때만 실행(isEmpty 혹은 사이즈가 0보다 클 때)
		if(!files.isEmpty()) {
		String fileName = fileManager.getUserServletContext("upload/member", files);
		MemberFilesVO memberFilesVO = new MemberFilesVO();
		memberFilesVO.setMember_id(memberVO.getId());
		memberFilesVO.setFileName(fileName);
		memberFilesVO.setOriName(files.getOriginalFilename());
		result = memberRepository.setFileInsert(memberFilesVO);
		}
		memberRepository.setFileInsert(null);
		return result;
	}
	

}
