package com.pms.admin.dao.details;

import java.util.Scanner;

import com.pms.admin.dao.impl.CustomerDAOImpl;
import com.pms.client.ProductManagementSystemClient;
import com.pms.model.User;

public class AdminCustomerDetails {
	
	CustomerDAOImpl customDAOImpl = new CustomerDAOImpl();
	
	public void userDetails()
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("===============================================================================");
			System.out.println("                            1) Add User                                ");
			System.out.println("                            2) View All Users                          ");
			System.out.println("                            3) View User info                          ");
			System.out.println("                            4) Update User                             ");
			System.out.println("                            5) Delete User                             ");
			System.out.println("                            6) Back                                    ");
			System.out.println("===============================================================================");
			
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				customDAOImpl.addCustomer();
				break;
			case 2:
				customDAOImpl.viewAllUserInfo();
				break;
			case 3:
				System.out.println("Enter User ID");
				int id=sc.nextInt();
				User viewuserinfo=customDAOImpl.viewUserInfo(id);
				if(viewuserinfo != null)
					System.out.println(viewuserinfo.getId()+"\t"+viewuserinfo.getFirstName()+ "\t"+viewuserinfo.getLastName()+"\t"+viewuserinfo.getEmail()+"\t"+viewuserinfo.getPhoneNumber()+"\t"+viewuserinfo.getPassword());
				else
					System.out.println("The Entered User ID Doesn't Exist");
				
				break;
			case 4:
				System.out.println("Enter User ID To Make Update");
				int uid=sc.nextInt();
				customDAOImpl.updateUser(uid);
				break;
			case 5:
				System.out.println("Enter User ID To Delete");
				int dltUid=sc.nextInt();
				customDAOImpl.deleteUser(dltUid);
				break;
			case 6:
				ProductManagementSystemClient.main(null);
				break;
				default:
					System.out.println("Choose Between 1 to 5");
			}
		
			
			
		}
	}

}
