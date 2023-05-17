package com.ims.dao;

public interface AdminDAO {
	public void registerAdmin();
	boolean verifyAdminEmailAndPassword(String email, String password);
	public void insuranceCategoryDetails();
	public void insuranceSubCategoryDetails();
	public void insurancePolicy();
	public void customerDetails();
	

}
