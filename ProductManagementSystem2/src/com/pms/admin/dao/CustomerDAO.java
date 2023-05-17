package com.pms.admin.dao;

import java.util.List;

import com.pms.model.User;

public interface CustomerDAO {
	
	//customer related operations
	public void addCustomer();
	public List<User> viewAllUserInfo();
	
	public User viewUserInfo(int id);
	public void deleteUser(int id);
	
	public void updateUser(int id);

}
