package com.cognizant.membermicroservice.exception;
 import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "policyId is not found....")
public class PolicyNotFoundException extends Exception{
	
}
