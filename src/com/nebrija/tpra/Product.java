package com.nebrija.tpra;

public class Product extends Category { 
	private String productName;
	private double productPrice;
	private int productStock;
	
	Product(String categoryName, String productName, double productPrice, int productStock) {
		super(categoryName);
		this.categoryName = categoryName;
		this.productName = productName;
		this.setProductPrice(productPrice);
		this.setProductStock(productStock);
	}

	//productName Getter and Setter
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	//productPrice Getter and Setter
	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	//productStock Getter and Setter
	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}
}