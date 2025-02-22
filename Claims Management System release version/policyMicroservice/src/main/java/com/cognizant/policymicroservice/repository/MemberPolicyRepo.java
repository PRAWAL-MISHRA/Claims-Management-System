package com.cognizant.policymicroservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.policymicroservice.model.MemberPolicy;

@Repository
public interface MemberPolicyRepo extends JpaRepository<MemberPolicy , Integer>{

	@Query("from MemberPolicy mp where mp.policyId=?1 and mp.memberId=?2 ")
	public List<MemberPolicy> findAllByMemberIdAndPolicyId(Integer policyId, Integer memberId);
	public MemberPolicy findByPolicyId(Integer policyId);
	
	@Query("from MemberPolicy mp where mp.policyId=?1 and mp.memberId=?2 and mp.benefitId=?3")
	//public MemberPolicy findCapAmount(Integer policyId, Integer memberId, Integer benefitId);
	public MemberPolicy findByPolicyIdAndMemberIdAndBenefitId(Integer policyId, Integer memberId, Integer benefitId);
	
}