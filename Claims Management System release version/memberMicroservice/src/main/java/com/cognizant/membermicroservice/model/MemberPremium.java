package com.cognizant.membermicroservice.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * This is a model class which we will be storing details of premium of the
 * member in the database..
 * 
 */

@Entity
@Table(name = "member_premium")
@Getter
@Setter
@NoArgsConstructor
@Component
@ToString
public class MemberPremium {

	
	@Id
	private Integer memberId;
	/**
	 * This will be id of the policy.
	 * 
	 */
	private Integer policyId;
	/**
	 * This will be the date on which premium of the policy has been paid.
	 * 
	 */
	private Date paidDate;
	/**
	 * This will be the due date of premium of the policy.
	 * 
	 */
	private Date dueDate;
	/**
	 * This will be the amount of premium the member has to pay.
	 * 
	 */
	@NotNull
	private double premium;
	/**
	 * This will be the boolean value for the late payment (true or false).
	 * 
	 */
	@NotNull
	private boolean latePayment;
	/**
	 * This will be the late payment charges if the member pays the premium after
	 * the due date.
	 * 
	 */
	@NotNull
	private double latePaymentCharges;
	

}
