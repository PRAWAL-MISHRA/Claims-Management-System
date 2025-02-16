package com.cognizant.claimmicroservice.exception;
//
//public class BenefitsNotFoundException  extends Exception{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	
//	public BenefitsNotFoundException(String msg) {
//		super(msg);
//		
//	}
//	
//	public BenefitsNotFoundException() {
//		super();
//		
//	}
//
//}


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(value = HttpStatus.BAD_GATEWAY, reason = "BenefitId is not found....")
public class BenefitsNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
