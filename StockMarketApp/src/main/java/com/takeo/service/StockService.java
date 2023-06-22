package com.takeo.service;

import java.util.List;
import java.util.Optional;

import com.takeo.model.Stock;

public interface StockService {
	
	
	 	public Stock createStock(Stock stock);
	    public Optional<Stock> getStockById(int sid);
	    public List<Stock> getAllStock();
	    public Stock updateStock(Stock stock);
	    public Stock deletStock(int sid);

}
