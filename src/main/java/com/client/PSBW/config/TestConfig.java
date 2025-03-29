package com.client.PSBW.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.client.PSBW.Repositories.UserRepository;
import com.client.PSBW.entity.User;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "987456541", "1234567");
		User u2 = new User(null, "Rodrigo Green", "rodrigo@gmail.com", "971805462", "1234567");
	
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
