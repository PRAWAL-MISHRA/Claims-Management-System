package com.cognizant.membermicroservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.membermicroservice.client.AuthClient;
import com.cognizant.membermicroservice.client.ClaimsClient;
import com.cognizant.membermicroservice.dto.Claim;
import com.cognizant.membermicroservice.dto.ClaimStatusDTO;
import com.cognizant.membermicroservice.dto.ViewBillsDTO;
import com.cognizant.membermicroservice.exception.AuthorizationException;
import com.cognizant.membermicroservice.model.MemberPremium;
import com.cognizant.membermicroservice.service.ClaimService;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * This class is handling all the end points for MemberMicroservice. This
 * controller has mappings as- getmapping-viewBills()
 * getmapping-getClaimStatus() 
 * postmapping-submitClaim()
 *
 */

@Slf4j
@Api(value = "Member Premium Controller")
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MemberPremiumController {

	@Autowired
	private ClaimService claimserviceimpl;

	@Autowired
	private AuthClient authClient;

	@Autowired
	private ClaimsClient claimsClient;

	/**
	 * 
	 * @param token    - used to verify the token with jwtAuthentication
	 *                 microservice
	 * @param memberId - used to find the member of particular memberId
	 * @param policyId - used to find the policy of the particular member
	 * @return ResponseEntity<Response>
	 * 
	 *         returns the details of the members having the particular memberId and
	 *         policyId.
	 *
	 */

	@GetMapping(value = "/viewBills/{memberId}/{policyId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<MemberPremium> viewBills(@PathVariable Integer memberId, @PathVariable Integer policyId,
			@RequestHeader(value = "Authorization", required = true) String token) {
		log.info("Start - viewBills()");
		log.info(token);
		System.out.println("status of validity"+authClient.getValidity(token));
		if (authClient.getValidity(token)) {
			
			log.info("End - viewBills()");
			return new ResponseEntity<MemberPremium>(claimserviceimpl.viewBills(memberId, policyId), HttpStatus.OK);
		}
		else {
			throw new AuthorizationException();
			//return new ResponseEntity<>("Token is either expired or invalid...", HttpStatus.FORBIDDEN);
		}
		
	}

	/**
	 * 
	 * @param token    - used to verify the token with jwtAuthentication
	 *                 microservice
	 * @param claimId  - used to get the claim of the particular claimId
	 * @param policyId - used to find the policy of the particular member
	 * @param memberId - used to find the member of particular memberId
	 * @return ResponseEntity<Response> - returns the status of the claim from the
	 *         claimId, policyId and memberId.
	 *
	 */

	@GetMapping(value = "/getClaimStatus/{claimId}/{policyId}/{memberId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Claim> getClaimStatus(@PathVariable int claimId, @PathVariable int policyId,
			@PathVariable int memberId, @RequestHeader(value = "Authorization", required = true) String token) {
		log.info("Start - getClaimStatus()");
		

		if (authClient.getValidity(token)) {
			ResponseEntity<Claim> claimStatus = claimsClient.getClaimStatus(claimId, policyId, memberId, token);
			log.info("End - getClaimStatus()"+claimStatus);
			return claimStatus;
		}
		else {
			throw new AuthorizationException("Token is either expired or invalid...");
			//return new ResponseEntity<>("Token is either expired or invalid...", HttpStatus.FORBIDDEN);
		}


		

	}

	/**
	 * 
	 * @param token         - used to verify the token with jwtAuthentication
	 *                      microservice
	 * @param policyId      - used to set the policyId of the particular member
	 * @param claimId       - used to set the claimId of the particular claim
	 * @param memberId      - used to find the member of particular memberId
	 * @param providerId    - used to set the providerId who is providing the policy
	 * @param benefitId     - used to set the id of the benefit which comes under
	 *                      the particular policy
	 * @param totalAmount   - used to set the total amount for the claim
	 * @param claimedAmount - used to set the amount that can be claimed
	 * @return ResponseEntity<Response> - returns the status of the claim and its
	 *         description after submitting the claim.
	 *
	 */

	@PostMapping("/submitClaim/{claimId}/{policyId}/{memberId}/{providerId}/{benefitId}/{totalAmount}/{claimedAmount}")
	public ResponseEntity<Claim> submitClaim(@PathVariable int claimId,@PathVariable int policyId,
			@PathVariable int memberId, @PathVariable int providerId, @PathVariable int benefitId,
			@PathVariable double totalAmount, @PathVariable double claimedAmount,
			@RequestHeader(value = "Authorization", required = false) String token) {
		log.info("Start - submitClaim()");
		if (authClient.getValidity(token)) {
			ResponseEntity<Claim> claimResponse = claimsClient.submitClaim(claimId,policyId, memberId, providerId,
					benefitId, totalAmount, claimedAmount, token);
			log.info("End - submitClaim()");
			return claimResponse;
		}
		else {
			throw new AuthorizationException("Token is either expired or invalid...");
			//return new ResponseEntity<>("Token is either expired or invalid...", HttpStatus.FORBIDDEN);
		}
		
	}

}
