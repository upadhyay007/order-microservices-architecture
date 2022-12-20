package com.company.delivery.model;

import java.io.Serializable;
import java.util.Arrays;

public class OrderDetails implements Serializable{
	private static final long serialVersionUID = 5237692140552684097L;
	private int id;
	private String orderid;
	private String qty;
	private double price;
	private boolean active;
	private int [] availableDays;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrderid() {
		return orderid;
	}
	public void setOrderid(String orderid) {
		this.orderid = orderid;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public int[] getAvailableDays() {
		return availableDays;
	}
	public void setAvailableDays(int[] availableDays) {
		this.availableDays = availableDays;
	}
	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", orderid=" + orderid + ", qty=" + qty + ", price=" + price + ", active="
				+ active + ", availableDays=" + Arrays.toString(availableDays) + "]";
	}

}
