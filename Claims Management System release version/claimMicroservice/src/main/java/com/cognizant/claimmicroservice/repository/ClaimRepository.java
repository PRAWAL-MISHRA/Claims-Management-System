package com.cognizant.claimmicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.claimmicroservice.dto.ClaimStatusDTO;
import com.cognizant.claimmicroservice.model.Claim;


@Repository
public interface ClaimRepository extends JpaRepository<Claim, Integer> {

	public List<ClaimStatusDTO> findByclaimId(Integer claimId);
}