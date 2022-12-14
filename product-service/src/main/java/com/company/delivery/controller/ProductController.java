package com.company.delivery.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.delivery.model.Product;

@RestController
public class ProductController {

	@GetMapping("/hello")
	public String hello() {
		return "Product Service is up and running!!";
	}

	@PostMapping("/product")
	public void addProduct(Product product) {

	}

	@PutMapping("/product")
	public void updateProduct(Product product) {

	}

	@PatchMapping("/product")
	public void partialProduct(Product product) {

	}

	@DeleteMapping("/product")
	public void deleteProduct(String productId) {

	}

	@GetMapping("/product")
	public void getproduct(String productId) {

	}
}
