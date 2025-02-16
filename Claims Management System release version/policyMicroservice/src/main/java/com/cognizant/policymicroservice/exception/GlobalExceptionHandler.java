package com.cognizant.policymicroservice.exception;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletResponse;
//import javax.validation.ConstraintViolationException;
import javax.validation.ConstraintViolationException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(AuthorizationException.class)
	public ResponseEntity<ExceptionDetails> handleAuthorizationException(AuthorizationException ex) {
		ExceptionDetails exceptionDetail = new ExceptionDetails(LocalDateTime.now(), HttpStatus.FORBIDDEN,
				ex.getMessage());
		if(logger.isErrorEnabled()) {
			log.error(ex.getMessage());
			}
		return new ResponseEntity<ExceptionDetails>(exceptionDetail, HttpStatus.FORBIDDEN);
	}
	@ExceptionHandler(MemberPolicyNotFoundException.class)
	public ResponseEntity<ExceptionDetails> memberPolicyNotFoundExceptionGlobal(MemberPolicyNotFoundException ex) {
		ExceptionDetails exceptionDetail = new ExceptionDetails(LocalDateTime.now(), HttpStatus.FORBIDDEN,
				ex.getMessage());
		if(logger.isErrorEnabled()) {
			log.error(ex.getMessage());
			}
		return new ResponseEntity<ExceptionDetails>(exceptionDetail, HttpStatus.FORBIDDEN);
	}
	
	@ExceptionHandler(PolicyNotFoundException.class)
	public ResponseEntity<ExceptionDetails> policyNotFoundExceptionGlobal(MemberPolicyNotFoundException ex) {
		ExceptionDetails exceptionDetail = new ExceptionDetails(LocalDateTime.now(), HttpStatus.FORBIDDEN,
				ex.getMessage());
		if(logger.isErrorEnabled()) {
			log.error(ex.getMessage());
			}
		return new ResponseEntity<ExceptionDetails>(exceptionDetail, HttpStatus.FORBIDDEN);
	}
	

	

	@ExceptionHandler(MemberNotFoundException.class)
	public void springHandleMembertNotFound(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value(), "member Id is not found............global");
	}

	@ExceptionHandler(BenefitNotFoundException.class)
	public void springHandleBenefittNotFound(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value(), "benefitId is not found............global");
	}

	@ExceptionHandler(ConstraintViolationException.class)
	public void springHandleNotFound(HttpServletResponse response) throws IOException {
		response.sendError(HttpStatus.BAD_REQUEST.value(),"constraint validation error");
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {

		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("timestamp", new Date());
		body.put("status", status.value());
		// Get all errors
		List<String> errors = ex.getBindingResult().getFieldErrors().stream().map(x -> x.getDefaultMessage())
				.collect(Collectors.toList());
		body.put("errors", errors);
		return new ResponseEntity<>(body, headers, status);
	}


}
