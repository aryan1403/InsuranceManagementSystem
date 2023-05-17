package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.AdminDAO;
import com.ims.model.Admin;

public class AdminDAOImpl implements AdminDAO {
	Scanner sc=new Scanner(System.in);
	
	List<Admin> addAdmins=new ArrayList<>();
	

	CategoryDAOImpl catImpldao = new CategoryDAOImpl();
	SubCategoryDAOImpl subcatImpldao = new SubCategoryDAOImpl();
	PolicyDAOImpl polImpldao = new PolicyDAOImpl();
	CustomerDAOImpl cusImpldao=new CustomerDAOImpl();

	@Override
	public void registerAdmin() {
		// TODO Auto-generated method stub
		System.out.println("Enter new ADmin ID");
		int adminId=sc.nextInt();
		System.out.println("Enter Admin First Name");
		String fname=sc.next();
		System.out.println("Enter Admin Last Name");
		String lname=sc.next();
		System.out.println("Enter Admin Email");
		String adEmail=sc.next();
		System.out.println("Enter Admin Password");
		String passWord=sc.next();
		
		Admin admin=new Admin(adminId,fname,lname,adEmail,passWord);
		System.out.println("The Admin Record Has Been Register");
		

	}

	@Override
	public boolean verifyAdminEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		for(Admin ad: addAdmins)
		{
			if(ad.getAdEmail().equals(email) && ad.getPassWord().equals(password))
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public void insuranceCategoryDetails() {
		// TODO Auto-generated method stub
		catImpldao.viewAllCategory();
		

	}

	@Override
	public void insuranceSubCategoryDetails() {
		// TODO Auto-generated method stub
		subcatImpldao.viewAllSubCategory();

	}

	@Override
	public void insurancePolicy() {
		// TODO Auto-generated method stub
		polImpldao.viewAllPolicy();

	}

	@Override
	public void customerDetails() {
		// TODO Auto-generated method stub
		cusImpldao.viewAllCustomerInfo();

	}

}
