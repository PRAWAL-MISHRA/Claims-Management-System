package com.cognizant.policymicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * This is a model class used for object of type benefit
 */
@Entity
@Table(name = "benefits")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Benefits {

	@Id
	@JsonProperty
	@NotNull
	private Integer benefitId;
	@JsonProperty
	@Size(min = 5, max = 20)
	@NotNull
	private String benefitName;
	@JsonProperty
	@NotNull
	private Integer policyId;
	
}
