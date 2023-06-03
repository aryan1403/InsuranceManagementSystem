package com.ims.dao.impl.details;

import java.util.Scanner;

import com.ims.client.InsuranceMgmtSystem;
import com.ims.dao.impl.AdminDAOImpl;
import com.ims.dao.impl.CategoryDAOImpl;
import com.ims.dao.impl.CustomerDAOImpl;
import com.ims.dao.impl.PolicyDAOImpl;
import com.ims.dao.impl.SubCategoryDAOImpl;

public class AdminDAOImplDetails {
	
	AdminDAOImpl admin=new AdminDAOImpl();
	
	CustomerDAOImpl customer1=new CustomerDAOImpl();
	
	CategoryDAOImpl categ=new CategoryDAOImpl();
	
	SubCategoryDAOImpl subcat=new SubCategoryDAOImpl();
	
	PolicyDAOImpl pol=new PolicyDAOImpl();
	
	CategoryDAOImplDetails catdetail=new CategoryDAOImplDetails();
	SubCategoryDAOImplDetails subcatdetail=new SubCategoryDAOImplDetails();
	PolicyDAOImplDetails poldetail=new PolicyDAOImplDetails();
	
	CustomerDAOImplDetails cusDetails=new CustomerDAOImplDetails();
	
	public void viewAdminMenu()
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			
		
		System.out.println("==========================================================");
		System.out.println("                       1) View User List    ");
		System.out.println("                       2) Category          ");
		System.out.println("                       3) Sub-Category      ");
		System.out.println("                       4) Policy            ");
		System.out.println("                       5) Back              ");
	
		System.out.println("==========================================================");
		
		System.out.println("Enter Your Choices");
		int choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
			CustomerDAOImplDetails.customer.viewAllCustomerInfo();
			//customer1.viewAllCustomerInfo();
			//admin.customerDetails();
			break;
			
		case 2:
			System.out.println("The Category of Insurance are 1) 15(Auto) 2) 21(Home) 3) 33(Health)");
			
			catdetail.viewCategoryMenu();
			
			
			/*
			System.out.println("What would you like in Category? 1) add 2) view 3) update 4) delete");
			int select=sc.nextInt();
			
			switch(select)
			{
			case 1:
				System.out.println("The Category of Insurance are 1) Auto 2) Home 3) Health");
				categ.addCatecory();
				break;
			case 2:
				categ.viewAllCategory();
				break;
				
			case 3:
				System.out.println("Enter Category ID");
				int catId=sc.nextInt();
				categ.updateCategory(catId);
				break;
				
			case 4:
				System.out.println("Enter Category ID");
				int catid=sc.nextInt();
				categ.deleteCategory(catid);
				break;
				
				default:
					System.out.println("Choose between 1 to 4");
				
			
			
			}  ///end of inner switch
			*/
		case 3:
			System.out.println("The Sub-Category of Insurance are 1) 75(Premium) 2) 80(Gold) 3) 99(Diamond)");
			subcatdetail.subcategoryMenu();
			
			
			/*
			System.out.println("What Would You Like in Sub-Category? 1)Add 2) view 3) Update 4) Delete");
			int choice1=sc.nextInt();
			
			switch(choice1)
			{
			case 1:
				subcat.addSubCatecory();
				break;
				
			case 2:
				subcat.viewAllSubCategory();
				break;
				
			case 3:
				System.out.println("Enter Sub category ID");
				int subId=sc.nextInt();
				subcat.updateSubCategory(subId);
				break;
				
			case 4:
				System.out.println("Enter sub-Category ID");
				int subid=sc.nextInt();
				subcat.deleteSubCategory(subid);
				break;
				
				default:
					System.out.println("Choose Between 1 to 4");
			
			
			} //end of inner switch
			
			*/
			
		case 4:
			System.out.println("The Polices are 1) A1(Long-term) 2) B2(Short-Term) 3) C3(Combo of Two insurance)");
			poldetail.policyMenu();
			
	/*		
			System.out.println("What would you like in Policy? 1) Add 2) View 3) Update 4) Delete");
			int choice2=sc.nextInt();
			
			switch(choice2)
			{
			case 1:
				pol.addPolicy();
				break;
				
			case 2:
				pol.viewAllPolicy();
				break;
				
			case 3:
				System.out.println("Enter Policy ID");
				int polId=sc.nextInt();
				pol.updatePolicy(polId);
				break;
				
			case 4:
				System.out.println("Enter Policy ID");
				int polid=sc.nextInt();
				pol.deletePolicy(polid);
				break;
				
				
				default:
					System.out.println("Choose Between 1 to 4");
				
			
			} // end of inner switch
			
			*/
			
		case 5:
			InsuranceMgmtSystem.main(null);
			break;
			
			default:
				System.out.println("Choose Between 1 to 4");
			
		
		}  // end of switch loop
		
		
		
		
	}  //// end of while loop
		}

}
