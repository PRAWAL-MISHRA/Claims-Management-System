package com.cognizant.policymicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class PolicyMicroservice2Application {
	
	public static void main(String[] args) {
		
		SpringApplication.run(PolicyMicroservice2Application.class, args);
		log.info("Policy microservice started");
	}

}
