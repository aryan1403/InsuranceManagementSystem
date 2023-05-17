package com.ims.dao.impl.details;

import java.util.Scanner;

import com.ims.client.InsuranceMgmtSystem;
import com.ims.dao.impl.CustomerDAOImpl;

public class CustomerDAOImplDetails {
	
	CustomerDAOImpl customer=new CustomerDAOImpl();
	
	public void viewCustomerMenu()
	{
		Scanner sc=new Scanner(System.in);
		
		while(true) 
		{
			
		
		System.out.println("================================================================");
		System.out.println("                    1) Register                      ");
		System.out.println("                    2) View Category List            ");
		System.out.println("                    3) View Sub Category List        ");
		System.out.println("                    4)  Apply Policy                 ");
		System.out.println("                    5)  View Policy He/She Holds     ");
		System.out.println("                    6)  Back                         ");
		
	
		System.out.println("================================================================");
		
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			customer.register();
			break;
		case 2:
		
			customer.viewCategory();
			break;
			
		case 3:
			customer.viewSubCategory();
			break;
			
		case 4:
			
			System.out.println("Enter The Policy you Want");
			int pol=sc.nextInt();
			System.out.println("Enter you EmailID ");
			String email=sc.next();
			System.out.println("Enter Your Password");
			String password=sc.next();
			
			System.out.println("The Request Has Been Sent");
			
			
			
			break;
			
		case 5:
			
			customer.viewPolicyCustomerHolds();
			break;
			
		case 6:
			InsuranceMgmtSystem.main(null);
			break;
			
			default:
				System.out.println("Choose Between 1 to 5");
			
		
			
		}
		
		
	}
	  } 
	
	
	

}
