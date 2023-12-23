package com.example.Study.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberDAO memberDAO;

	public MemberDTO getMemberIdCheck(MemberDTO memberDTO)throws Exception{
		return memberDAO.getMemberIdCheck(memberDTO);
	}
}
