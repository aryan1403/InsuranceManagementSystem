package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.PolicyDAO;
import com.ims.model.Policy;


public class PolicyDAOImpl implements PolicyDAO {
	
	Scanner sc=new Scanner(System.in);
	
	List<Policy> addPolicyList=new ArrayList<>();

	@Override
	public void addPolicy() {
		// TODO Auto-generated method stub
		int k=1;
		while(k==1)
		{
		System.out.println("Enter Policy ID");
		int polId=sc.nextInt();
		System.out.println("Enter Policy Name");
		String policy=sc.next();
		
		Policy insurancepolicy=new Policy(polId,policy);
		
		addPolicyList.add(insurancepolicy);
		System.out.println("Your Policy Has Been Added Successfully");
		
		System.out.println("Do You Want To Add More Policy? 1) Yes 2) No");
		k=sc.nextInt();
		
		}  //end of while loop

	}

	@Override
	public List<Policy> viewAllPolicy() {
		// TODO Auto-generated method stub
		for(Policy pol: addPolicyList)
		{
			System.out.println(pol.getPolId()+"\t"+pol.getPolicy());
		}
		
		return addPolicyList;
	}

	@Override
	public void updatePolicy(int polId) {
		// TODO Auto-generated method stub
		int k=0;
		
		for(Policy pol: addPolicyList)
		{
			if(pol.getPolId()==polId)
			{
				System.out.println("What Do You Want To Update? 1) Policy Id 2) Policy Name");
				int choice=sc.nextInt();
				
				switch(choice)
				{
				case 1:
				System.out.println("Enter Your New Policy ID");
				int polid=sc.nextInt();
				pol.setPolId(polid);
				System.out.println("Your New Policy Id Has Been Updated");
				break;
				
				case 2:
					System.out.println("Enter Your New Policy Name");
					String policy=sc.next();
					pol.setPolicy(policy);
					System.out.println("Your New Policy Name Has Been Updated");
					break;
					
					default:
						System.out.println("Choose Between 1 and 2");
			
				
				}  //end of switch loop
			}   // end of if loop
			++k;
			
			
		}    //end of for loop
		if(k==0)
			System.out.println("Your Policy Was Not Found");

	}

	@Override
	public void deletePolicy(int polId) {
		// TODO Auto-generated method stub
		int k=0;
		for(Policy pol: addPolicyList)
		{
			if(pol.getPolId()==polId)
			{
				addPolicyList.remove(pol);
				System.out.println("Your Policy Has Been Deleted Successfully");
				++k;
				break;
			} //end of if
		}   // end of for loop
		if(k==0)
			System.out.println("Your Policy Was Not Found Or Has Been Deleted");

	}

	

}
