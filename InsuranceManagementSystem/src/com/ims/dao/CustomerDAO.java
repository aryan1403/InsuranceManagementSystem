package com.ims.dao;

import java.util.List;

import com.ims.model.Customer;

public interface CustomerDAO {
	
	public void register();
	boolean verifyEmailAndPassword(String email, String password);
	public List<Customer> viewAllCustomerInfo();
	void viewCategory();
	void viewSubCategory();
	void applyPolicy();
	void viewPolicyCustomerHolds();

}
