package com.ims.dao;

import java.util.List;

import com.ims.model.SubCategory;



public interface SubCategoryDAO {
	void addSubCatecory();
	List<SubCategory> viewAllSubCategory();
	void updateSubCategory(int subcatId);
	void deleteSubCategory(int subcatId);

}
