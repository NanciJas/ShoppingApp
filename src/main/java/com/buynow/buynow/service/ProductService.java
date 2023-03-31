package com.buynow.buynow.service;

import com.buynow.buynow.model.Product;

public interface ProductService {
	public String getName(int id);
	public Product getProduct(int id);
	public Product addProduct(Product product);
	public void deleteProduct(int id);
	public Product updateProduct(Product product,int id);
}
