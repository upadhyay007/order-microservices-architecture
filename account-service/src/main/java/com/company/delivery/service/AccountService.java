package com.company.delivery.service;

import java.io.IOException;

import org.springframework.http.ResponseEntity;

import com.company.delivery.entity.Accounts;
import com.company.delivery.model.Order;
import com.company.delivery.model.ProductModel;


public interface AccountService {

	Accounts getAccountDetails(int customerId);

	void createOrder(String accountId, Order order) throws IOException;

	ProductModel addProduct(String accountId, ProductModel product);

}
