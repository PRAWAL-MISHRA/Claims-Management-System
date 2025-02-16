package com.cognizant.claimmicroservice.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.meanbean.test.BeanTester;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PolicyModelTest {

	private ProviderPolicy user1;
	private ProviderPolicy user2;
	

	@BeforeEach
	void setUp() throws Exception {
		
		user1 = new ProviderPolicy();
		user2 = new ProviderPolicy(1, "user", "india",1,"hyd");
	}
	
	@Test
    void testPensionerBean() {
        final BeanTester beanTester = new BeanTester();
        beanTester.getFactoryCollection();
        beanTester.testBean(ProviderPolicy.class);
    }
}
