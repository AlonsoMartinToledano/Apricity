package com.nebrija.tpra;

public class Product extends Category { 
	private String productName;
	private float price;
	private int stock;
	private String brand;
	
	Product(String categoryName, String productName, float price, int stock) {
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
	
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	//stock Getter and Setter
	
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	//Brand Getter and Setter
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
}
