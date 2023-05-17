package com.pms.client;

import java.util.Scanner;

import com.pms.admin.dao.details.AdminCustomerDetails;
import com.pms.admin.dao.details.AdminDetails;

public class ProductManagementSystemClient {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminDetails  details1=new AdminDetails();
		
		AdminCustomerDetails details2=new AdminCustomerDetails();
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("===================================================================");
			System.out.println("                  1) Product Admin                        ");
			System.out.println("                  2) User Admin                           ");
			System.out.println("                  3) Exit                                 ");
		
			System.out.println("===================================================================");
			
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				details1.prodDetails();
				break;
			case 2:
				details2.userDetails();
				break;
			case 3:
				System.out.println("Thank You For Using Our App!! SEE YOU AGAIN!!!");
				default:
					System.out.println("Choose between 1 and 2");
			
			
			
			
			
			}  //end of switch loop
		}
		

	}

}
