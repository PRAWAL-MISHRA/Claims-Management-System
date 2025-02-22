package com.cts.memberpotal.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.memberpotal.vo.JwtRequest;
import com.cts.memberpotal.vo.UserData;

@FeignClient(name = "Microservice", url = "${auth.URL}")
public interface AuthClient {
	
	@PostMapping("/login")
	public ResponseEntity<UserData> login(@RequestBody JwtRequest userlogincredentials);
	
	@GetMapping("/validate")
	public boolean getValidity(@RequestHeader("Authorization") String token);
}