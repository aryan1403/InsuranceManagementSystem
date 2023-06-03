package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.SubCategoryDAO;
import com.ims.model.SubCategory;

public class SubCategoryDAOImpl implements SubCategoryDAO {
	
	Scanner sc=new Scanner(System.in);
	
	List<SubCategory> addSubCategoryList=new ArrayList<>();

	@Override
	public void addSubCatecory() {
		// TODO Auto-generated method stub
		int k=1;
		while(k==1)
		{
		System.out.println("Enter Sub-Category ID");
		int subcatId=sc.nextInt();
		System.out.println("Enter Sub-Category Name");
		String subcatName=sc.next();
		
		SubCategory subcategory=new SubCategory(subcatId,subcatName);
		
		addSubCategoryList.add(subcategory);
		System.out.println("Your Insurance SubCategory Has Been Added Successfully");
		
		System.out.println("Do You Want To Add More Sub-Category? 1) Yes 2) No");
		k=sc.nextInt();
		
		}  //end of while loop
		

	}

	@Override
	public List<SubCategory> viewAllSubCategory() {
		// TODO Auto-generated method stub
		for(SubCategory subcat: addSubCategoryList)
		{
			System.out.println(subcat.getSubcatId()+"\t"+subcat.getSubcatName());
		}
		
		return addSubCategoryList;
	}

	@Override
	public void updateSubCategory(int subcatId) {
		// TODO Auto-generated method stub
		int k=0;
				
		for(SubCategory subcat: addSubCategoryList)
		{
			if(subcat.getSubcatId()==subcatId)
			{
				System.out.println("What Do You Want To Update? 1) Sub-Category Id 2) Sub-Category Name");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
				System.out.println("Enter Your New Sub-Category ID");
				int subcatid=sc.nextInt();
				subcat.setSubcatId(subcatid);
				System.out.println("Your New Sub_category Id Has Been Updated");
				break;
				
				case 2:
					System.out.println("Enter Your New Sub-Category Name");
					String subcatName=sc.next();
					subcat.setSubcatName(subcatName);
					System.out.println("Your New Sub-Category Name Has Been Updated");
					break;
					
					default:
						System.out.println("Choose Between 1 and 2");
			
				
				}  //end of switch loop
			}   // end of if loop
			++k;
			
			
		}    //end of for loop
		if(k==0)
			System.out.println("Your Category Was Not Found");
		

	}

	@Override
	public void deleteSubCategory(int subcatId) {
		// TODO Auto-generated method stub
		int k=0;
		for(SubCategory subcat: addSubCategoryList)
		{
			if(subcat.getSubcatId()==subcatId)
			{
				addSubCategoryList.remove(subcat);
				System.out.println("Your Sub-Category Has Been Updated Successfully");
				++k;
				break;
			} //end of if
		}   // end of for loop
		if(k==0)
			System.out.println("Your Sub-Category Was Not Found Or Has Been Deleted");

	}

}
