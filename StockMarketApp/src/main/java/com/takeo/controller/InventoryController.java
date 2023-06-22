package com.takeo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.takeo.exception.RecordNotFoundException;
import com.takeo.model.Inventory;
import com.takeo.service.impl.InventoryServiceImpl;

@Controller
public class InventoryController {
	
	@Autowired
	private InventoryServiceImpl inventoryservice;
	
	@RequestMapping("/inventory")
	public String showInventoryPage(Inventory inventory, Model model)
	{
		List<Inventory> inventoryItems= inventoryservice.getAllInventory();
		
		model.addAttribute("inventoryItems", inventoryItems);
		
		return "inventory-page";
	}
	
	@RequestMapping("/add")
	public String showinventoryForm(Inventory inventory, Model model)
	{
		
		model.addAttribute("inventory", inventory);
		return "add-inventory";
	}
	
	@PostMapping("/insert")
	public String handleForm(@ModelAttribute  Inventory inventory, Model model)
	{
		Inventory addInventory=inventoryservice.createInventory(inventory);
		
		return "redirect:/inventory";
	}
	
	@RequestMapping(path= {"/delete/{id}"})
	public String delete(Model model, @PathVariable("id") String id)
	{
		inventoryservice.cancelInventory(id);
		return "redirect:/inventory";
	}
	
	
	
	@PostMapping(path= {"/update/{id}"})
	public String update(@ModelAttribute Inventory inventory, @PathVariable String id)
	{
		System.out.println(id);
		inventory.set_id(id);
		inventoryservice.saveOrupdateInventory(inventory);
		
		return "redirect:/inventory";
	}
	
	
	

	
	@RequestMapping(path= {"/update/{id}"})
	public String update(Model model, @PathVariable("id") String id) throws RecordNotFoundException
	{
		Optional<Inventory> inventory=inventoryservice.getInventoryById(id);
		
		model.addAttribute("inventory", inventory.get());
		

		  return "edit-inventory";
		
	}
	
	/*
	
	@RequestMapping(path = "/update/{id}")
	public String update(Model model, @PathVariable("id") String _id) throws RecordNotFoundException {
	    Optional<Inventory> inventoryOptional = inventoryservice.getInventoryById(_id);
	    
	    if (inventoryOptional.isPresent()) {
	        Inventory inventory = inventoryOptional.get();
	        model.addAttribute("inventory", inventory);
	    } else {
	        throw new RecordNotFoundException("Inventory not found with id: " + _id);
	    }
	    
	    return "edit-inventory";
	}
	*/
	
}
