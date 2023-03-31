package com.buynow.buynow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.buynow.buynow.model.Product;
import com.buynow.buynow.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProudctController {
	
	@Autowired
	ProductService productService;
	
	  @GetMapping("/getname/{id}")
	  public String getName(@PathVariable int id){
		  
		  return productService.getName(id);
	  }
	  
	  @GetMapping("/get/{id}")
	  public Product getProduct(@PathVariable int id){
		  return productService.getProduct(id);
	  }
	  
	  @PostMapping("/create")
	    @ResponseStatus(HttpStatus.CREATED)
	  public Product addProduct(@RequestBody Product product)
	    {
	        return productService.addProduct(product);
	    }
	  @DeleteMapping("/delete/{id}")
	    public void deleteStudent(@PathVariable(value = "id") int id)
	    {
	        productService.deleteProduct(id);
	    }
	  
	  @PutMapping("/update/{id}")
	   public Product updateProduct(@RequestBody Product product,@PathVariable int id)
	  	{
		  return productService.updateProduct(product, id);
	    }
	  
	  
	  
 
}
