package com.company.delivery.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String productName;
	private String productid;
	private String qty;
	private double price;
	private boolean active;
	private int[] availableDays;
	private long relatedAccountNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductid() {
		return productid;
	}

	public void setProductid(String productid) {
		this.productid = productid;
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

	public long getRelatedAccountNumber() {
		return relatedAccountNumber;
	}

	public void setRelatedAccountNumber(long relatedAccountNumber) {
		this.relatedAccountNumber = relatedAccountNumber;
	}

}
