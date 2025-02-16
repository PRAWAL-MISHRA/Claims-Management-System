package com.cognizant.policymicroservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * This is a model class used for object of type MemberPolicy
 * 
 */

@Entity
@Table(name = "member_policy")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MemberPolicy {

	@Id
	@NotNull
	private Integer memberId;
	@NotNull
	private Integer policyId;
	@NotNull
	private int policyNumber;
	@NotNull
	private Integer benefitId;
	@NotNull
	private Date subscriptionDate;
	@NotNull
	@Min(value = 3)
	private int tenure;
	@NotNull
	@Max(value=1000000)
	private double capAmountBenefits;
	
}
