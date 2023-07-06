package kr.co.dw.domain;

import java.util.Date;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
public class MemberDTO {

	
	private final Long mNo;
	
	private final String mId;
	
	private final String email;
	
	private final Date regDate;
	
	
}
