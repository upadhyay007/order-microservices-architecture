package com.company.delivery.service;

import java.util.List;

import com.company.delivery.model.Product;

public interface ProductServices {

	void addProduct(String coRelatedId, Product product);

	void updateProduct(String coRelatedId, Product product);

	void partialProduct(String coRelatedId, Product product);

	void deleteProduct(String coRelatedId, String productId);

	List<Product> getproduct(String coRelatedId, String productId);

	List<Product> getAllProduct(String coRelatedId, Boolean active);

}
