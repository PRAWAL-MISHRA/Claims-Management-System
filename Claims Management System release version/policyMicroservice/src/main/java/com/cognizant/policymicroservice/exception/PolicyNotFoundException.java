package com.cognizant.policymicroservice.exception;
 import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "policyId is not found....")
public class PolicyNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public PolicyNotFoundException(String string) {
	
		super(string);
	}
	
}
