package com.nebrija.tpra;

public class Product extends Category { 
	private String productName;
	private double price;
	private int stock;
	
	Product(String categoryName, String productName, double price, int stock) {
		super(categoryName);
		this.categoryName = categoryName;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
	}

	//productName Getter and Setter

	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}	
	
	//price Getter and Setter
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	//stock Getter and Setter
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
}
