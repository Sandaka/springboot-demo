package com.rst.boot.services;

import java.util.List;

import com.rst.boot.model.UserModel;

public interface UserServices {

	public List<UserModel> findAllUsers();
	
	public UserModel saveUser(UserModel userModel);
	
	public String updateUser(UserModel userModel);
	
	public UserModel findUserById(Integer id);
	
}
