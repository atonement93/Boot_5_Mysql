package com.iu.b5.Admin;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iu.b5.member.MemberVO;
@SpringBootTest
class AdminRepositoryTest {

	@Autowired
	private AdminRepository adminRepository;
	
	@Test
	void getMemberListTest() throws Exception {
		List<MemberVO> ar = adminRepository.getMemberList();
		
		assertNotEquals(0, ar.size());
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
