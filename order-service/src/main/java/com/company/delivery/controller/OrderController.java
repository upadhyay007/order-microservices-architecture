package com.company.delivery.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import com.company.delivery.model.Order;

public class OrderController {

	@GetMapping("/hello")
	public String hello() {
		return "User Service is up and running!!";
	}

	@PostMapping("/order")
	public void createOrder(@RequestHeader("co-related-id") String relatedId, Order order) {

	}

	@PutMapping("/order")
	public void updateOrder(@RequestHeader("co-related-id") String relatedId, Order order) {

	}

	@DeleteMapping("/order")
	public void deleteOrder(@RequestHeader("co-related-id") String relatedId, String oiderID) {

	}

	@GetMapping("/order")
	public void getAllOrder(@RequestHeader("co-related-id") String relatedId, boolean active) {

	}

}
