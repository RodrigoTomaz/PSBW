package com.client.PSBW.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.client.PSBW.entities.Order;
import com.client.PSBW.entities.User;
import com.client.PSBW.repositories.OrderRepository;
import com.client.PSBW.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "987456541", "1234567");
		User u2 = new User(null, "Rodrigo Green", "rodrigo@gmail.com", "971805462", "1234567");
	
		Order o1 = new Order(null, Instant.parse("2021-08-28T19:30:53Z"), u1);
		Order o2 = new Order(null, Instant.parse("2025-11-22T19:30:53Z"), u2);
		Order o3 = new Order(null, Instant.parse("2022-02-19T23:15:53Z"), u1);
		
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
	}
	
	
}
