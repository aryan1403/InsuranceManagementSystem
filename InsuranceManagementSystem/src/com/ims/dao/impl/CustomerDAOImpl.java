package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.CustomerDAO;
import com.ims.model.Customer;


public class CustomerDAOImpl implements CustomerDAO {
	
	Scanner sc=new Scanner(System.in);
	
	List<Customer> addCustomers=new ArrayList<>();
	
	CategoryDAOImpl catImpldao = new CategoryDAOImpl();
	SubCategoryDAOImpl subcatImpldao = new SubCategoryDAOImpl();
	PolicyDAOImpl polImpldao = new PolicyDAOImpl();
	

	@Override
	public void register() {
		// TODO Auto-generated method stub
		System.out.println("Enter User ID");
		int userId=sc.nextInt();
		System.out.println("Enter User First Name");
		String firstName=sc.next();
		System.out.println("Enter User Last Name");
		String lastName=sc.next();
		System.out.println("Enter User Email");
		String email=sc.next();
		System.out.println("Enter User Phone Number");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter User Password");
		String passWord=sc.next();
		
		Customer customer=new Customer(userId,firstName,lastName,email,passWord,phoneNumber);
		
		addCustomers.add(customer);
		System.out.println("Customer Information Added Successfully");
		
		
	}
	@Override
	public List<Customer> viewAllCustomerInfo(){
	for(Customer cus: addCustomers)
	{
		System.out.println(cus.getUserId()+"\t"+cus.getFirstName()+"\t"+cus.getLastName()+"\t"+cus.getEmail()+"\t"+cus.getPhoneNumber()+"\t"+cus.getPassWord());
	}
	return addCustomers;
	}

	@Override
	public boolean verifyEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		for(Customer cus : addCustomers)
		{
			if(cus.getEmail().equals(email) && cus.getPassWord().equals(password))
			{
				return true;
			}  //end of for loop
		}   //end of for loop
		return false;
	}

	@Override
	public void viewCategory() {
		// TODO Auto-generated method stub
		catImpldao.viewAllCategory();
		
	
		
		
	}

	@Override
	public void viewSubCategory() {
		// TODO Auto-generated method stub
		subcatImpldao.viewAllSubCategory();
		
		
		
	}

	@Override
	public void applyPolicy() {
		// TODO Auto-generated method stub
		polImpldao.addPolicy();
		
	}

	@Override
	public void viewPolicyCustomerHolds() {
		// TODO Auto-generated method stub
		polImpldao.viewAllPolicy();
		
	}

	
}
