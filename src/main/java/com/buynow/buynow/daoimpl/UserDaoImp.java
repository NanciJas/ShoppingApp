package com.buynow.buynow.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.buynow.buynow.dao.UserDao;
import com.buynow.buynow.model.Users;
import com.buynow.buynow.repository.UserRepo;

@Repository
public class UserDaoImp implements UserDao{
	@Autowired 
	UserRepo userRepo;
	
	public Users addProduct(Users users)
	{
		return userRepo.save(users);
	}

}
