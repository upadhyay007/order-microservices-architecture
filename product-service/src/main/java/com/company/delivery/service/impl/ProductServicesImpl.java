package com.company.delivery.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.delivery.model.Product;
import com.company.delivery.repository.ProductRepository;
import com.company.delivery.service.ProductServices;
@Service
public class ProductServicesImpl implements ProductServices{
	
	@Autowired
	private ProductRepository repository;

	@Override
	public void addProduct(String coRelatedId, Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProduct(String coRelatedId, Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void partialProduct(String coRelatedId, Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteProduct(String coRelatedId, String productId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Product> getproduct(String coRelatedId, String productId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProduct(String coRelatedId, Boolean active) {
		// TODO Auto-generated method stub
		return null;
	}

}
