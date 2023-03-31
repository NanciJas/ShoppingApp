package com.buynow.buynow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.buynow.buynow.model.Brands;
import com.buynow.buynow.service.BrandService;

@RestController
@RequestMapping("/api/brand")
public class BrandController {
	@Autowired 
	BrandService brandService;
	
	@PostMapping("/create")
//	@ResponseStatus(HttpStatus.CREATED)
	public Brands addBrand(@RequestBody Brands brand) {
		return brandService.addBrand(brand);
	}

}
