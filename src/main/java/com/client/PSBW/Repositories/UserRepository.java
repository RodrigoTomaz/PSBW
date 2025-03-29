package com.client.PSBW.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.PSBW.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
