package com.cognizant.policymicroservice.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.policymicroservice.exception.MemberPolicyNotFoundException;
import com.cognizant.policymicroservice.exception.PolicyNotFoundException;
import com.cognizant.policymicroservice.model.Benefits;
import com.cognizant.policymicroservice.model.MemberPolicy;
import com.cognizant.policymicroservice.model.ProviderPolicy;
import com.cognizant.policymicroservice.repository.BenefitRepo;
import com.cognizant.policymicroservice.repository.MemberPolicyRepo;
import com.cognizant.policymicroservice.repository.ProviderPolicyRepo;
import com.cognizant.policymicroservice.service.PolicyService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class PolicyServiceImpl implements PolicyService {
	@Autowired
	private ProviderPolicyRepo policyrepo;
	@Autowired
	private BenefitRepo benefitRepo;
	@Autowired
	private MemberPolicyRepo memberRepo;

	@Override
	public List<ProviderPolicy> findAllByPolicyIdOrderByLocation(Integer policyId) throws PolicyNotFoundException {
		log.info("findAllByPolicyIdOrderByLocation started");
		List<ProviderPolicy> providerPolicies = policyrepo.findAllByPolicyIdOrderByLocation(policyId);
		if(providerPolicies.size()==0) {
			log.error("policy not found is caught");
			throw new PolicyNotFoundException("Policy not found exception");
			
		}
		log.info("findAllByPolicyIdOrderByLocation ended");
		return providerPolicies;
	}

	@Override
	public List<Benefits> findByBenefitId(Integer memberId, Integer policyId) throws PolicyNotFoundException {
		log.info("findByBenefitId started");
		List<Benefits> benefits = benefitRepo.findByBenefitId(policyId);
		if(benefits.size()==0) {
			log.error("policy not found is caught");
			throw new PolicyNotFoundException("Policy not found Exception");
		}
		log.info("findByBenefitId ended");
		return benefits;

	}

	@Override
	public double findCapAmount(Integer policyId, Integer memberId, Integer benefitId) throws MemberPolicyNotFoundException {
		log.info("findCapAmount started");
		MemberPolicy mOptional = memberRepo.findByPolicyIdAndMemberIdAndBenefitId(policyId, memberId, benefitId);
		if(mOptional==null) {
			log.error("memberpolicy not found is caught");
			throw new MemberPolicyNotFoundException("Member policy not found exception check all policy member and benift is correct");
		}
		log.info("findCapAmount ended");
		return mOptional.getCapAmountBenefits();
	}

}
