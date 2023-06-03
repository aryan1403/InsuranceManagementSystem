package com.ims.dao.impl.details;

import java.util.Scanner;

import com.ims.client.InsuranceMgmtSystem;
import com.ims.dao.impl.PolicyDAOImpl;

public class PolicyDAOImplDetails {
	
	static PolicyDAOImpl daoimpl=new PolicyDAOImpl();
	
	CustomerDAOImplDetails cus=new CustomerDAOImplDetails();
	
	
	
	
	
	
	public void policyMenu()
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("============================================");
			System.out.println("         1) Add Policy  ");
			System.out.println("         2) view Requested Policy  ");
			System.out.println("         3) update Policy  ");
			System.out.println("         4) delete Policy  ");
			System.out.println("         5) Back  ");
			
			System.out.println("============================================");
			
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				daoimpl.addPolicy();
				break;
			
			case 2:
				System.out.println("The Following Request Has been Received");
				daoimpl.viewAllPolicy();
				break;
				
			case 3:
				System.out.println("Enter Policy ID To Update");
				int polId=sc.nextInt();
				daoimpl.updatePolicy(polId);
				break;
				
			case 4:
				System.out.println("Enter Policy ID To Delete");
				int polid=sc.nextInt();
				daoimpl.deletePolicy(polid);
				break;
				
			case 5:
				InsuranceMgmtSystem.main(null);
				break;
				default:
					System.out.println("Choose Between 1 to 5");
			
			}  //end of switch
			
		}
	}

}
