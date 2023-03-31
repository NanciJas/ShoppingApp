package com.buynow.buynow.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.buynow.buynow.dao.UserDao;
import com.buynow.buynow.model.Users;
import com.buynow.buynow.service.UserService;

@Service
public class UserServiceImp implements UserService{
	@Autowired
	UserDao userDao;
	
	public Users addUser(Users users)
	{
		return userDao.addProduct(users);
	}
	

}
