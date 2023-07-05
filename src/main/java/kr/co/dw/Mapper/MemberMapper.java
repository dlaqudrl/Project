package kr.co.dw.Mapper;

import org.apache.ibatis.annotations.Mapper;

import kr.co.dw.domain.MemberDTO;

@Mapper
public interface MemberMapper {

	void insert(MemberDTO memberDto);
	
}
