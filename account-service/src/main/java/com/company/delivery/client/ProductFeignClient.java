package com.company.delivery.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.delivery.model.Product;

@FeignClient("product")
public interface ProductFeignClient {
	@RequestMapping(method = RequestMethod.POST, value = "product", consumes = "application/json")
	ResponseEntity<?> addProduct(@RequestHeader("co-related-id") String coRelatedId, Product product);
}