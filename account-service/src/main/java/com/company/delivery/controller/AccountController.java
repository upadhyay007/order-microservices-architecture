package com.company.delivery.controller;

import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.company.delivery.client.ProductFeignClient;
import com.company.delivery.client.UserFeignClient;
import com.company.delivery.entity.Accounts;
import com.company.delivery.model.Customer;
import com.company.delivery.model.Order;
import com.company.delivery.model.ProductModel;
import com.company.delivery.model.UsersModel;
import com.company.delivery.service.AccountService;

@RestController
public class AccountController {
	@Autowired
	private AccountService accountService;
	@Autowired
	private UserFeignClient userFeignClient;
	@Autowired
	private ProductFeignClient productFeignClient;

	/**
	 * 
	 * @return
	 */
	@GetMapping("/hello")
	public String hello() {
		return "Account Service is up and running!!";
	}

	/**
	 * 
	 * @param customer
	 * @return
	 */
	@PostMapping("/account")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		// create account
		// customer.getCustomerId();
		Accounts account = accountService.getAccountDetails(customer.getCustomerId());
		return account;
	}

	/**
	 * 
	 * @param accountId
	 * @param product
	 */
	@PostMapping("/add-product")
	public ResponseEntity<?> addProduct(@RequestHeader("co-relation-id") String accountId,
			@RequestBody ProductModel product) {
		System.out.println("Adding  product  : " + product.toString());
		// first add the product to the account micro services
		ProductModel addProduct = accountService.addProduct(accountId, product);
		// call feign client to add product
		System.out.println("Account -> " + addProduct.toString());
		return productFeignClient.addProduct(accountId, addProduct);

	}

	/**
	 * 
	 * @param accountId
	 * @param productId
	 * @return
	 */
	@GetMapping("/get-product")
	public ResponseEntity<?> getProductDetails(@RequestHeader("co-relation-id") String accountId, String productId) {
		System.out.println("get product details");
		// If Product Id is Passed ...It will return specific product else all products
		// related with account
		return null;
	}

	@GetMapping("/get-all-product")
	public ResponseEntity<?> getAllProductDetails(@RequestHeader("co-relation-id") String accountId, String productId) {
		System.out.println("get product details");
		// If Product Id is Passed ...It will return specific product else all products
		// related with account
		return productFeignClient.getAllProduct(accountId);
	}

	/**
	 * 
	 * @param user
	 */
	@PostMapping("/add-user")
	public ResponseEntity<?> addUser(UsersModel user) {
		System.out.println("Add user");
		// Give request to User Service to add user
		// Add it to local user list also
		return userFeignClient.addUser(user);
	}

	/**
	 * 
	 * @param user
	 */
	@GetMapping("/get-user")
	public void getUser(UsersModel user) {
		System.out.println("get user from my own account");
		// Give request to local/own user list
		userFeignClient.getUser(user.getUserId());
	}

	/**
	 * 
	 * @param user
	 */
	@GetMapping("/search-user")
	public void searchUser(UsersModel user) {
		System.out.println("search user from user services");
		// Search user into user services
	}

	/**
	 * 
	 * @param accountId
	 * @param order
	 * @throws IOException
	 */
	@PostMapping("/create-order")
	public void createOrder(@RequestHeader("co-relation-id") String accountId, @RequestBody Order order) throws IOException {
		System.out.println("Pleace order for user");
		// push order creation request to queue
		accountService.createOrder(accountId, order);
	}

}
