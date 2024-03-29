package com.example.userinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.userinfo.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
