package com.example.userinfo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.userinfo.dto.UserDTO;
import com.example.userinfo.repo.UserRepo;

public class UserService {

	@Autowired
	UserRepo userRepo;

	public UserDTO addUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
