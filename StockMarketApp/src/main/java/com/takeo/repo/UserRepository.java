package com.takeo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.takeo.model.User;


public interface UserRepository extends MongoRepository<User, Integer> {

}
