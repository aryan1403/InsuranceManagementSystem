package com.pms.admin.dao.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.pms.admin.dao.CustomerDAO;
import com.pms.model.User;

public class CustomerDAOImpl implements CustomerDAO {
	
	Scanner sc=new Scanner(System.in);
	
	List<User>addUsers=new LinkedList<>();

	@Override
	public void addCustomer() {
		// TODO Auto-generated method stub
		int k=1;
		while(k==1)
		{
		System.out.println("Enter User ID");
		int id=sc.nextInt();
		System.out.println("Enter First Name");
		String firstName=sc.next();
		System.out.println("Enter Your Last Name");
		String lastName=sc.next();
		System.out.println("Enter User Email");
		String email=sc.next();
		System.out.println("Enter Your Phone Number");
		long phoneNumber=sc.nextLong();
		System.out.println("Enter Your Password");
		String password=sc.next();
		
		User user = new User(id,firstName,lastName,email,phoneNumber,password);
		
		addUsers.add(user);
		System.out.println("User Information Added Successfully");
		System.out.println("Do you want to add new User: 1)Yes 2) No");
		
		k=sc.nextInt();
		} //end of while loop

	}

	@Override
	public List<User> viewAllUserInfo() {
		// TODO Auto-generated method stub
		for(User u : addUsers)
		{
			System.out.println(u.getId()+u.getFirstName()+"\t"+u.getLastName()+"\t"+u.getEmail()+"\t"+u.getPhoneNumber()+"\t"+u.getPassword());
			
		}
		return addUsers;
	}

	@Override
	public User viewUserInfo(int id) {
		// TODO Auto-generated method stub
		for(User u : addUsers)
		{
			if(u.getId()== id)
			{
				return u;
			}
		}
		
		
		return null;
	}


	@Override
	public void updateUser(int id) {
		// TODO Auto-generated method stub
		
		int k=0;
		for(User u : addUsers)
		{
			if(u.getId()==id)
			{
				System.out.println("What would you like to Update: 1) FirstName 2) LastName 3) Email 4) PhoneNumber 5) Password");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("Enter Your New FirstName");
					String firstName=sc.next();
					u.setFirstName(firstName);
					System.out.println("The First Name Has Been Updated Successfully");
					
					break;
					
				case 2:
					System.out.println("Enter Your New Last Name");
					String lastName=sc.next();
					u.setLastName(lastName);
					System.out.println("The Last Name Has Been Updated Successfully");
					
					break;
					
				case 3:
					System.out.println("Enter Your New Email");
					String email=sc.next();
					u.setEmail(email);
					System.out.println("Your New Email Has Been Updated Successfully");
					
					break;
					
				case 4:
					System.out.println("Enter Your New Phone Number");
					long phoneNumber=sc.nextLong();
					u.setPhoneNumber(phoneNumber);
					System.out.println("Your New Phone Number Has Been Updated Successfully");
					
					break;
					
				case 5:
					System.out.println("Enter Your New Password");
					String password = sc.next();
					u.setPassword(password);
					System.out.println("Your New Password Has Been Updated Successfully");
					
					break;
					default:
						System.out.println("Choose Options Between 1 to 5");
						
				}   // end of switch loop
			} //end of if loop
			++k;
		}   /// end of for loop
		if(k==0)
			System.out.println("The User You Entered wasn't Found");

	}
	
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		int k=0;
		
		for (User u : addUsers)
		{
			if(u.getId()==id)
			{
				addUsers.remove(u);
				System.out.println("The Users Has Been Deleted SuccessFully");
				++k;
				break;
			} ///end of If loop
		}  // end of for loop
		if(k==0)
			System.out.println("The User Doesn't found or Could Have Been Deleted. Please Check With Admin To Register Again");

	}
	
	

}
