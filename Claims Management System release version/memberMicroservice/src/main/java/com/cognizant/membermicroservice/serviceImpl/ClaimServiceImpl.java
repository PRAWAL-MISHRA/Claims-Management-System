package com.cognizant.membermicroservice.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.membermicroservice.dto.ViewBillsDTO;
import com.cognizant.membermicroservice.exception.FileNotFoundException;
import com.cognizant.membermicroservice.model.MemberPremium;
import com.cognizant.membermicroservice.repository.PremiumRepository;
import com.cognizant.membermicroservice.service.ClaimService;

import lombok.extern.slf4j.Slf4j;

@Service
/**
 * This class is used to load the bill details from the database.
 *
 */
@Slf4j
public class ClaimServiceImpl implements ClaimService {

	@Autowired
	private PremiumRepository premiumRepository;

	@Autowired
	private ViewBillsDTO viewBillsDto;

	/**
	 * 
	 * @param memberId
	 * @param policyId
	 * @return viewBillsDto
	 * @throws FileNotFoundException
	 */

	@Override
	public MemberPremium viewBills(Integer memberId, Integer policyId) throws FileNotFoundException {
		log.info("just stated in function");
		MemberPremium premium = premiumRepository.findByMemberIdAndPolicyId(memberId,policyId);
		System.out.println("premium "+premium);
		log.info("crossed premium");
		//ViewBillsDTO viewBillsDTO=new ViewBillsDTO();
		log.info("outside validation");
		if (premium==null) {
		
			throw new FileNotFoundException("Data Not Found!!!");
		}
		System.out.println(premium.toString());
		return premium;

	}
}
