package com.buynow.buynow.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buynow.buynow.dao.ProductDao;
import com.buynow.buynow.model.Product;
import com.buynow.buynow.service.ProductService;



@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao productDao;
	
	
	public String getName(int id) {
		return productDao.getName(id);
	}
	
	public Product getProduct(int id) {
		return productDao.getProduct(id);
	}
	
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}
	public void deleteProduct(int id) {
		productDao.deleteProduct(id);
	}
	public Product updateProduct(Product product,int id) {
		return productDao.updateProduct(product, id);
	}
}
