package com.company.delivery.service;

import com.company.delivery.model.Accounts;
import com.company.delivery.model.Order;


public interface AccountService {

	Accounts getAccountDetails(int customerId);

	void createOrder(String accountId, Order order);

}
