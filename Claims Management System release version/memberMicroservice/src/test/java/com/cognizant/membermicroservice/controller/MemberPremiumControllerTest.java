//package com.cognizant.membermicroservice.controller;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.Arrays;
//import java.util.Date;
//import java.util.List;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Mockito;
//import org.mockito.junit.jupiter.MockitoExtension;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.cognizant.membermicroservice.client.AuthClient;
//import com.cognizant.membermicroservice.client.ClaimsClient;
//import com.cognizant.membermicroservice.dto.ClaimStatusDTO;
//import com.cognizant.membermicroservice.dto.ViewBillsDTO;
//import com.cognizant.membermicroservice.model.AuthenticationResponse;
//import com.cognizant.membermicroservice.model.MemberClaim;
//import com.cognizant.membermicroservice.model.MemberPremium;
//import com.cognizant.membermicroservice.repository.ClaimRepository;
//import com.cognizant.membermicroservice.repository.PremiumRepository;
//import com.cognizant.membermicroservice.service.ClaimService;
//import com.cognizant.membermicroservice.serviceImpl.ClaimServiceImpl;
//
//
///**
// * This class contains test cases for the MemberPremiumController class which
// * are written using junit
// */
//
////@SpringBootTest
//@RunWith(SpringRunner.class)
//
//@ExtendWith(MockitoExtension.class)
//@WebMvcTest(value = MemberPremiumController.class)
//public class MemberPremiumControllerTest {
//	@Autowired
//	private MockMvc mockMvc;
//	
//
//	@InjectMocks
//	MemberPremiumController memberController;
//
//	@MockBean
//	PremiumRepository premiumRepo;
//
//	@MockBean
//	ClaimRepository claimRepo;
//
//	@MockBean
//	ClaimServiceImpl claimserviceimpl;
//
//@MockBean
//	MemberPremium viewdto;
//
//
//@MockBean
//	ClaimStatusDTO claimdto;
//
//	@MockBean
//	AuthClient authClient;
//
//	@MockBean
//	ClaimsClient claimsClient;
//
////	@InjectMocks
////	private ClaimServiceImpl claimService = new ClaimServiceImpl();
//
//	@BeforeEach
//	void setUp() throws ParseException {
//
//		viewdto = new MemberPremium();
//		String sDate1 = "31/12/2020";
//		String sDate2 = "10/01/2021";
//		Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
//		Date date2 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate2);
//		viewdto.setPaidDate(date1);
//		viewdto.setPremium(50000.0);
//		viewdto.setLatePayment(false);
//		viewdto.setLatePaymentCharges(0.0);
//		viewdto.setDueDate(date2);
//
//		MemberPremium memberPremium = new MemberPremium();
//		String sDate3 = "31/12/2020";
//		String sDate4 = "10/01/2021";
//		Date date3 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate3);
//		Date date4 = new SimpleDateFormat("dd/MM/yyyy").parse(sDate4);
//		memberPremium.setPolicyId(1);
//		memberPremium.setMemberId(1);
//		memberPremium.setDueDate(date3);
//		memberPremium.setPaidDate(date4);
//		memberPremium.setPremium(10000.0);
//		memberPremium.setLatePayment(true);
//		memberPremium.setLatePaymentCharges(100.0);
//
//	}
//
//	/**
//	 * To test viewBills method
//	 */
//	@Test
//	void viewBillsNegativeWithAuthorizationException() throws Exception {
//		when(authClient.getValidity("token")).thenReturn(true);
//
//		when(claimserviceimpl.viewBills(Mockito.anyInt(),Mockito.anyInt())).thenReturn((viewdto));
//		Integer policyId=1;
//		
//		mockMvc.perform(get("/viewBills/{memberId}/{policyId}",1,2).header("Authorization", "wrongtoken"))
//						.andExpect(status().isForbidden());
//	}
//
//	@Test
//	void viewBillsPositiveTest() throws Exception {
//		//AuthenticationResponse response = new AuthenticationResponse("token", true);
//
//		when(authClient.getValidity("token")).thenReturn(true);
//		when(claimserviceimpl.viewBills(1, 1)).thenReturn(viewdto);
//		assertEquals(HttpStatus.OK, memberController.viewBills(1, 1, "token").getStatusCode());
//
//	}
//
//	/**
//	 * To test getClaimStatus method
//	 */
//
//	@Test
//	void getClaimStatusTest() throws Exception {
//
//	//	AuthenticationResponse response = new AuthenticationResponse("token", true);
//
//		MemberClaim memberClaim = new MemberClaim(1, 1, 1, 1, 202, 10000.0, 10000.0, "Pending Action",
//				"claim has been submitted! Please check after few days for confirmation");
//
//		ResponseEntity<ClaimStatusDTO> claims = new ResponseEntity<ClaimStatusDTO>(claimdto, HttpStatus.OK);
//
//		when(authClient.getValidity("token")).thenReturn(true);
//		// Mockito.doReturn(response).when(authClient.getValidity("token"));
//		// ClaimsClient claimsClient = Mockito.mock(ClaimsClient.class);
//		// Mockito.doReturn(mem).when(claimsClient.getClaimStatus(1, 1, 1, "token"));
//		when(claimsClient.getClaimStatus(1, 1, 1, "token")).thenReturn(claims);
//
//		// assertEquals(memberClaim, memberController.getClaimStatus(1, 1, 1, "token"));
//		assertEquals(claims.getStatusCodeValue(),
//				memberController.getClaimStatus(1, 1, 1, "token").getStatusCodeValue());
//
//	}
//	@Test
//	void getClaimsNegativeWithAuthorizationException() throws Exception {
//		when(authClient.getValidity("token")).thenReturn(true);
//		ResponseEntity<ClaimStatusDTO> claims = new ResponseEntity<ClaimStatusDTO>(claimdto, HttpStatus.OK);
//
//		when(authClient.getValidity("token")).thenReturn(true);
//		// Mockito.doReturn(response).when(authClient.getValidity("token"));
//		// ClaimsClient claimsClient = Mockito.mock(ClaimsClient.class);
//		// Mockito.doReturn(mem).when(claimsClient.getClaimStatus(1, 1, 1, "token"));
//		when(claimsClient.getClaimStatus(1, 1, 1, "token")).thenReturn(claims);
//
//
//		when(claimserviceimpl.viewBills(Mockito.anyInt(),Mockito.anyInt())).thenReturn((viewdto));
//	
//		
//		mockMvc.perform(get("/getClaimStatus/{claimId}/{policyId}/{memberId}",1,1,2).header("Authorization", "wrongtoken"))
//						.andExpect(status().isForbidden());
//	}
//	/**
//	 * To test submitClaim method
//	 */
//
//	
//	@Test
//	void submitClaimTest() throws Exception {
//
//		MemberClaim memberClaim = new MemberClaim(1, 1, 1, 1, 202, 10000.0, 10000.0, "Pending Action",
//				"claim has been submitted! Please check after few days for confirmation");
//		ResponseEntity<ClaimStatusDTO> claims = new ResponseEntity<ClaimStatusDTO>(claimdto, HttpStatus.OK);
//
//		when(authClient.getValidity("token")).thenReturn(true);
//		when(claimsClient.submitClaim(1, 1, 1, 1, 201, 10000, 10000, "token")).thenReturn(claims);
//
//		// assertEquals(memberClaim, memberController.submitClaim(1, 1, 1, 1, 201,
//		// 10000, 10000, "token"));
//		assertEquals(claims.getStatusCodeValue(),
//				memberController.submitClaim(1, 1, 1, 1, 201, 10000, 10000, "token").getStatusCodeValue());
//	}
//	@Test
//	void submitClaimsNegativeWithAuthorizationException() throws Exception {
//		MemberClaim memberClaim = new MemberClaim(1, 1, 1, 1, 202, 10000.0, 10000.0, "Pending Action",
//				"claim has been submitted! Please check after few days for confirmation");
//		ResponseEntity<ClaimStatusDTO> claims = new ResponseEntity<ClaimStatusDTO>(claimdto, HttpStatus.OK);
//
//		when(authClient.getValidity("token")).thenReturn(true);
//		when(claimsClient.submitClaim(1, 1, 1, 1, 201, 10000, 10000, "token")).thenReturn(claims);
//		when(claimsClient.getClaimStatus(1, 1, 1, "token")).thenReturn(claims);
//
//
//		when(claimserviceimpl.viewBills(Mockito.anyInt(),Mockito.anyInt())).thenReturn((viewdto));
//	
//		
//		mockMvc.perform(post("/submitClaim/{policyId}/{claimId}/{memberId}/{providerId}/{benefitId}/{totalAmount}/{claimedAmount}",1,1,2,1,1,1000.0,10000.0).header("Authorization", "wrongtoken"))
//						.andExpect(status().isForbidden());
//	}
//
//}
