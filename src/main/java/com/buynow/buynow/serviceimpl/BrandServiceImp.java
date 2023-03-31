package com.buynow.buynow.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buynow.buynow.dao.BrandDao;
import com.buynow.buynow.model.Brands;
import com.buynow.buynow.service.BrandService;

@Service
public class BrandServiceImp implements BrandService {

	@Autowired
	BrandDao brandDao;
	
	public Brands addBrand(Brands brand) {
		return brandDao.addBrand(brand);
	}

	
		
}
