package com.example.Study.Member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member/*")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@GetMapping(value = "idCheck")
	public String getMemberIdCheck(MemberDTO memberDTO, Model model)throws Exception{
		memberDTO = memberService.getMemberIdCheck(memberDTO);
		return ;
	}
	//회원가입
		@GetMapping("memberJoin")
		public ModelAndView setMemberJoin() throws Exception {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("/member/memberJoin");
			
			return mv;
		}
		
		@PostMapping("memberJoin")
		public ModelAndView setMemberJoin(MemberDTO memberDTO) throws Exception {
			ModelAndView mv = new ModelAndView();
			
			
			int result = memberService.setMemberJoin(memberDTO);
			
			mv.setViewName("redirect:../");
			
			return mv;
		}
}
