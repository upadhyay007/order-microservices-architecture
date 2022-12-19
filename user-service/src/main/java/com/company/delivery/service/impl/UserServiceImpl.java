package com.company.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.delivery.model.Users;
import com.company.delivery.repository.UserRepositroy;
import com.company.delivery.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepositroy repository;

	@Override
	public Users add(Users user) {
		Users save = repository.save(user);
		return save;
	}

	@Override
	public Users update(Users user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	@Override
	public Users getUserById(String userId) {
		// TODO Auto-generated method stub
		return repository.findByUserid(userId).get();
	}

	@Override
	public Users searchUser(Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(String userId) {
		// TODO Auto-generated method stub
		
	}

}
