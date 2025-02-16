package com.cognizant.claimmicroservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BenefitsModelTest {

	private Benefits user1;
	private Benefits user2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		user1 = new Benefits();
		user2 = new Benefits(1, "user");
	}
	
	@Test
    void testPensionerBean() {
        final BeanTester beanTester = new BeanTester();
        beanTester.getFactoryCollection();
        beanTester.testBean(Benefits.class);
    }
}
