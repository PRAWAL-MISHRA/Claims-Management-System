package com.cognizant.policymicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
/*
 * This is used for AuthClient used for authorizing using jwt token
 */
@FeignClient(name = "Authorizatiion-Microservice", url = "${auth.URL}")
public interface AuthClient {
	
	@GetMapping("/validate")
	public boolean getValidity(@RequestHeader("Authorization") String token);
}