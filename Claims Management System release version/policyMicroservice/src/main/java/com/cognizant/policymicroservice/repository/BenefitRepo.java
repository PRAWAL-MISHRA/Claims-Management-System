package com.cognizant.policymicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cognizant.policymicroservice.model.Benefits;

public interface BenefitRepo extends JpaRepository<Benefits, Integer> {
	@Query("from Benefits b where b.policyId=?1")
	public List<Benefits> findByBenefitId(Integer policyId);

}