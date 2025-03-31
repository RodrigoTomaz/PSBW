package com.client.PSBW.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.client.PSBW.entities.Category;
import com.client.PSBW.entities.Order;
import com.client.PSBW.entities.Product;
import com.client.PSBW.entities.User;
import com.client.PSBW.entities.enums.OrderStatus;
import com.client.PSBW.repositories.CategoryRepository;
import com.client.PSBW.repositories.OrderRepository;
import com.client.PSBW.repositories.ProductRepository;
import com.client.PSBW.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired 
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRespository;

	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "987456541", "1234567");
		User u2 = new User(null, "Rodrigo Green", "rodrigo@gmail.com", "971805462", "1234567");
	
		Order o1 = new Order(null, Instant.parse("2021-08-28T19:30:53Z"), OrderStatus.PAID, u1);
		Order o2 = new Order(null, Instant.parse("2025-11-22T19:30:53Z"), OrderStatus.WAITING_PAYMENT, u2);
		Order o3 = new Order(null, Instant.parse("2022-02-19T23:15:53Z"), OrderStatus.WAITING_PAYMENT, u1);
		
		Category cat1 = new Category(null, "Eletronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, ""); 
		Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, ""); 
		Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, ""); 
		Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, ""); 
		Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, ""); 
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		productRespository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));
	}
	
	
}
