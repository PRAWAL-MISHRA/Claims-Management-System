/*package com.cognizant.policymicroservice.serviceImpl;



import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.any;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cognizant.policymicroservice.exception.MemberPolicyNotFoundException;
import com.cognizant.policymicroservice.exception.PolicyNotFoundException;
import com.cognizant.policymicroservice.model.Benefits;
import com.cognizant.policymicroservice.model.MemberPolicy;
import com.cognizant.policymicroservice.model.ProviderPolicy;
import com.cognizant.policymicroservice.repository.BenefitRepo;
import com.cognizant.policymicroservice.repository.MemberPolicyRepo;
import com.cognizant.policymicroservice.repository.ProviderPolicyRepo;


@SpringBootTest
class PolicyServiceImplTest {
	@Mock
	ProviderPolicyRepo policyrepo;
	@Mock
	BenefitRepo benefitRepo;
	@Mock
	MemberPolicyRepo memberRepo;
	@InjectMocks
	PolicyServiceImpl policyServiceImpl;
	@Test
	@DisplayName("Test TreatmentPlanRepository mock")
	public void policyRepoNotNullTest() {
		assertThat(policyrepo).isNotNull();
	}
	@Test
	@DisplayName("Test PatientDetailsRepository mock")
	public void benefitRepoNotNullTest() {
		assertThat(benefitRepo).isNotNull();
	}
	@Test
	@DisplayName("Test PatientDetailsRepository mock")
	public void memberRepoNotNullTest() {
		assertThat(memberRepo).isNotNull();
	}
	@Test
	@DisplayName("Test policyserviceimpl mock")
	public void policyserviceNotNullTest() {
		assertThat(policyServiceImpl).isNotNull();
	}
	

//	when(treatmentPackageRepository.findByName(any(), anyString())).thenReturn(Optional.empty());
//	assertThrows(IPTreatmentPackageNotFoundException.class, () -> {
//		ipOfferingService.findIPTreatmentPackageByName(AilmentCategory.ORTHOPAIDICS, "Package 4");
//	});
//	
//	verify(treatmentPackageRepository).findByName(AilmentCategory.ORTHOPAIDICS, "Package 4");
//	
	@Test
	@DisplayName("Test invalid findIPTreatmentPackageByName() of IPTreatmentPackageService")
	public void testgetAllChainOfProvidersTestException() throws PolicyNotFoundException {
		
		when(policyrepo.findAllByPolicyIdOrderByLocation(1)).thenReturn(new ArrayList<ProviderPolicy>());
		assertThrows(PolicyNotFoundException.class, () -> {
			policyServiceImpl.findAllByPolicyIdOrderByLocation(1);
		});
		
		verify(policyrepo).findAllByPolicyIdOrderByLocation(1);
	}
	


	@Test
	public void getAllChainOfProvidersTest() throws PolicyNotFoundException {
	//	List<ProviderPolicy> providerPolicies = policyrepo.findAllByPolicyIdOrderByLocation(1);
		 
		 ProviderPolicy providerPolicy=new ProviderPolicy(4,"Apollo Hospital","Dhayari",1,"Pune");   	

		when(policyrepo.findAllByPolicyIdOrderByLocation(1)).thenReturn(Arrays.asList(providerPolicy));
		assertThat(policyServiceImpl.findAllByPolicyIdOrderByLocation(1).get(0).equals(providerPolicy));
	}
	
	
	@Test
	@DisplayName("Test invalid findIPTreatmentPackageByName() of IPTreatmentPackageService")
	public void testgetListOfBEnefitsTestException() throws PolicyNotFoundException {
		
		when(benefitRepo.findByBenefitId(1)).thenReturn(new ArrayList<Benefits>());
		assertThrows(PolicyNotFoundException.class, () -> {
			policyServiceImpl.findByBenefitId(1, 1);
		});
		
		verify(benefitRepo).findByBenefitId(1);
	}
	

	@Test
	public void getListOfBEnefitsTest() throws PolicyNotFoundException {
	//		List<Benefits> benefits = benefitRepo.findByBenefitId(policyId); 	
		 Benefits benefits=new Benefits(1,"Life Insurance",5);
		when(benefitRepo.findByBenefitId(1)).thenReturn(Arrays.asList(benefits));
		assertThat(policyServiceImpl.findByBenefitId(1,1).get(0).equals(benefits));
	}
	
//	@DisplayName("Test invalid findIPTreatmentPackageByName() of IPTreatmentPackageService")
//	@Test
//	public void findCapAmountTestException() throws MemberPolicyNotFoundException {
//		MemberPolicy memberPolicy=new MemberPolicy();
//		when(memberRepo.findCapAmount(2,1,201).thenReturn(new MemberPolicy());
//		assertThrows(MemberPolicyNotFoundException.class, () -> {
//			policyServiceImpl.findCapAmount(2,1,201);
//		});
//		
//		verify(memberRepo).findCapAmount(2,1,201);
//	}
//	
	@Test
	@DisplayName("Test invalid findIPTreatmentPackageByName() of IPTreatmentPackageService")
	public void findCapAmountTestTestException() throws MemberPolicyNotFoundException {
		
		when(memberRepo.findCapAmount(1, 1, 1)).thenReturn(null);
		assertThrows(MemberPolicyNotFoundException.class, () -> {
			policyServiceImpl.findCapAmount(1, 1, 1);
		});
		
		verify(memberRepo).findCapAmount(1, 1, 1);
	}
	
	@Test
	public void findCapAmountTest() throws MemberPolicyNotFoundException {

		 MemberPolicy memberPolicy=new MemberPolicy(3,2,102,203,new Date(2003-01-7),14,90000.0);
		when(memberRepo.findCapAmount(3, 2, 201)).thenReturn(memberPolicy);
		assertEquals(policyServiceImpl.findCapAmount(3, 2, 201), memberPolicy.getCapAmountBenefits());
	//	assertThat(policyServiceImpl.findCapAmount(3, 2, 201).equals(memberPolicy.get));
	}


}
*/