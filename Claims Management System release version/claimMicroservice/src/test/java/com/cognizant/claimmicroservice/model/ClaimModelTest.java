package com.cognizant.claimmicroservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClaimModelTest {

	private Claim user1;
	private Claim user2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		user1 = new Claim();
		user2 = new Claim(1,"hello","str",1,1,1,1,1.2,2.3);
	}
	
	@Test
    void testPensionerBean() {
        final BeanTester beanTester = new BeanTester();
        beanTester.getFactoryCollection();
        beanTester.testBean(Claim.class);
    }
}
