package com.buynow.buynow.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.buynow.buynow.dao.BrandDao;
import com.buynow.buynow.model.Brands;
import com.buynow.buynow.repository.BrandRepo;

@Repository
public class BrandDaoImp implements BrandDao{
	
	@Autowired
	BrandRepo brandRepo;
	
	public Brands addBrand(Brands brand) {
		return brandRepo.save(brand);
	}
}
