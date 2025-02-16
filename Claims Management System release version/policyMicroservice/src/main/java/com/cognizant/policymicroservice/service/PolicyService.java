package com.cognizant.policymicroservice.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.policymicroservice.exception.MemberPolicyNotFoundException;
import com.cognizant.policymicroservice.exception.PolicyNotFoundException;
import com.cognizant.policymicroservice.model.Benefits;
import com.cognizant.policymicroservice.model.ProviderPolicy;

@Service
@Component
public interface PolicyService {
	public List<ProviderPolicy> findAllByPolicyIdOrderByLocation(Integer policyId) throws PolicyNotFoundException;
	public List<Benefits> findByBenefitId(Integer memberId,Integer policyId) throws PolicyNotFoundException;
	public double findCapAmount(Integer policyId, Integer memberId, Integer benefitId) throws MemberPolicyNotFoundException;
}
