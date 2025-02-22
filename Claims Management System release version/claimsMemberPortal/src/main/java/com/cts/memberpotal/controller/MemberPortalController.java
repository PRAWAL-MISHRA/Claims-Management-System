package com.cts.memberpotal.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.cts.memberpotal.client.AuthClient;
import com.cts.memberpotal.client.MemberMicroServiceClient;
import com.cts.memberpotal.vo.Claim;
import com.cts.memberpotal.vo.JwtRequest;
import com.cts.memberpotal.vo.Premium;
import com.cts.memberpotal.vo.UserData;
import com.cts.memberpotal.vo.ViewBillsDTO;


@RestController
public class MemberPortalController {
	
	@Autowired
	private MemberMicroServiceClient memberClient;
	@Autowired 
	private AuthClient authClient;
	
	private static 	UserData authToken=null;
	
	private static final Logger log = LoggerFactory.getLogger(MemberPortalController.class);
	
	@RequestMapping("/signin")
	public ModelAndView userLogin() {

		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}
	
	@GetMapping("/validate")
	public void check() {
		HttpHeaders httpHeaders = new HttpHeaders();
		httpHeaders.add("Authorization", token);
		HttpEntity<?> httpEntity = new HttpEntity<>(httpHeaders);
		System.out.println("hi");
		@SuppressWarnings("unused")
		boolean response1 = authClient.getValidity(token);
	}
	
	String token;
	@PostMapping(value="/generate")
	public ModelAndView userLogin(@ModelAttribute JwtRequest request,HttpSession session) {	

		System.out.println(request.getUserid()+"   "+request.getUpassword());
		ModelAndView model=new ModelAndView();
			authToken=   authClient.login(request).getBody();
			authToken.setAuthToken("Bearer "+authToken.getAuthToken());
			
			int MemberId = authToken.getMemberId();
			session.setAttribute("MemberId", MemberId);
			
		System.out.println(authToken.getAuthToken());
		if(authToken.getAuthToken()==null) {
			model.addObject("Message", "Invalid Credentials!"); 
		    model.setViewName("login");
		    return model;
		}
		
		
		model.setViewName("home");
	    return model;
	}
	
	@RequestMapping(value = "/home")
	public ModelAndView goToHomePage() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@RequestMapping(value = "/home/logout")
	public ModelAndView goTologinPage() {
		ModelAndView mv = new ModelAndView("logout");
		return mv;
	}
	
	@RequestMapping("/home/aboutUs")
	public ModelAndView gotoAboutUs() {

		ModelAndView modelAndView = new ModelAndView("aboutUs");
		return modelAndView;
	}
	
	@RequestMapping("/home/login")
	public ModelAndView gotoLogin() {

		ModelAndView modelAndView = new ModelAndView("login");
		return modelAndView;
	}

	@RequestMapping("/home/billStatus")
	public ModelAndView gotobillStatus() {

		ModelAndView modelAndView = new ModelAndView("billStatus");
		return modelAndView;
	}
	
	
	@RequestMapping("/home/billStatus/viewBills")
	public ModelAndView getpremiumBill(@RequestParam int member_id,@RequestParam int policy_id ,HttpSession session) {
		ModelAndView model=new ModelAndView();
		Premium viewbills=null;
		System.out.println("Token"+authToken.getAuthToken());
			try {
				//premium= resttemplate.getForObject("http://memberservice/viewBills/"+request.getParameter("Member Id")+"/"+request.getParameter("Policy Id"),Premium.class);	
				viewbills = memberClient.viewBills(member_id,policy_id, authToken.getAuthToken()).getBody();
			
				System.out.println(viewbills.toString());
				}
			catch(Exception e){
				model.addObject("Message", "Member or Policy not found"); 
			    model.setViewName("billStatus");
			    return model;
			}
			model.addObject("premium",viewbills);
			model.setViewName("viewBills");
			return model;
	}
	@RequestMapping("/home/claimStatus")
	public ModelAndView gotoclaimStatus() {

		ModelAndView modelAndView = new ModelAndView("claimStatus");
		return modelAndView;
	}
	@RequestMapping("/home/claimStatus/claimstatusview")
	public ModelAndView getclaim(@RequestParam int claim_id,@RequestParam int policy_id,@RequestParam int member_id) {
			 ModelAndView model=new ModelAndView();
			 Claim claims= null; 
			 try{
				// claims = resttemplate.getForObject("http://memberservice/getClaimStatus/"+request.getParameter("Claim Id")+"/"+request.getParameter("Policy Id")+"/"+request.getParameter("Member Id"),Claim.class);	 
				 claims=memberClient.getClaimStatus(claim_id, policy_id, member_id, authToken.getAuthToken()).getBody();
			 }
			 catch(Exception e) {
				 model.addObject("Message", "Claim or Member or Policy not found"); 
				 model.setViewName("claimStatus");
				 return model;
			 }
			 model.setViewName("claimstatusview");
			 model.addObject("claims",claims);
		 return model;
	}

	
	
	
	@RequestMapping("/home/newClaim")
	public ModelAndView gotonewClaim() {

		ModelAndView modelAndView = new ModelAndView("newClaim");
		return modelAndView;
	}

	/*
	@PostMapping("/home/newClaim/submit")	
	public ModelAndView gotosubmit(@ModelAttribute Claim claim) throws ParseException {
	  

	    ResponseEntity<Claim> cc = memberClient.submitClaim(10,claim.getPolicyId(), claim.getMemberId(), claim.getProviderId(),claim.getBenefitId(),claim.getAmountSettled(), claim.getAmountClaimed(), authToken.getAuthToken());
	    ModelAndView modelAndView = new ModelAndView();
	    modelAndView.addObject("Message", "Your ClaimId : "+cc.getBody().getClaimId());
		modelAndView.setViewName("submit");
		return modelAndView;
	}
	*/
	
	@PostMapping("/home/newClaim/submit")	
	public ModelAndView gotosubmit(@ModelAttribute Claim claim) throws ParseException {
	  
		ModelAndView modelAndView = new ModelAndView();
		try {
	    ResponseEntity<Claim> cc = memberClient.submitClaim(10,claim.getPolicyId(), claim.getMemberId(), claim.getProviderId(),claim.getBenefitId(),claim.getAmountSettled(), claim.getAmountClaimed(), authToken.getAuthToken());
	    
	    modelAndView.addObject("Message", "Your ClaimId : "+cc.getBody().getClaimId());
		}
		 catch(Exception e) {
			 modelAndView.addObject("Message", "Claim Not Found According to your Inputs"); 
			 modelAndView.setViewName("newClaim");
			 return modelAndView;
		 }
	modelAndView.setViewName("submit");
	return modelAndView;
	}
	
}
