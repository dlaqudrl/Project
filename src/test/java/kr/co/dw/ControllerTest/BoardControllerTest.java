package kr.co.dw.ControllerTest;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.test.annotation.Rollback;

import kr.co.dw.Mapper.MemberMapper;
import kr.co.dw.domain.MemberDTO;
import kr.co.dw.repository.MemberRepository;
import kr.co.dw.repository.MemberRepositoryimpl;



@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(value = false)
public class BoardControllerTest {

	@Autowired
	private MemberMapper MemberMapper;
	
	
	@Test
	public void insert() {
		MemberDTO memberDto = new MemberDTO(0L, "qqq");
		MemberMapper.insert(memberDto);
	}
	
}
