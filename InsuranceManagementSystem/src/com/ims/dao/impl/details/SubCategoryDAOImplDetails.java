package com.ims.dao.impl.details;

import java.util.Scanner;

import com.ims.client.InsuranceMgmtSystem;
import com.ims.dao.impl.SubCategoryDAOImpl;

public class SubCategoryDAOImplDetails {
	
	SubCategoryDAOImpl daoimpl=new SubCategoryDAOImpl();
	
	public void subcategoryMenu()
	{
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("============================================");
			System.out.println("              1) Add Sub-Category");
			System.out.println("              2) View Sub-Category");
			System.out.println("              3) Update Sub-Category");
			System.out.println("              4) Delete Sub-Category");
			System.out.println("              5) Back ");
			
			System.out.println("============================================");
			
			System.out.println("Enter Your Choice");
			int choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				daoimpl.addSubCatecory();
				break;
				
			case 2:
				daoimpl.viewAllSubCategory();
				break;
				
			case 3:
				System.out.println("Enter Sub-Category ID To Update");
				int SubcatId=sc.nextInt();
				daoimpl.updateSubCategory(SubcatId);
				break;
				
			case 4:
				System.out.println("Enter Sub-Category ID to Delete");
				int subCatID=sc.nextInt();
				daoimpl.deleteSubCategory(subCatID);
				break;
				
			case 5:
				InsuranceMgmtSystem.main(null);
				break;
				default:
					System.out.println("Choose Between 1 to 4");
			}
		}
		
	}

}
