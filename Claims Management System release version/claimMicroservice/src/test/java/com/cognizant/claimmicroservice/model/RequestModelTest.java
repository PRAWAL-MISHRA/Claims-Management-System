package com.cognizant.claimmicroservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RequestModelTest {

	private AuthenticationRequest user1;
	private AuthenticationRequest user2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		user1 = new AuthenticationRequest();
		user2 = new AuthenticationRequest("user","pass");
	}
	
	@Test
    void testPensionerBean() {
        final BeanTester beanTester = new BeanTester();
        beanTester.getFactoryCollection();
        beanTester.testBean(AuthenticationRequest.class);
    }
}
