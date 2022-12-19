package com.company.delivery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.delivery.model.Users;
import com.company.delivery.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/hello")
	public String hello() {
		return "User Service is up and running!!";
	}

	@PostMapping("/user")
	public ResponseEntity<?> addUser(Users user) {
		Users add = userService.add(user);
		return new ResponseEntity(HttpStatus.CREATED);
	}

	@PutMapping("/user")
	public ResponseEntity<?> updateUser(Users user) {
		Users add = userService.update(user);
		return new ResponseEntity(add, HttpStatus.OK);
	}

	@PatchMapping("/user")
	public ResponseEntity<?> partialUpdateUser(Users user) {
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/user")
	public ResponseEntity<?> getUser(String userId) {
		Users add = userService.getUserById(userId);
		return new ResponseEntity(add, HttpStatus.OK);
	}

	@GetMapping("/user-search")
	public ResponseEntity<?> searchUser(Users user) {
		Users add = userService.searchUser(user);
		return new ResponseEntity(HttpStatus.OK);
	}

	@DeleteMapping("/user")
	public ResponseEntity<?> deletaUser(String userId) {
		userService.delete(userId);
		return new ResponseEntity(HttpStatus.OK);
	}

}
