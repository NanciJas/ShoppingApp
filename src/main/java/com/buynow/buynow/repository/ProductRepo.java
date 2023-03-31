package com.buynow.buynow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buynow.buynow.model.Product;

public interface ProductRepo  extends JpaRepository<Product, Integer>{
	
}
