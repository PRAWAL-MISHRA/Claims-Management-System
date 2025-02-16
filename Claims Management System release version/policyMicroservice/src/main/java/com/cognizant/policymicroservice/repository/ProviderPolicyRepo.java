package com.cognizant.policymicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.policymicroservice.model.ProviderPolicy;

public interface ProviderPolicyRepo extends JpaRepository<ProviderPolicy, Integer>{

	
	public List<ProviderPolicy> findAllByPolicyIdOrderByLocation(Integer policyId);

	
	

}