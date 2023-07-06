package kr.co.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import kr.co.dw.domain.MemberDTO;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MemberController {

	
	
	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value = "/insert")
	public String insert(MemberDTO MemberDto) {
		
		
		return "index";
	}
	
}
