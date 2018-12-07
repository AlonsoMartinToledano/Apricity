package Class;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product extends Category {
	private static List <Product> productList = new ArrayList <Product>();
	
	private String productName;
	private double productPrice;
	private int productStock;
	
	//Product Constructor
	public Product(String categoryName, String productName, double productPrice, int productStock) {
		super(categoryName);
		this.categoryName = categoryName;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
		
		productList.add(this);
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
	
	//Product List Size
		public static int productListSize() {
			return productList.size();
		}
		
	//Show Products
	public static void showProductName() {
		System.out.println("\nList of all products:");
		for (int i = 0; i < productList.size(); i++) {
			System.out.println(i + 1 + ". " + (productList.get(i)).getProductName());
		}
	}
	
	//Visualize Products
	public static String visualizeProducts() {
		String text1;
		String text2 = "";
		
		for (int i = 0; i < productList.size(); i++) {
			text1 = i + 1 + ". " + (productList.get(i)).getProductName() + "\n";
			text2 = text2 + text1;
		}
		return text2;
	}
	
	//Increase Product Stock
	public static void increaseProductStock() {
		int units = 0;
		
		System.out.println("\nWich product do you want to increase the stock?");
		boolean productExist = false;
		String product;

		Scanner p = new Scanner(System.in);
		product = p.nextLine();
		
		System.out.println("\nHow many units do you want to increase the stock?");
		
		Scanner u = new Scanner(System.in);
		units = u.nextInt();
		
		for (int i = 0; i < productList.size(); i++) {
			if(((productList.get(i)).getProductName()).equals(product)) {
				(productList.get(i)).setProductStock((productList.get(i)).getProductStock() + units);
				System.out.println("\nStock Increased");
				productExist = true;
				break;
			}
		}
		if (!productExist) {
			System.out.println("\nThe product does not exist in the database");
		}
	}
	
	//Increase Product Stock Visual
	public static void increaseProductStockVisual(String product, int units) {
		for (int i = 0; i < productList.size(); i++) {
			if(productList.get(i).getProductName().equals(product)) {
				productList.get(i).setProductStock((productList.get(i)).getProductStock() + units);
			}
		}
	}
	
	//Search a Product
	public static void searchAProduct() {
		boolean productExist = false;
		String product;
		
		System.out.println("\nIntroduce the name of the product to search: ");
		
		Scanner p = new Scanner(System.in);
		product = p.nextLine();
		
		for (int i = 0; i < productList.size(); i++) {
			if(((productList.get(i)).getProductName()).equals(product)) {
				System.out.println("\nCategory: " + (productList.get(i)).getCategoryName());
				System.out.println("Product: " + (productList.get(i)).getProductName());
				System.out.println("Price: " + (productList.get(i)).getProductPrice() + " $");
				System.out.println("Stock: " + (productList.get(i)).getProductStock() + " units");
				productExist = true;
				break;
			}
		}
		if (!productExist) {
			System.out.println("\nThe product does not exist in our database");
		}
	}
	
	//Product Exist
	public static boolean productExist(String product) {
		boolean exist = false;
		for (int i = 0; i < productList.size(); i++) {
			if(((productList.get(i)).getProductName()).equals(product)) {
				exist = true;
				break;
			}
			else {
				exist = false;
			}
		}
		return exist;
	}
	
	//Visualize a Product
	public static String visualizeAProduct(String product) {
		String text1;
		String text2 = "";
		
		for (int i = 0; i < productList.size(); i++) {
			if(((productList.get(i)).getProductName()).equals(product)) {
				text1 = "Category: " + productList.get(i).getCategoryName() +
						"\nProduct: " + productList.get(i).getProductName() +
						"\nPrice: " + productList.get(i).getProductPrice() + " $" +
						"\nStock: " + productList.get(i).getProductStock() + " units";
				text2 = text2 + text1;
			}
		}
		return text2;
	}
	
	//Write Products File
	public static void writeProductsFile() {
		String product;
		FileOutputStream fos2 = null;
		
		try {
			fos2 = new FileOutputStream("./ProductListFile.txt");
			for (int i = 0; i < productList.size(); i++) {
				product = i + 1 + ". " + (productList.get(i)).getProductName();
				
				fos2.write((product).getBytes());
				fos2.write(System.getProperty("line.separator").getBytes());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos2.close();
			}catch (Exception e) {	
			}
		}
		System.out.println("\nProduct List File generated successfully!");
	}
}