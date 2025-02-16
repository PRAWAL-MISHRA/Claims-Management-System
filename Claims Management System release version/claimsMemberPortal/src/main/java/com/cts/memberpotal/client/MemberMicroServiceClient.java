package com.cts.memberpotal.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cts.memberpotal.vo.Claim;
import com.cts.memberpotal.vo.Premium;
import com.cts.memberpotal.vo.ViewBillsDTO;



@FeignClient(name = "Member-Microservice", url = "${member.URL}")
public interface MemberMicroServiceClient {

	@GetMapping(value = "/getClaimStatus/{claimId}/{policyId}/{memberId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Claim> getClaimStatus(@PathVariable int claimId, @PathVariable int policyId,
			@PathVariable int memberId, @RequestHeader(value = "Authorization", required = false) String token);
	
	@PostMapping("/submitClaim/{claimId}/{policyId}/{memberId}/{providerId}/{benefitId}/{totalAmount}/{claimedAmount}")
	public ResponseEntity<Claim> submitClaim(@PathVariable int claimId,@PathVariable int policyId,
			@PathVariable int memberId, @PathVariable int providerId, @PathVariable int benefitId,
			@PathVariable double totalAmount, @PathVariable double claimedAmount,
			@RequestHeader(value = "Authorization", required = false) String token);
	
	@GetMapping(value = "/viewBills/{memberId}/{policyId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Premium> viewBills(@PathVariable Integer memberId, @PathVariable Integer policyId,
			@RequestHeader(value = "Authorization", required = true) String token);
}
