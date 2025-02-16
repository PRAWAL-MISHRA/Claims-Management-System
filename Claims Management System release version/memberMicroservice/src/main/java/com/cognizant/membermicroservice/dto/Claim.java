package com.cognizant.membermicroservice.dto;

import java.util.Date;

import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Claim {


	private Integer claimId;

	private String claimStatus;

	private String description;

	private Integer policyId;

	private Integer memberId;

	private Integer benefitId;

	private Integer providerId;
	
	private double amountClaimed;

	private double amountSettled;
	
	
	
}
