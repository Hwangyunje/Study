package com.example.Study.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping(value = "idCheck")
	public String getMemberIdCheck(MemberDTO memberDTO, Model model)throws Exception{
		memberDTO = memberService.getMemberIdCheck(memberDTO);
	}
}
