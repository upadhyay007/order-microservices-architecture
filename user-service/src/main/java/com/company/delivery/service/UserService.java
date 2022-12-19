package com.company.delivery.service;

import com.company.delivery.model.Users;

public interface UserService {

	Users add(Users user);

	Users update(Users user);

	Users getUserById(String userId);

	Users searchUser(Users user);

	void delete(String userId);

}
