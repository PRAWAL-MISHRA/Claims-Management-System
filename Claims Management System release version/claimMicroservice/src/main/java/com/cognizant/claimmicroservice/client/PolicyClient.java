package com.cognizant.claimmicroservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cognizant.claimmicroservice.model.Benefits;
import com.cognizant.claimmicroservice.model.ProviderPolicy;



@FeignClient(name = "policy-microservice", url = "${policy.URL}")
public interface PolicyClient {
	
	@RequestMapping(value = "getChainOfProviders/{policyId}", method = RequestMethod.GET, produces = "application/json")
	public List<ProviderPolicy> getChainOfProviders(@PathVariable("policyId") int policyId,
			@RequestHeader(value = "Authorization", required = false) String token);

	/*
	 * 
	 * This method invokes authorizationMicroservice to validate the token
	 * 
	 * if token is valid then returns the list of providers which are under a
	 * particular policy
	 * 
	 * if token is invalid then returns responseEntity of tyep String(message) and
	 * status as forbidden
	 */

	@RequestMapping(value = "getEligibleBenefits/{policyId}/{memberId}", method = RequestMethod.GET, produces = "application/json")
	public List<Benefits> getEligibleBenefits(@PathVariable("policyId") int policyId,
			@PathVariable("memberId") int memberId,
			@RequestHeader(value = "Authorization", required = false) String token);



	@GetMapping(value = "/getClaimAmount/{policyId}/{memberId}/{benefitId}", produces = "application/json")
	public ResponseEntity<?> getEligibleClaimAmount(@PathVariable int policyId, @PathVariable int memberId,
			@PathVariable int benefitId, @RequestHeader(value = "Authorization", required = false) String token);

}
