package com.client.PSBW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.PSBW.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
