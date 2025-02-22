package com.cognizant.claimmicroservice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.cognizant.claimmicroservice.client.AuthClient;
import com.cognizant.claimmicroservice.controller.ClaimsController;
import com.cognizant.claimmicroservice.dto.ClaimStatusDTO;
import com.cognizant.claimmicroservice.service.ClaimService;


/*
 * test case for getChainOfProviders in policyMicroserviceController class
 */
@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = ClaimsController.class)
public class TestsubmitClaim {
	@Autowired
	private MockMvc mockMvc;
	@InjectMocks
	private ClaimsController controllerMock;
	@MockBean
	AuthClient authClient;
	
	@MockBean
	ClaimService claimserviceImpl;
	@MockBean
	ClaimStatusDTO claimStatusDTO;

//
//	
//	@Test
//	void testGetCallPositive() throws Exception {
//		when(authClient.getValidity("token")).thenReturn(true);
//		ClaimStatusDTO claimStatusDTO=new ClaimStatusDTO("claimed","Get sucesses");
//		when(claimserviceImpl.processSubmitClaim(Mockito.anyInt(), Mockito.anyInt(),Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt(), Mockito.anyDouble(), Mockito.anyDouble(), Mockito.anyString()))
//		.thenReturn((claimStatusDTO));
//		Integer policyId=1;
//		Integer claimId=1;
//		Integer memberId=1;
//		Integer providerId=1;
//		Integer benefitId=1;
//		double totalAmount=1;
//		double claimedAmount=1;
//		
//		
//		mockMvc.perform(post("/submitClaim/{policyId}/{claimId}/{memberId}/{providerId}/{benefitId}/{totalAmount}/{claimedAmount}"
//				,policyId,claimId,memberId,providerId,benefitId,totalAmount,claimedAmount)
//				.header("Authorization", "token"))
//						.andExpect(status().isOk());
//	}
//	
//	
//	@Test
//	void testGetCallNegativveAuthorizationException() throws Exception {
//		when(authClient.getValidity("token")).thenReturn(true);
//		ClaimStatusDTO claimStatusDTO=new ClaimStatusDTO("claimed","Get sucesses");
//		when(claimserviceImpl.processSubmitClaim(Mockito.anyInt(), Mockito.anyInt(),Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt(), Mockito.anyDouble(), Mockito.anyDouble(), Mockito.anyString()))
//		.thenReturn((claimStatusDTO));
//		Integer policyId=1;
//		Integer claimId=1;
//		Integer memberId=1;
//		Integer providerId=1;
//		Integer benefitId=1;
//		double totalAmount=1;
//		double claimedAmount=1;
//		
//		
//		mockMvc.perform(post("/submitClaim/{policyId}/{claimId}/{memberId}/{providerId}/{benefitId}/{totalAmount}/{claimedAmount}"
//				,policyId,claimId,memberId,providerId,benefitId,totalAmount,claimedAmount)
//				.header("Authorization", "wrongtoken"))
//						.andExpect(status().isForbidden());
//	}
//	
//
//


}