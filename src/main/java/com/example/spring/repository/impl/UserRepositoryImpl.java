package com.example.spring.repository.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.domain.User;
import com.example.spring.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class UserRepositoryImpl implements UserRepository{
    private ArrayList<User> newList = new ArrayList<User>();
	@Override
	public List<User> list() {
		return newList;
	}

	@Override
	public User get(int id) {
		for( User usr: newList)
		{
			if(id== usr.getId()) return usr;
		}
        return null;
	}

	@Override
	public void save(User user) {
		newList.add(user);
	}

}
