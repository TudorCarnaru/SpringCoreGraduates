package com.example.spring.service.impl;

import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.impl.UserRepositoryImpl;
import com.example.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepositoryImpl repository;
	@Override
	public List<User> list() {
		//call method from UserRepository and remove throw
		return repository.list();
	}

	@Override
	public User get(int id) {
		//call method from UserRepository and remove throw
		return repository.get(id);
	}

	@Override
	public void save(User user) {
		//call method from UserRepository and remove throw
		repository.save(user);
	}
}
