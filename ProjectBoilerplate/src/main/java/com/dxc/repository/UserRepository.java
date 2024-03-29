package com.dxc.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dxc.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	public Optional<User> findByUserIdAndUserPassword(int userId, String userPassword); 
}