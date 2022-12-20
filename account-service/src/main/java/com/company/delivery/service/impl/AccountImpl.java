package com.company.delivery.service.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageBuilder;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.delivery.model.Accounts;
import com.company.delivery.model.Order;
import com.company.delivery.repository.AccountRepository;
import com.company.delivery.service.AccountService;

@Service
public class AccountImpl implements AccountService {
	@Autowired
	private AccountRepository repo;
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
		
		Message message = MessageBuilder.withBody(byteArray).build();
		rabbitTemplate.send("Order", "oid", message);
		
	}
}
