package com.company.delivery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.delivery.entity.Accounts;

@Repository
public interface AccountRepository extends CrudRepository<Accounts, Integer> {
	Accounts findByCustomerId(int customerId);
}
