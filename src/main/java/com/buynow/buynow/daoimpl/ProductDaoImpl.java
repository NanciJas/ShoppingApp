package com.buynow.buynow.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.buynow.buynow.dao.ProductDao;
import com.buynow.buynow.model.Brands;
import com.buynow.buynow.model.Product;
import com.buynow.buynow.repository.ProductRepo;


@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	ProductRepo productRepo;
	
	
	public String getName(int id) {
		Product pr = productRepo.getById(id);
		return pr.getProduct_name();
	}
	
	public Product getProduct(int id) {
		try {
			return productRepo.findById(id).get();
		}catch(Exception e) {
			System.out.println("No such product");
		}
		return null;
	}
	
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}
	public void deleteProduct(int id) {
		productRepo.deleteById(id);
	}
	public Product updateProduct(Product product,int id) {
		return productRepo.save(product);
	}
	
}
