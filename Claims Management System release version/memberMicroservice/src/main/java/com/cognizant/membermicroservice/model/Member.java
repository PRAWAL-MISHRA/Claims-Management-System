package com.cognizant.membermicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * This is a model class which we will be storing member details in the
 * database..
 * 
 */

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Member {
	/**
	 * This will be the id of a member.
	 */
	@Id
	private Integer memberId;
	/**
	 * This will be the name of a member.
	 */
	@Size(min=2 , max=35)
	private String memberName;
	/**
	 * This will be the phone number of a member.
	 */
	@Size(max=10)
	private String phoneNumber;
	/**
	 * This will be the salary of a member.
	 */
	@Min(value = 1000)
	private int salary;
	/**
	 * This will be the gender of a member.
	 */
	
	private String gender;
}
