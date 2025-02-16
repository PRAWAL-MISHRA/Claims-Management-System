package com.cognizant.membermicroservice.exception;

public class AuthorizationException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AuthorizationException(String message) {
		super(message);
	}

	public AuthorizationException() {
		// TODO Auto-generated constructor stub
	}
}
