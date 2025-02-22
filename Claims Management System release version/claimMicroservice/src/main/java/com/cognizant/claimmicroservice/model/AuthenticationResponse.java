package com.cognizant.claimmicroservice.model;
/*
 * This is a model class which is used for authentication response
 */
public class AuthenticationResponse {

	private String jwtToken;
	private Boolean valid;
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
	public Boolean getValid() {
		return valid;
	}
	public void setValid(Boolean valid) {
		this.valid = valid;
	}
	public AuthenticationResponse(String jwtToken, Boolean valid) {
		super();
		this.jwtToken = jwtToken;
		this.valid = valid;
	}
	public AuthenticationResponse() {
		super();
	}

	
	
}
