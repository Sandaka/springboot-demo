package com.rst.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rst.boot.model.UserModel;
import com.rst.boot.services.UserServices;

@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/user")
public class User {

	@Autowired
	private UserServices userServices;

	@GetMapping("/all")
	public List<UserModel> allUsers() {
		System.out.println("get all method=======");
		return userServices.findAllUsers();
	}

	@PostMapping("/add")
	public String saveData(@RequestBody UserModel userModel) {
		userServices.saveUser(userModel);
		return "Data saved";
	}

	@PutMapping("/update")
	public String updateData(@RequestBody UserModel userModel) {
		return userServices.updateUser(userModel);
	}

	@GetMapping("/find/{id}")
	public UserModel getUserById(@PathVariable Integer id) {
		return userServices.findUserById(id);
	}
}
