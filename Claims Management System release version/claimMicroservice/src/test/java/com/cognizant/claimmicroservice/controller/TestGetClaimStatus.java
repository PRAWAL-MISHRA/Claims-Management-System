package com.cognizant.claimmicroservice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
import com.cognizant.claimmicroservice.model.Claim;
import com.cognizant.claimmicroservice.service.ClaimService;


/*
 * test case for getChainOfProviders in policyMicroserviceController class
 */
@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = ClaimsController.class)
public class TestGetClaimStatus {
	@Autowired
	private MockMvc mockMvc;
	@InjectMocks
	private ClaimsController controllerMock;
	@MockBean
	AuthClient authClient;
	
	@MockBean
	ClaimService claimserviceImpl;
	@MockBean
	Claim claimStatusDTO;


	
	@Test
	void testGetCallPositive() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
		ClaimStatusDTO claimStatusDTO=new ClaimStatusDTO("claimed","Get sucesses");
		//when(claimserviceImpl.getClaimStatus(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt())).thenReturn((claimStatusDTO));
		Integer policyId=1;
		Integer claimId=1;
		Integer memberId=1;
		
		mockMvc.perform(get("/getClaimStatus/{claimId}/{policyId}/{memberId}",claimId,policyId,memberId).header("Authorization", "token"))
						.andExpect(status().isOk());
	}
	
	@Test
	void testGetCallNegativeAuthorizationException() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
	//	Claim claimStatusDTO=new ClaimStatusDTO("claimed","Get sucesses");
		when(claimserviceImpl.getClaimStatus(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyInt())).thenReturn((claimStatusDTO));
		Integer policyId=1;
		Integer claimId=1;
		Integer memberId=1;
		
		mockMvc.perform(get("/getClaimStatus/{claimId}/{policyId}/{memberId}",claimId,policyId,memberId).header("Authorization", "wrongtoken"))
						.andExpect(status().isForbidden());
	}
	




}