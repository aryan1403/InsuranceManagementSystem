package com.ims.client;

import java.util.Scanner;

import com.ims.dao.impl.AdminDAOImpl;
import com.ims.dao.impl.details.AdminDAOImplDetails;
import com.ims.dao.impl.details.CustomerDAOImplDetails;

public class InsuranceMgmtSystem {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDAOImpl admindaoimpl=new AdminDAOImpl();
		
		AdminDAOImplDetails adminDetails=new AdminDAOImplDetails();
		
		CustomerDAOImplDetails customerDetails=new CustomerDAOImplDetails();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		
		System.out.println("========================================");
		System.out.println("                     1)Admin       ");
		System.out.println("                     2)Customer      ");
		System.out.println("                     3)Exit      ");
		
		System.out.println("========================================");
		
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			
			adminDetails.viewAdminMenu();
		/*	
			System.out.println("Enter Email");
			String email = sc.next();
			System.out.println("Enter PassWord");
			String pass = sc.next();
			boolean verify=admindaoimpl.verifyAdminEmailAndPassword(email, pass);
			

			if (verify) {
				System.out.println("Valid Admin");
			} else {
				System.out.println("Invalid Admin");
			}
			
			adminDetails.viewAdminMenu();
			*/
			break;
			
		case 2:
			
			customerDetails.viewCustomerMenu();
			
			System.out.println("Enter Email");
			String email1 = sc.next();
			System.out.println("Enter PassWord");
			String pass1 = sc.next();
			boolean verifyUser=admindaoimpl.verifyAdminEmailAndPassword(email1, pass1);
			

			if (verifyUser) {
				System.out.println("Valid User");
			} else {
				System.out.println("Invalid User");
			}
			
			
			
			break;
			
		case 3:
			System.out.println("Thank you for Visiting Us");
			System.exit(0);
			break;
			default:
				System.out.println("See You Again!!!");
			
		}
				
		}			
		

	}

}
