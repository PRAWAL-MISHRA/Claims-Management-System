package com.cognizant.claimmicroservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	public Integer providerId;
	@Size(min = 3 , max = 45)
	public String providerName;
	@NotNull
	@Size(min = 3 , max = 45)
	public String providerAddress;
	public Integer policyId;
	@Size(min= 3 , max=50)
	public String location;
}
