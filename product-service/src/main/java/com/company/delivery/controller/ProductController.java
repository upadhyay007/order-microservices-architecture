package com.company.delivery.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.company.delivery.model.Product;
import com.company.delivery.service.ProductServices;

@RestController
//@RequestMapping("/")
public class ProductController { 
	@Autowired
	private ProductServices productService;

	@GetMapping("/hello")
	public String hello() {
		return "Product Service is up and running!!";
	}

	@PostMapping("/product")
	public ResponseEntity<?> addProduct(@RequestHeader("co-related-id") String coRelatedId, @RequestBody Product product) {
		System.out.println("Prdouct --> " + product.toString());
		System.out.println("ProductController : co-related-id->"+ coRelatedId + " product : " + product.toString());
		productService.addProduct(coRelatedId, product);
		return new ResponseEntity(HttpStatus.CREATED);
	}

	@PutMapping("/product")
	public ResponseEntity<?> updateProduct(@RequestHeader("co-related-id") String coRelatedId, @RequestBody Product product) {
		productService.updateProduct(coRelatedId, product);
		return new ResponseEntity(HttpStatus.OK);
	}

	@PatchMapping("/product")
	public ResponseEntity<?> partialProduct(@RequestHeader("co-related-id") String coRelatedId, @RequestBody Product product) {
		productService.partialProduct(coRelatedId, product);
		return new ResponseEntity(HttpStatus.OK);
	}

	@DeleteMapping("/product")
	public ResponseEntity<?> deleteProduct(@RequestHeader("co-related-id") String coRelatedId, String productId) {
		productService.deleteProduct(coRelatedId, productId);
		return new ResponseEntity(HttpStatus.OK);
	}

	@GetMapping("/product")
	public ResponseEntity<?> getproduct(@RequestHeader("co-related-id") String coRelatedId, String productId) {
		List<Product> products = productService.getproduct(coRelatedId, productId);
		return new ResponseEntity(products, HttpStatus.OK);
	}

	@GetMapping("/product-all")
	public ResponseEntity<?> getAllProduct(@RequestHeader("co-related-id") String coRelatedId) {
		List<Product> products = productService.getAllProduct(coRelatedId, false);
		return new ResponseEntity(products, HttpStatus.OK);
	}
}
