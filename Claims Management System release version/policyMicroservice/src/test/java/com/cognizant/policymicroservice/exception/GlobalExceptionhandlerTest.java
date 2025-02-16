package com.cognizant.policymicroservice.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class GlobalExceptionhandlerTest {
	@InjectMocks
	GlobalExceptionHandler globalExceptionHandler;
	@Mock
	ExceptionDetails customErrorResponse;
	@BeforeEach
	void setUp() {
		customErrorResponse = new ExceptionDetails(LocalDateTime.now(),HttpStatus.UNAUTHORIZED,"test message");
	}
	@Test
	void handlesAuthorizationExceptionTest() {
		AuthorizationException e = new AuthorizationException("message");
		globalExceptionHandler.handleAuthorizationException(e);
		ResponseEntity<?> entity = new ResponseEntity<>(customErrorResponse, HttpStatus.UNAUTHORIZED);
		assertEquals(401, entity.getStatusCodeValue());
	}
//	@Test
//	void handlesBenifitNotFoundTest() throws Exception {
//		BenefitNotFoundException e = new BenefitNotFoundException();
//		globalExceptionHandler.handleException(e,null);
//		ResponseEntity<?> entity = new ResponseEntity<>(customErrorResponse, HttpStatus.UNAUTHORIZED);
//		assertEquals(401, entity.getStatusCodeValue());
//	}
//	@Test
//	void handlespolicyNotFoundTest() throws Exception {
//		PolicyNotFoundException e = new PolicyNotFoundException();
//		globalExceptionHandler.handleException(e,null);
//		ResponseEntity<?> entity = new ResponseEntity<>(customErrorResponse, HttpStatus.UNAUTHORIZED);
//		assertEquals(401, entity.getStatusCodeValue());
//	}
//	@Test
//	void handlesMemberNotFoundTest() throws Exception {
//		MemberNotFoundException e = new MemberNotFoundException();
//		globalExceptionHandler.handleException(e,null);
//		ResponseEntity<?> entity = new ResponseEntity<>(customErrorResponse, HttpStatus.UNAUTHORIZED);
//		assertEquals(401, entity.getStatusCodeValue());
//	}
//	@Test
//	public void  handlesBenifitNotFoundTest() {
//		BenefitNotFoundException e = new BenefitNotFoundException("message");
//		//PatientNameAlreadyExistsException e = new PatientNameAlreadyExistsException("message");
//		globalExceptionHandler.springHandleBenefittNotFound(HttpStatus.BAD_REQUEST);;
//		ResponseEntity<?> entity = new ResponseEntity<>(customErrorResponse, HttpStatus.UNAUTHORIZED);
//		assertEquals(401, entity.getStatusCodeValue());
//	}
	
}