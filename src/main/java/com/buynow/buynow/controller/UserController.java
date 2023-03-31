package com.buynow.buynow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.buynow.buynow.model.Users;
import com.buynow.buynow.service.BrandService;
import com.buynow.buynow.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {
	@Autowired 
	UserService userService;
	
	
	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	public Users addUser(@RequestBody Users users) {
		return userService.addUser(users);
	}
	

}
