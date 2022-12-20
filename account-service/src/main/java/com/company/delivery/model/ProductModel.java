package com.company.delivery.model;

public class ProductModel {
	private int id;
	private String productName;
	private String productid;
	private String qty;
	private double price;
	
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
	@Override
	public String toString() {
		return "ProductModel [id=" + id + ", productName=" + productName + ", productid=" + productid + ", qty=" + qty
				+ ", price=" + price + "]";
	}

	
	 
}
