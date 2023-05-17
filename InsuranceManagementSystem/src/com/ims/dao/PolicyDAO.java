package com.ims.dao;

import java.util.List;

import com.ims.model.Policy;



public interface PolicyDAO {
	void addPolicy();
	List<Policy> viewAllPolicy();
	void updatePolicy(int polId);
	void deletePolicy(int polId);

}
