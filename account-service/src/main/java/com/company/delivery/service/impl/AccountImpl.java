package com.company.delivery.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.delivery.model.Accounts;
import com.company.delivery.repository.AccountRepository;
import com.company.delivery.service.AccountService;

@Service
public class AccountImpl implements AccountService {
	@Autowired
	private AccountRepository repo;

	@Override
	public Accounts getAccountDetails(int customerId) {
		return repo.findByCustomerId(customerId);
	}
}
