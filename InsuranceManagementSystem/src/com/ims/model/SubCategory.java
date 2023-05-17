package com.ims.model;

public class SubCategory {
	private int subcatId;
	private String subcatName;
	
	
	public SubCategory() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SubCategory(int subcatId, String subcatName) {
		super();
		this.subcatId = subcatId;
		this.subcatName = subcatName;
	}


	public int getSubcatId() {
		return subcatId;
	}


	public void setSubcatId(int subcatId) {
		this.subcatId = subcatId;
	}


	public String getSubcatName() {
		return subcatName;
	}


	public void setSubcatName(String subcatName) {
		this.subcatName = subcatName;
	}
	
	
	
	

}
