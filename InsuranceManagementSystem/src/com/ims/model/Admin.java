package com.ims.model;

public class Admin {
	private int adminId;
	private String fname;
	private String lname;
	private String adEmail;
	private String passWord;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(int adminId, String fname, String lname, String adEmail, String passWord) {
		super();
		this.adminId = adminId;
		this.fname = fname;
		this.lname = lname;
		this.adEmail = adEmail;
		this.passWord = passWord;
	}


	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getAdEmail() {
		return adEmail;
	}


	public void setAdEmail(String adEmail) {
		this.adEmail = adEmail;
	}


	public String getPassWord() {
		return passWord;
	}


	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	
	
	

}
