package com.cognizant.claimmicroservice.exception;

//public class ProviderNotFoundException extends Exception {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	public ProviderNotFoundException(String msg) {
//
//		super(msg);
//	}
//	public ProviderNotFoundException() {
//
//		super();
//	}
//
//}
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "providerid is not found....")
public class ProviderNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProviderNotFoundException(String string) {
		super(string);
	}



}
