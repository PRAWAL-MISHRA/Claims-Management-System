package com.cognizant.claimmicroservice.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.claimmicroservice.dto.ClaimStatusDTO;
import com.cognizant.claimmicroservice.exception.BenefitsNotFoundException;
import com.cognizant.claimmicroservice.exception.ClaimNotFoundException;
import com.cognizant.claimmicroservice.exception.ProviderNotFoundException;
import com.cognizant.claimmicroservice.model.Claim;

//Interface for the service
@Service
@Component
public interface ClaimService {

	public Claim getClaimStatus(Integer claimId,Integer policyId, Integer memberId) throws ProviderNotFoundException, ClaimNotFoundException;
	
	public Claim processSubmitClaim(Integer claimId,Integer policyId,
			Integer memberId,
			Integer providerId,
			Integer benefitId,
			 double totalAmount,
			 double claimedAmount,String token)throws ProviderNotFoundException,BenefitsNotFoundException;
	
}
