package com.cognizant.policymicroservice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.cognizant.policymicroservice.client.AuthClient;
import com.cognizant.policymicroservice.model.ProviderPolicy;
import com.cognizant.policymicroservice.repository.BenefitRepo;
import com.cognizant.policymicroservice.repository.MemberPolicyRepo;
import com.cognizant.policymicroservice.repository.PolicyRepository;
import com.cognizant.policymicroservice.repository.ProviderPolicyRepo;
import com.cognizant.policymicroservice.serviceImpl.PolicyServiceImpl;



@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = PolicyMicroserviceContoller.class)
public class TestChainOfBenifits {

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
		 ProviderPolicy providerPolicy=new ProviderPolicy(4,"Apollo Hospital","Dhayari",1,"Pune");  
		 List<ProviderPolicy> providerPolicies=Arrays.asList(providerPolicy);
		when(policyServiceImpl.findAllByPolicyIdOrderByLocation(Mockito.anyInt())).thenReturn((providerPolicies));
		Integer policyId=1;
		
		mockMvc.perform(get("/getChainOfProviders/{policyId}",policyId).header("Authorization", "token"))
						.andExpect(status().isOk());
	}
	
	@Test
	void testGetCallNegativeWithAuthorizationException() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
		 ProviderPolicy providerPolicy=new ProviderPolicy(4,"Apollo Hospital","Dhayari",1,"Pune");  
		 List<ProviderPolicy> providerPolicies=Arrays.asList(providerPolicy);
		when(policyServiceImpl.findAllByPolicyIdOrderByLocation(Mockito.anyInt())).thenReturn((providerPolicies));
		Integer policyId=1;
		
		mockMvc.perform(get("/getChainOfProviders/{policyId}",policyId).header("Authorization", "wrongtoken"))
						.andExpect(status().isForbidden());
	}

	
}