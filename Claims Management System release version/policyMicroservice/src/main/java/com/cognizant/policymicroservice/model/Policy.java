package com.cognizant.policymicroservice.model;

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
 * This is a model class used for object of type Policy
 * 
 */

@Entity
@Table(name="policy")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Policy {
		
		@Id
		@NotNull
		private Integer policyId;
		@NotNull
		private int policyNumber;
		@NotNull
		private double premium;
		@NotNull
		@Min(value = 3)
		private int tenure;
		@NotNull
		@Max(value=1000000)
		private double capAmountBenefits;
}
