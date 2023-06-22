package com.takeo.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.takeo.model.Inventory;
import com.takeo.model.Stock;
import com.takeo.model.User;

public interface InventoryRepository extends MongoRepository<Inventory, String> {
	
	List<Inventory> getInventoryByUser(User user);
	
	List<Inventory> getInventoryByStock(Stock stock);

}
