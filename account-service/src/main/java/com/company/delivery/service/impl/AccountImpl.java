package com.company.delivery.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.modelmapper.ModelMapper;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.company.delivery.entity.Accounts;
import com.company.delivery.entity.Product;
import com.company.delivery.model.Order;
import com.company.delivery.model.ProductModel;
import com.company.delivery.repository.AccountRepository;
import com.company.delivery.repository.ProductRepository;
import com.company.delivery.service.AccountService;

@Service
public class AccountImpl implements AccountService {
	@Autowired
	private AccountRepository repo;
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public Accounts getAccountDetails(int customerId) {
		return repo.findByCustomerId(customerId);
	}

	@Override
	public void createOrder(String accountId, Order order) throws IOException {
		order.setAccountId(accountId);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutput out = new ObjectOutputStream(bos);
		out.writeObject(order);
		out.flush();
		out.close();

		byte[] byteArray = bos.toByteArray();
		bos.close();
		
		System.out.println("Order Pleaced---> " + order.toString());
		
		Message message = MessageBuilder.withBody(byteArray).build();
		rabbitTemplate.send("Order", "oid", message);
	}

	@Override
	public ProductModel addProduct(String accountId, ProductModel productModel) {
		Product product = new Product();
		
		ModelMapper mapper = new ModelMapper();
		mapper.map(productModel, product);
		if (productRepo.save(product) != null) {
			mapper.map(product, productModel);
		}

		return productModel;
	}
}
