package kr.co.dw.repository;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.dw.Mapper.MemberMapper;
import kr.co.dw.domain.MemberDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MemberRepositoryimpl implements MemberRepository{
	
	private final MemberMapper mapper;
	
	@Override
	public void insert(MemberDTO memberDto) {
		// TODO Auto-generated method stub
		
		mapper.insert(memberDto);
	}


}
