package com.pms.admin.dao.details;

import java.util.Scanner;

import com.pms.admin.dao.impl.ProductDAOImpl;
import com.pms.client.ProductManagementSystemClient;
import com.pms.model.Product;

public class AdminDetails {
	
	
	ProductDAOImpl prodDAOImpl = new ProductDAOImpl();
	
	public void prodDetails()
	{
		Scanner sc=new Scanner(System.in);
	
	
	while(true)
	{
		System.out.println("==========================================================================");
		System.out.println("                   1) Add Product                           ");
		System.out.println("                    2) View Products                         ");
		System.out.println("                    3) view Individual Product               ");
		System.out.println("                    4) Update Product                         ");
		System.out.println("                    5) Delete Product                         ");
		System.out.println("                    6) Back                                   ");
		System.out.println("==========================================================================");
		
		System.out.println("Enter Your Choice");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			prodDAOImpl.addProduct();
			break;
		case 2:
			prodDAOImpl.viewProducts();
			break;
		case 3:
			System.out.println("Enter ID");
			int id=sc.nextInt();
			Product viewProduct = prodDAOImpl.viewProduct(id);
			if(viewProduct !=null)
			System.out.println(viewProduct.getPid()+"\t" + viewProduct.getPname()+"\t"+ viewProduct.getPrice()+ "\t"+ viewProduct.getQty());
			else
				System.out.println("Given ID Doesn't Exist");
			break;
		case 4:
			System.out.println("Enter ID To Make Update");
			int pid = sc.nextInt();
			 prodDAOImpl.updateProduct(pid);
			
			break;
		case 5:
			System.out.println("Enter ID To Delete");
			int dlt=sc.nextInt();
			prodDAOImpl.deleteProduct(dlt);
			break;
		case 6:
			ProductManagementSystemClient.main(null);
			break;
			default:
				System.out.println("Enter Your Choice Between 1 to 5");
			
		}
	}
	
	
	}

}
