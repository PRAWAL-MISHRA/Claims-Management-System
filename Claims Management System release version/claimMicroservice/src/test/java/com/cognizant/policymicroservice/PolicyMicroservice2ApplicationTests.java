package com.cognizant.policymicroservice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.claimmicroservice.ClaimMicroservice2Application;

@SpringBootTest(classes=ClaimMicroservice2Application.class)
class AuthorizatiionMicroserviceApplicationTests {

	@Test
	void main() {
		ClaimMicroservice2Application.main(new String[] {});
	}
}



