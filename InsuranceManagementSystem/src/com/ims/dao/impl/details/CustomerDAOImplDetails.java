package com.ims.dao.impl.details;

import java.util.Scanner;

import com.ims.client.InsuranceMgmtSystem;
import com.ims.dao.impl.CustomerDAOImpl;
import com.ims.dao.impl.PolicyDAOImpl;

public class CustomerDAOImplDetails {
	
	static CustomerDAOImpl customer=new CustomerDAOImpl();
	
	PolicyDAOImpl poldaoImpl=new PolicyDAOImpl();
	
	
	
	
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
			customer.viewAllCustomerInfo();
			System.out.println("The Category of Insurance are 1) 15(Auto) 2) 21(Home) 3) 33(Health)");
		
			//customer.viewCategory();
			customer.viewAllCustomerInfo();
			break;
			
		case 3:
			System.out.println("The Sub-Category of Insurance are 1) 75(Premium) 2) 80(Gold) 3) 99(Diamond)");
			//customer.viewSubCategory();
			break;
			
		case 4:
			System.out.println("The Polices are 1) 121(Long-term) 2) 122(Short-Term) 3) 123(Combo of Two insurance)");
			poldaoImpl.addPolicy();
			
			
		/*	
			System.out.println("Enter The Policy you Want");
			int pol=sc.nextInt();
			System.out.println("Enter you EmailID ");
			String email=sc.next();
			System.out.println("Enter Your Password");
			String password=sc.next();
			*/
			System.out.println("The Request Has Been Sent");
			
			
			
			break;
			
		case 5:
			poldaoImpl.viewAllPolicy();
			
			//customer.viewPolicyCustomerHolds();
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
