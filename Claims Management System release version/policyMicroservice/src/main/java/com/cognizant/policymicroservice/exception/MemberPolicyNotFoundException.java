package com.cognizant.policymicroservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "member policy is not found....")
public class MemberPolicyNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public MemberPolicyNotFoundException(String msg) {
		super(msg);
	}
}
