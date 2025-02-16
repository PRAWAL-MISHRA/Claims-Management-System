package com.cognizant.policymicroservice.exception;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberNotFoundExceptionTest {
	private MemberNotFoundException e = new MemberNotFoundException();
	@Test
	void testMessageSetter() {
		assertThat(e).isNotNull();
	}	
}