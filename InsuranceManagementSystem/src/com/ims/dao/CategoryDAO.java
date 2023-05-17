package com.ims.dao;

import java.util.List;

import com.ims.model.Category;

public interface CategoryDAO {
	void addCatecory();
	List<Category> viewAllCategory();
	void updateCategory(int catId);
	void deleteCategory(int catId);
	

}
