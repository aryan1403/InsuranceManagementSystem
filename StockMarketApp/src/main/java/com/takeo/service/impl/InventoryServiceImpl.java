package com.takeo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takeo.model.Inventory;
import com.takeo.model.Stock;
import com.takeo.model.User;
import com.takeo.repo.InventoryRepository;
import com.takeo.service.InventoryService;

@Service
public class InventoryServiceImpl implements InventoryService {
	
	@Autowired
	private InventoryRepository inventoryRepo;
	

	@Override
	public Inventory createInventory(Inventory inventory) {
		// TODO Auto-generated method stub
		Inventory invent= inventoryRepo.save(inventory);
		
		if(invent != null)
			return invent;
		else
			return null;
	}

	@Override
	public Optional<Inventory> getInventoryById(String _id) {
		// TODO Auto-generated method stub
		
		Optional inventory=inventoryRepo.findById(_id);
		
		if(inventory != null)
			return inventory;
		else
			return null;
	}

	@Override
	public List<Inventory> getInventoryByUser(User user) {
		// TODO Auto-generated method stub
		List<Inventory> invent1=inventoryRepo.getInventoryByUser(user);
		
		if(invent1 != null)
			return invent1;
		else
			return null;
	}

	@Override
	public List<Inventory> getInventoryByStock(Stock stock) {
		// TODO Auto-generated method stub
		List<Inventory> invent2= inventoryRepo.getInventoryByStock(stock);
		
		if(invent2 != null)
			return invent2;
		else
			return null;
	}
	
	@Override
	public List<Inventory> getAllInventory() {
		
		List<Inventory> viewInventoryInfo=inventoryRepo.findAll();
		
		
		return viewInventoryInfo;
		
	
	}
	
	@Override
	public boolean cancelInventory(String id) {
		// TODO Auto-generated method stub
		
		Inventory inventory=inventoryRepo.findById(id).get();
		System.out.println(inventory.toString());
		
		if(inventory != null) {
			inventoryRepo.delete(inventory);
			return true;
		}
		return false;
	}

@Override
public Inventory saveOrupdateInventory(Inventory inventory) {
	// TODO Auto-generated method stub
	System.out.println(inventory.get_id());
	inventoryRepo.save(inventory);
	return inventory;

}

@Override
public int saveInventory(Inventory inventory) {
	// TODO Auto-generated method stub
	
	Inventory saveInvent=inventoryRepo.save(inventory);
	
	if(saveInvent != null)
		return 1;
	else
	return 0;
}




}
