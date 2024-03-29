package com.example.userinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.userinfo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
