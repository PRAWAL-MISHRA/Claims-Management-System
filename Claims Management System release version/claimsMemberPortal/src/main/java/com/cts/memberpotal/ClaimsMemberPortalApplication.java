package com.cts.memberpotal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ClaimsMemberPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClaimsMemberPortalApplication.class, args);
	}

}
