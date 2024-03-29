package com.example.userinfo.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.userinfo.dto.UserDTO;
import com.example.userinfo.entity.User;
import com.example.userinfo.mapper.UserMapper;
import com.example.userinfo.repo.UserRepo;

public class UserService {

	@Autowired
	UserRepo userRepo;

	public UserDTO addUser(UserDTO userDTO) {
		User savedUser = userRepo.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));
		return UserMapper.INSTANCE.mapUserToUserDTO(savedUser);
	}
	
}
