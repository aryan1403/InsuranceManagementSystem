package com.pms.admin.dao;

import java.util.List;

import com.pms.model.Product;

public interface ProductDAO {
	//business method
	void addProduct();
	List<Product> viewProducts();
	Product viewProduct(int pid);
	void updateProduct(int pid);
	void deleteProduct(int pid);
	

}
