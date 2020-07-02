package com.rst.boot.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rst.boot.model.UserModel;
import com.rst.boot.repositories.UserRepository;
import com.rst.boot.services.UserServices;

@Service
public class UserServicesImpl implements UserServices{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserModel> findAllUsers() {
		// TODO Auto-generated method stub
		List<UserModel> allUsers = userRepository.findAll();
		return allUsers;
	}

	@Override
	public UserModel saveUser(UserModel userModel) {
		// TODO Auto-generated method stub
		return userRepository.save(userModel);
	}

	@Override
	public String updateUser(UserModel userModel) {
		// TODO Auto-generated method stub
		String msg = null;
		if(null != userModel) {
			userRepository.save(userModel);
			msg = "updated";
		}else {
			msg = "error when updating";
		}
		
		return msg;
	}

	@Override
	public UserModel findUserById(Integer id) {
		// TODO Auto-generated method stub
		return userRepository.getOne(id);
	}

}
