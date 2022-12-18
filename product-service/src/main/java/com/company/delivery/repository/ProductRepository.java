package com.company.delivery.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.company.delivery.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
List<Product> findByRelatedAccountNumber(Long relatedAccountNumber);
}
