package kr.co.dw.domain;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Data
public class MemberDTO {

	
	private final Long id;
	
	private final String name;
	
}
