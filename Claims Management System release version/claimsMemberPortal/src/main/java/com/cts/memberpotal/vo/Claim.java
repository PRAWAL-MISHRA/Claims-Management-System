package com.cts.memberpotal.vo;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Claim {

	private Integer claimId;
	private Integer policyId;

	private Integer memberId;

	private String claimStatus;

	private String description;
	
	private Integer benefitId;

	private Integer providerId;
	
	private double amountClaimed;

	private double amountSettled;
	
}
