package com.company.delivery.service;

import org.springframework.stereotype.Service;

import com.company.delivery.model.Accounts;


public interface AccountService {

	Accounts getAccountDetails(int customerId);

}
