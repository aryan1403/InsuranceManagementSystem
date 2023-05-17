package com.ims.model;

public class Policy {
	private int polId;
	private String Policy;
	
	
	
	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Policy(int polId, String policy) {
		super();
		this.polId = polId;
		Policy = policy;
	}



	public int getPolId() {
		return polId;
	}



	public void setPolId(int polId) {
		this.polId = polId;
	}



	public String getPolicy() {
		return Policy;
	}



	public void setPolicy(String policy) {
		Policy = policy;
	}
	
	
	
	

}
