package com.takeo.service;

import java.util.Optional;

import com.takeo.model.Admin;

public interface AdminService {
	
	 	public Admin createAdmin(Admin admin);
	    public Optional<Admin> getAdminById(int aid);
	    public Optional<Admin> getAdminByAdminName(String username);
	    public Admin updateAdmin(Admin admin);
	    public Admin deleteAdmin(int aid);
	    public boolean verifyAdminCredentials(String username, String password);

}
