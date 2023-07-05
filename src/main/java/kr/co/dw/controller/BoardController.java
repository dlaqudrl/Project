package kr.co.dw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.dw.domain.MemberDTO;
import kr.co.dw.service.MemberService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {

	private final MemberService MemberService;
	
	@GetMapping(value = "/")
	public String index() {
		return "index";
	}
	
	@GetMapping(value = "/insert")
	public String insert(MemberDTO MemberDto) {
		MemberDTO dto = new MemberDTO(0L, "aaa");
		MemberService.insert(dto);
		return "index";
	}
	
}
