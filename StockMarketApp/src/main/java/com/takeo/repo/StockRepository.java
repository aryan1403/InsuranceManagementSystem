package com.takeo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.takeo.model.Stock;

public interface StockRepository extends MongoRepository<Stock, Integer> {

}
