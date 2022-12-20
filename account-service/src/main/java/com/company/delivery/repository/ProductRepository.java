package com.company.delivery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.company.delivery.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
