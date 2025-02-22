package com.cognizant.membermicroservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "Authorizatiion-Microservice", url = "${auth.URL}")
public interface AuthClient {
	@GetMapping("/validate")
	public boolean getValidity(@RequestHeader("Authorization") String token);
}