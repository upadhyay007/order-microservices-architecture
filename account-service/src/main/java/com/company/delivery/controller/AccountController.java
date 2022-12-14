package com.company.delivery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.company.delivery.model.Accounts;
import com.company.delivery.model.Customer;
import com.company.delivery.model.Order;
import com.company.delivery.model.Product;
import com.company.delivery.model.User;

@RestController
public class AccountController {

	@GetMapping("/hello")
	private String hello() {
		return "Account Service is up and running!!";
	}

	@PostMapping("/account")
	private Accounts getAccountDetails(@RequestBody Customer customer) {
		// create account
		// customer.getCustomerId();
		return new Accounts();
	}

	@PostMapping("/add-product")
	public void addProduct(@RequestHeader("co-relation-id") String accountId, @RequestBody Product product) {
		System.out.println("Adding  product");
		// give request to product services to add the product
		// call feign client to add product
	}

	@GetMapping("/get-product")
	public void getProductDetails(@RequestHeader("co-relation-id") String accountId, String productId) {
		System.out.println("get product details");
		// If Product Id is Passed ...It will return specific product else all products
		// related with account
	}

	@PostMapping("/add-user")
	public void addUser(User user) {
		System.out.println("Add user");
		// Give request to User Service to add user
		// Add it to local user list also
	}

	@GetMapping("/get-user")
	public void getUser(User user) {
		System.out.println("get user from my own account");
		// Give request to local/own user list
	}

	@GetMapping("/search-user")
	public void searchUser(User user) {
		System.out.println("search user from user services");
		// Search user into user services
	}

	@PostMapping("/create-order")
	public void createOrder(@RequestHeader("co-relation-id") String accountId, Order order) {
		System.out.println("Pleace order for user");
		// push order creation request to queue
	}

}
