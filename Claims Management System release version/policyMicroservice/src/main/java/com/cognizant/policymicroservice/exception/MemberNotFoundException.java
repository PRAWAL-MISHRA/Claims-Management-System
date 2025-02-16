package com.cognizant.policymicroservice.exception;
 import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "MemberId is not found....")
public class MemberNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;
	
}
