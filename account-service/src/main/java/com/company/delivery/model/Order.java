package com.company.delivery.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5237692140552684097L;
	private int id;
	private String orderId;
	private String UserId;
	private Date orderCreationDate;
	//private OrderType type;
	private OrderDetails orderDetails;
	private String accountId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public Date getOrderCreationDate() {
		return orderCreationDate;
	}
	public void setOrderCreationDate(Date orderCreationDate) {
		this.orderCreationDate = orderCreationDate;
	}
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}
	public String getAccountId() {
		return accountId;
	}
	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	

}
