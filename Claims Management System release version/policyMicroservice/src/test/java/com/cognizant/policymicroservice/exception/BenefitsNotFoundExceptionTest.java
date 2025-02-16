package com.cognizant.policymicroservice.exception;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BenefitsNotFoundExceptionTest {
	private BenefitNotFoundException e = new BenefitNotFoundException("message");
	@Test
	void testMessageSetter() {
		assertThat(e).isNotNull();
	}	
}