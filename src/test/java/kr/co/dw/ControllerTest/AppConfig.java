package kr.co.dw.ControllerTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.dw.repository.MemberRepository;
import kr.co.dw.repository.MemberRepositoryimpl;

@Configuration
public class AppConfig {

	
	
	@Bean
	public MemberRepository MemberRepository() {
		return new MemberRepositoryimpl(null);
	}
	
}
