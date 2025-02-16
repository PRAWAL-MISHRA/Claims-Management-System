package com.cognizant.policymicroservice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.cognizant.policymicroservice.client.AuthClient;
import com.cognizant.policymicroservice.repository.BenefitRepo;
import com.cognizant.policymicroservice.repository.MemberPolicyRepo;
import com.cognizant.policymicroservice.repository.PolicyRepository;
import com.cognizant.policymicroservice.repository.ProviderPolicyRepo;
import com.cognizant.policymicroservice.serviceImpl.PolicyServiceImpl;



@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = PolicyMicroserviceContoller.class)
public class TestGetEligibleAmount {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	PolicyServiceImpl policyServiceImpl;
	@MockBean
	MemberPolicyRepo memberPolicyRepo;
	@MockBean
	AuthClient authClient;
	@MockBean
	PolicyRepository policyRepository;
	@MockBean
	BenefitRepo benefitRepo;
	@MockBean
	ProviderPolicyRepo providerPolicy;

	@Test
	void testGetCallPositive() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
		when(policyServiceImpl.findCapAmount(Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt())).thenReturn((double) 1000);
		Integer policyId=1;
		Integer memberId=2;
		Integer benefitId=201;
		mockMvc.perform(get("/getClaimAmount/{policyId}/{memberId}/{benefitId}",policyId,memberId,benefitId).header("Authorization", "token"))
						.andExpect(status().isOk());
	}
	
	@Test
	void testGetCallNegativeAuthorization() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
		when(policyServiceImpl.findCapAmount(Mockito.anyInt(),Mockito.anyInt(),Mockito.anyInt())).thenReturn((double) 1000);
		Integer policyId=1;
		Integer memberId=2;
		Integer benefitId=201;
		mockMvc.perform(get("/getClaimAmount/{policyId}/{memberId}/{benefitId}",policyId,memberId,benefitId).header("Authorization", "wrongtoken"))
						.andExpect(status().isForbidden());
	}
	


	
	
}