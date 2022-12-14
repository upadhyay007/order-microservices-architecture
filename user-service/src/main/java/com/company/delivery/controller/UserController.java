package com.company.delivery.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.company.delivery.model.User;

public class UserController {
	
	@GetMapping("/hello")
	public String hello() {
		return "User Service is up and running!!";
	}

	@PostMapping("/user")
	public void addUser(User user) {

	}

	@PutMapping("/user")
	public void updateUser(User user) {

	}

	@PatchMapping("/user")
	public void partialUpdateUser(User user) {

	}

	@GetMapping("/user")
	public void getUser(String userId) {

	}

	@GetMapping("/user-search")
	public void searchUser(User user) {

	}

	@DeleteMapping("/user")
	public void deletaUser(String userId) {

	}

}
