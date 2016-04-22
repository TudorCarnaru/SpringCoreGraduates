package com.example.spring.repository.impl;

import java.util.List;

import com.example.spring.domain.Person;
import com.example.spring.repository.UserRepository;

public class UserRepositoryImpl implements UserRepository{

	@Override
	public List<Person> list() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Person get(int id) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void save(Person person) {
		throw new UnsupportedOperationException();
	}

}
