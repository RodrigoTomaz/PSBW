package com.client.PSBW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.PSBW.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
