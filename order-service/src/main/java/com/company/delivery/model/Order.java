package com.company.delivery.model;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable{
	
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
	@Override
	public String toString() {
		return "Order [id=" + id + ", orderId=" + orderId + ", UserId=" + UserId + ", orderCreationDate="
				+ orderCreationDate + ", orderDetails=" + orderDetails + "]";
	}
	
	

}
