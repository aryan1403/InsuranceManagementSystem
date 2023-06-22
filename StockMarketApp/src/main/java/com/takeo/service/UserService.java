package com.takeo.service;

import java.util.Optional;

import com.takeo.model.User;

public interface UserService {
	
	

    public User createUser(User user);
    public Optional<User> getUserById(int uid);
    public Optional<User> getUserByUsername(String userName);
    public User updatUser(User user);
    public User deletUser(int uid);
    public boolean verifyUserCredentials(String userName, String passWord);

}
