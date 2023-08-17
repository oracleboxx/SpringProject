package kro.rubisco.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kro.rubisco.dto.MemberDTO;
import kro.rubisco.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
private final MemberService memberService;

public MemberController(MemberService memberService) {
	this.memberService=memberService;
}
 @GetMapping()
 public String getMemberInfo() {
	 return "member/getMemberInfo";
	 
 }
 @GetMapping(params="act=signUp")
 public String getSignUpView() throws Exception{
	 return "member/signUpForm";
 }

 @PostMapping()
 public String insertMember(MemberDTO member) throws Exception{
	 
	 memberService.regist(member);
	 return "redirect:/";
 }
 
 @PatchMapping()
 public String updateMember(MemberDTO member)throws Exception{
	 memberService.modify(member);
	 return "redirect:/member";
	 
 }
}
