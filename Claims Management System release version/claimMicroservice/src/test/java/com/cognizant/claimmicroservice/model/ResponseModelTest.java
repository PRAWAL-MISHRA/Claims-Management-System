package com.cognizant.claimmicroservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ResponseModelTest {

	private AuthenticationResponse user1;
	private AuthenticationResponse user2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		user1 = new AuthenticationResponse();
		user2 = new AuthenticationResponse("user",true);
	}
	
	@Test
    void testPensionerBean() {
        final BeanTester beanTester = new BeanTester();
        beanTester.getFactoryCollection();
        beanTester.testBean(AuthenticationResponse.class);
    }
}
