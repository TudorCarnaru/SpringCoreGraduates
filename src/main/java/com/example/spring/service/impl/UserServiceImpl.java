package com.example.spring.service.impl;

import java.util.List;

import com.example.spring.domain.Person;
import com.example.spring.service.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public List<Person> list() {
		//call method from UserRepository and remove throw
		throw new UnsupportedOperationException();
	}

	@Override
	public Person get(int id) {
		//call method from UserRepository and remove throw
		throw new UnsupportedOperationException();
	}

	@Override
	public void save(Person person) {
		//call method from UserRepository and remove throw
		throw new UnsupportedOperationException();
	}
}
