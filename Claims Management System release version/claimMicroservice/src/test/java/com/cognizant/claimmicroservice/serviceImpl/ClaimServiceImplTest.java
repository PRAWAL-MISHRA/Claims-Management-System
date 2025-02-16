package com.cognizant.claimmicroservice.serviceImpl;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.cognizant.claimmicroservice.client.PolicyClient;
import com.cognizant.claimmicroservice.dto.ClaimStatusDTO;
import com.cognizant.claimmicroservice.exception.BenefitsNotFoundException;
import com.cognizant.claimmicroservice.exception.ClaimNotFoundException;
import com.cognizant.claimmicroservice.exception.ProviderNotFoundException;
import com.cognizant.claimmicroservice.model.Benefits;
import com.cognizant.claimmicroservice.model.Claim;
import com.cognizant.claimmicroservice.model.ProviderPolicy;
import com.cognizant.claimmicroservice.repository.ClaimRepository;

import lombok.extern.slf4j.Slf4j;




@SpringBootTest
@Slf4j
public class ClaimServiceImplTest {
	@Mock
	ClaimRepository claimRepository;
	@MockBean
	ClaimStatusDTO claimStatusDTO;
	@Mock
	PolicyClient policyClient;
	@InjectMocks
	ClaimServiceImpl claimServiceImpl;
	@Mock
	private Claim claim;

	private List<ProviderPolicy> providers;

	private List<Benefits> benefits;

	@BeforeEach
	void setUp() throws Exception {
		claim = new Claim();
		claim.setClaimId(1);
		claim.setClaimStatus("claimed");
		claim.setDescription("claim has been submitted! Please check after few days for confirmation");
		claim.setPolicyId(3);
		claim.setBenefitId(202);
		claim.setMemberId(1);
		claim.setProviderId(1);
		claim.setAmountClaimed(60000.0);
		claim.setAmountSettled(60000.0);

		//claimDto = new ClaimStatusDTO();
		claimStatusDTO.setClaimStatus("claimed");
		claimStatusDTO.setDescription("Acccident claim on City Hospital");
	}

	
 @Test void testGetClaimStatuspositive() throws ProviderNotFoundException {
	 
 when(claimRepository.getById(1)).thenReturn(claim);

   Claim claimStatusDTO=claimServiceImpl.getClaimStatus(1,3,1);
	 assertEquals(claimRepository.getById(1).getClaimStatus(),
			 claimStatusDTO.getClaimStatus());
	 
	}
	 

	@Test
	void testGetClaimStatusnegative() throws ProviderNotFoundException {
		when(claimRepository.getById(2)).thenReturn(claim);
		ProviderNotFoundException thrown = Assertions.assertThrows(ProviderNotFoundException.class,
				() -> claimServiceImpl.getClaimStatus(2, 1, 3));

		assertEquals("provider not found", thrown.getMessage());

	}
//	@Test void testSubmitClaimStatus_negative() throws ProviderNotFoundException, BenefitsNotFoundException {
//		  
//		  when(claimRepository.getById(2)).thenReturn(claim);
//		  log.debug("claim test={}",claim); 
//		  log.debug("claimdto Test={}", claimStatusDTO.getClaimStatus());
//		  claim=claimRepository.getById(2); 
//		  claimStatusDTO.setClaimStatus("Pending Action");
//		   claimStatusDTO.setDescription("claim has been submitted! Please check after fewdays for confirmation");
//		   claimStatusDTO = claimServiceImpl.getClaimStatus(2,1, 1);
//		  
//		  ProviderNotFoundException thrown =
//		  Assertions.assertThrows(ProviderNotFoundException.class, () ->
//		  claimServiceImpl.processSubmitClaim(1, 2, 3, 7, 202, 60000.0, 60000.0,
//		  "token"));
//		 
//		  BenefitsNotFoundException thrown2 =
//		  Assertions.assertThrows(BenefitsNotFoundException.class,  () ->
//		  claimServiceImpl.processSubmitClaim(1, 2, 1, 1, 202, 60000.0, 60000.0,
//		  "token"));
//		  
//		  log.debug("claimdto={}", claimStatusDTO.getClaimStatus());
//		  
//		   assertEquals(claimRepository.getById(2).getClaimStatus(), 
//		 claimStatusDTO.getClaimStatus());
//		 
//		  assertEquals("provider not found", thrown.getMessage());
//		  assertEquals("benefit not found", thrown2.getMessage());
//		  when(claimRepository.save(claim)).thenReturn(claim);
//		  when(claimRepository.getById(2)).thenReturn(claim);
//		  
//		  
//		  when(policyClient.getChainOfProviders(1,"dummy-token")).thenReturn(providers); 
//		  ResponseEntity<Double> eligibleClaimAmount = new ResponseEntity<Double>(10000.0, HttpStatus.OK); 
//		  when(policyClient.getEligibleClaimAmount(1, 1, 202, "dummy-token")).thenReturn((
//				  double)10000.0); 
//		 ResponseEntity<?> brs = new ResponseEntity<>(benefits,HttpStatus.OK);
//		  when(policyClient.getEligibleBenefits(1, 1,"dummy-token")).thenReturn(benefits);
//		  
//		  when(claimServiceImpl.processSubmitClaim(1, 2, 1, 1, 202,60000.0,60000.0,"dummy-token")) .thenReturn(claimStatusDTO);
//		  } 
//	


}
