package com.cognizant.claimmicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.claimmicroservice.model.Benefits;


@Repository
public interface BenefitRepo extends JpaRepository<Benefits, Integer> {

	Benefits findByBenefitId(Integer benefitId);

}