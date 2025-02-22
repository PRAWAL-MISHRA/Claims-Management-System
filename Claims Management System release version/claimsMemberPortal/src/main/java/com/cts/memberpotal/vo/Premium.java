package com.cts.memberpotal.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString; 

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Premium {

	private Long  memberId;

	private Long  policyId;

	private Date paidDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dueDate;
	
	private double premium;
	
	private boolean latePayment;
	
	
	private double latePaymentCharges;

}
