package com.cognizant.policymicroservice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.cognizant.policymicroservice.client.AuthClient;
import com.cognizant.policymicroservice.model.Benefits;
import com.cognizant.policymicroservice.repository.BenefitRepo;
import com.cognizant.policymicroservice.repository.MemberPolicyRepo;
import com.cognizant.policymicroservice.repository.PolicyRepository;
import com.cognizant.policymicroservice.repository.ProviderPolicyRepo;
import com.cognizant.policymicroservice.serviceImpl.PolicyServiceImpl;



@ExtendWith(MockitoExtension.class)
@WebMvcTest(value = PolicyMicroserviceContoller.class)
public class GetEligibleBenifitsTest {
	@InjectMocks
	PolicyMicroserviceContoller policyContoller;
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
	void testGetCallPositiveWithParameters() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
		Benefits benefits=new Benefits(1,"New Policy",1);
		List<Benefits> benefitList=Arrays.asList(benefits);
		when(policyServiceImpl.findByBenefitId(Mockito.anyInt(),Mockito.anyInt())).thenReturn((benefitList));
	
	}


	@Test
	void testGetCallPositiveWithParam() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
		Benefits benefits=new Benefits(1,"New Policy",1);
		List<Benefits> benefitList=Arrays.asList(benefits);
		when(policyServiceImpl.findByBenefitId(Mockito.anyInt(),Mockito.anyInt())).thenReturn((benefitList));
		Integer policyId=2;
		Integer memberId=4;
		mockMvc.perform(get("/getEligibleBenefits/{policyId}/{memberId}",policyId,memberId).header("Authorization", "token"));
						
		
		
	}

	@Test
	void testGetCallNegativePolicyNotFoundException() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
		Benefits benefits=new Benefits(1,"New Policy",1);
		List<Benefits> benefitList=Arrays.asList(benefits);
		when(policyServiceImpl.findByBenefitId(Mockito.anyInt(),Mockito.anyInt())).thenReturn((benefitList));
		Integer policyId=101;
		Integer memberId=4;
		mockMvc.perform(get("/getEligibleBenefits/{policyId}/{memberId}",policyId,memberId).header("Authorization", "token"));
					
	}
	
	@Test
	void testGetCallNegativeAuthroizationNotFoundException() throws Exception {
		when(authClient.getValidity("token")).thenReturn(true);
		Benefits benefits=new Benefits(1,"New Policy",1);
		List<Benefits> benefitList=Arrays.asList(benefits);
		when(policyServiceImpl.findByBenefitId(Mockito.anyInt(),Mockito.anyInt())).thenReturn((benefitList));
		Integer policyId=101;
		Integer memberId=4;
		mockMvc.perform(get("/getEligibleBenefits/{policyId}/{memberId}",policyId,memberId).header("Authorization", "wrongtoken"))
						.andExpect(status().isForbidden());
	}

	
	
	
}