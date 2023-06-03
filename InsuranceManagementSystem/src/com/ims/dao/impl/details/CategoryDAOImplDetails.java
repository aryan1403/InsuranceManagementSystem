package com.ims.dao.impl.details;

import java.util.Scanner;

import com.ims.client.InsuranceMgmtSystem;
import com.ims.dao.impl.CategoryDAOImpl;

public class CategoryDAOImplDetails {
	
	CategoryDAOImpl daoimpl=new CategoryDAOImpl();
	
	public void viewCategoryMenu()
	{
		Scanner sc=new Scanner(System.in);
		
		while(true) 
		{
			
		
		System.out.println("================================================================");
		System.out.println("                    1) Add Category                ");
		System.out.println("                    2) View Category            ");
		System.out.println("                    3) Update Category        ");
		System.out.println("                    4) Delete Category       ");
		System.out.println("                    5) Back               ");

		System.out.println("================================================================");
		
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			daoimpl.addCatecory();
			break;
			
		case 2:
			daoimpl.viewAllCategory();
			break;
			
		case 3:
			System.out.println("Enter Category ID to Make Update");
			int catID=sc.nextInt();
			daoimpl.updateCategory(catID);
			break;
			
		case 4:
			System.out.println("Enter Category ID to Delete");
			int deleteCatID=sc.nextInt();
			daoimpl.deleteCategory(deleteCatID);
			break;
			
		case 5:
			InsuranceMgmtSystem.main(null);
			break;
			default:
				System.out.println("Choose Between 1 to 4");
			
		}   //end of choice
		  
		
		
		}	//end of while loop	

}
}
