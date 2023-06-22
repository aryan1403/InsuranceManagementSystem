package com.takeo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.takeo.model.Admin;

public interface AdminRepo extends MongoRepository<Admin, Integer> {

}
