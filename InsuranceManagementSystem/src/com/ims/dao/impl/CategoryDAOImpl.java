package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.CategoryDAO;
import com.ims.model.Category;

public class CategoryDAOImpl implements CategoryDAO {
	
	Scanner sc=new Scanner(System.in);
	
	List<Category> addCategoryList=new ArrayList<>();

	@Override
	public void addCatecory() {
		// TODO Auto-generated method stub
		
		int k=1;
		while(k==1)
			{
		System.out.println("Enter Category ID");
		int catId=sc.nextInt();
		System.err.println("Enter Category Name");
		String catName=sc.next();
		
		Category insuranceCategory=new Category(catId,catName);
		
		addCategoryList.add(insuranceCategory);
		System.out.println("Category Information Added Successfully");
		
		System.out.println("Do You Want To Add More Category? 1) Yes  2) No");
		
		k=sc.nextInt();
		
		
			}     //end of while loop
		
		

	}

	@Override
	public List<Category> viewAllCategory() {
		// TODO Auto-generated method stub
		for(Category cat: addCategoryList)
		{
			System.out.println(cat.getCatId()+"\t"+cat.getCatName());
		}
		
		
		return addCategoryList;
	}

	@Override
	public void updateCategory(int catId) {
		// TODO Auto-generated method stub
		int k=0;
		
		for(Category cat: addCategoryList)
		{
			if(cat.getCatId()==catId)
			{
				System.out.println("What Would You like to Update? 1) Category ID 2) Category Name");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("Enter Your New Category ID");
					int catID=sc.nextInt();
					cat.setCatId(catID);
					System.out.println("Your New Category ID Has Been Updated");
					break;
					
				case 2:
					System.out.println("Enter Your New Category Name");
					String catName=sc.next();
					cat.setCatName(catName);
					System.out.println("Your New Category Name Has Been Updated");
					break;
					default:
						System.out.println("Select Between 1 and 2");
				}   //end of switch loop
				
			}    //end of if loop
			++k;
			
		} //end of for loop
		if(k==0)
			System.out.println("Your Entry Was Not Found!!");

	}

	@Override
	public void deleteCategory(int catId) {
		// TODO Auto-generated method stub
		int k=0;
		for(Category cat: addCategoryList)
		{
			if(cat.getCatId()==catId)
			{
				addCategoryList.remove(cat);
				System.out.println("Your Category Has Been Deleted Successfully");
				++k;
				break;
			}   //end of if loop
		}  //end of for loop
		if(k==0)
			System.out.println("Your Category Was Not Found Or Has Been Deleted");

	}

}
