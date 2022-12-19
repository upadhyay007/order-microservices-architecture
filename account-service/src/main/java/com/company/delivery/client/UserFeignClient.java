package com.company.delivery.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.delivery.model.Users;

@FeignClient("user")
public interface UserFeignClient {

	@RequestMapping(method = RequestMethod.POST, value = "user", consumes = "application/json")
	ResponseEntity<?> addUser(Users user);

	@RequestMapping(method = RequestMethod.GET, value = "user", consumes = "application/json")
	ResponseEntity<?> getUser(String userId);

	@RequestMapping(method = RequestMethod.PUT, value = "user", consumes = "application/json")
	ResponseEntity<?> updateUser(Users user);
}
