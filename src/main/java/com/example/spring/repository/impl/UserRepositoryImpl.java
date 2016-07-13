package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository{

	@Override
	public List<User> list() {
        System.out.println("This returns a list");
		return new ArrayList<User>();
	}

	@Override
	public User get(int id) {
        System.out.println("This searches for a user based on the ID" );
		return null;
	}

	@Override
	public void save(User user) {
		System.out.println("This will save a user inside the list we just made");
	}

}
