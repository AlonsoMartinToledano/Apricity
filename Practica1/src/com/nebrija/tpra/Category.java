package com.nebrija.tpra;


public class Category {
	protected String categoryName;
	
	Category(String categoryName){
		this.categoryName = categoryName;
	}

	//categoryName Getter and Setter
	
	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
