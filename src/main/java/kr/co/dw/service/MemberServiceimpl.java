package kr.co.dw.service;

import org.springframework.stereotype.Service;

import kr.co.dw.domain.MemberDTO;
import kr.co.dw.repository.MemberRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceimpl implements MemberService{

	private final MemberRepository MemberRepository;
	
	

	@Override
	public void insert(MemberDTO memberDto) {
		// TODO Auto-generated method stub
		MemberRepository.insert(memberDto);
	}

	

}
