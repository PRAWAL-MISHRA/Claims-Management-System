package com.cognizant.membermicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * This is a model class which we will be storing claim details of member in the
 * database..
 * 
 */

@Entity
@Table(name = "member_claim")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class MemberClaim {

	/**
	 * This will be the id of the claim.
	 * 
	 */
	@Id
	private Integer claimId;
	/**
	 * This will be the id of the policy.
	 * 
	 */
	private Integer policyId;
	/**
	 * This will be the id of the member.
	 * 
	 */
	private Integer memberId;
	/**
	 * This will be the id of the provider.
	 * 
	 */
	private Integer providerId;
	/**
	 * This will be the id of the benefit.
	 * 
	 */
	private Integer benefitId;
	/**
	 * This will be the total billed amount.
	 * 
	 */
	@Min(value=10000)
	private double totalBilledAmount;
	/**
	 * This will be the total claimed amount.
	 * 
	 */
	@Min(value=5000)
	private double totalClaimedAmount;
	/**
	 * This will be the status of the claim.
	 * 
	 */
	@Size(min=5)
	private String claimStatus;
	/**
	 * This will be the description of the claim.
	 * 
	 */
	@Size(min=5)
	private String claimDescription;
}
