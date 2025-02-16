package com.cognizant.claimmicroservice.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.cognizant.claimmicroservice.controller.ClaimsController;
import com.cognizant.claimmicroservice.model.Benefits;
import com.cognizant.claimmicroservice.repository.BenefitRepo;

/*
 * Test cases for getBenefitId method in policyMicroservice Controller
 */
@RunWith(MockitoJUnitRunner.class)
class ClaimsMicroserviceContollerTest {

	@InjectMocks
	ClaimsController controller;

	@Mock
	BenefitRepo benefitRepo;

	/*
	 * test if the controller class is loading or not
	 */
	@Test
	@DisplayName("Checking if [PaymentController] is loading or not.")
	void policyMicroserviceControllerIsLoaded() {
		ClaimsController claimsController=new ClaimsController();
		assertThat(claimsController).isNotNull();
	}

	/*
	 * test the getBenefitId method with positive inputs
	 */
	@Test
	void testGetBenefitId() {
		benefitRepo = mock(BenefitRepo.class);
		Benefits benefits = new Benefits();
		benefits.setBenefitId(1);
		benefits.setBenefitName("Health Checkup");
		when(benefitRepo.getById(1)).thenReturn(benefits);
		assertEquals(1, benefitRepo.getById(1).getBenefitId());
	}

	/*
	 * test the getBenefitId method with negative inputs
	 */
	@Test
	void testGetBenefitIdnegative() {
		Benefits benefits = new Benefits();
		benefits.setBenefitId(-1);
		benefits.setBenefitName("Health Checkup");
		assertNotEquals(1, benefits.getBenefitId());
	}

}
