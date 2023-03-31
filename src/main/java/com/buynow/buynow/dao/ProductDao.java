package com.buynow.buynow.dao;

import com.buynow.buynow.model.Product;

public interface ProductDao {
	
	public String getName(int id) ;
	public Product getProduct(int id) ;
	public Product addProduct(Product product);
	public void deleteProduct(int id);
	public Product updateProduct(Product product,int id);
}
