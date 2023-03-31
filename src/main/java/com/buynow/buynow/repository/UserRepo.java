package com.buynow.buynow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.buynow.buynow.model.Users;

public interface UserRepo extends JpaRepository<Users,Integer>{

}
