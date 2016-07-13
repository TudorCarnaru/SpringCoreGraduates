package com.example.spring.controller;

import com.example.spring.domain.User;
import com.example.spring.service.UserService;
import com.example.spring.service.impl.UserServiceImpl;
import org.hibernate.annotations.SourceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class UserController {
    @Autowired
	private UserService usrSrv;
    @Qualifier("Us1")
	public void createUser(User user){
		user.setAge(21);
		user.setFirstname("Tudor");
		user.setLastname("Carnaru");
		user.setId(21);
		usrSrv.save(user);
        System.out.println(user.getFirstname());
    }
}
