package com.client.PSBW.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.client.PSBW.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
