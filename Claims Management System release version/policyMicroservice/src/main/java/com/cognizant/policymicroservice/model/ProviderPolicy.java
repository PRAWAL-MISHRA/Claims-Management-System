package com.cognizant.policymicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
 * This is a model class used for object of type ProviderPolicy
 * 
 */

@Entity
@Table(name="provider_policy")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class ProviderPolicy {
	
	@Id
	@JsonProperty
	@NotNull
	public Integer providerId;
	@JsonProperty
	@Size(min=3 , max=25)
	public String providerName;
	@JsonProperty
	@Size(min=3 , max=25)
	public String providerAddress;
	@JsonProperty
	@NotNull
	public Integer policyId;
	@JsonProperty
	public String location;
}
