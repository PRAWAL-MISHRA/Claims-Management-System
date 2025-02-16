package com.cognizant.claimmicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "Authorizatiion-Microservice", url = "${auth.URL}")
public interface AuthClient {
	
	@GetMapping("/validate")
	public boolean getValidity(@RequestHeader("Authorization") String token);
}