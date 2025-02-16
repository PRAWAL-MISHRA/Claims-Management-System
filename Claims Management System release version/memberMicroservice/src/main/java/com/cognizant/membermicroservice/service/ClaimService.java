package com.cognizant.membermicroservice.service;

import com.cognizant.membermicroservice.dto.ViewBillsDTO;
import com.cognizant.membermicroservice.model.MemberPremium;

/**
 * This interface is to declare the viewBills method to get the bill details.
 *
 */

public interface ClaimService {

	/**
	 * @param memberId
	 * @param policyId
	 * @return ViewBillsDTO
	 */

	public MemberPremium viewBills(Integer memberId, Integer policyId);

}