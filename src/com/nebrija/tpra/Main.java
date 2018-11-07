package com.nebrija.tpra;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//Variables
		String userName;
		String userName2;
		String userPassword;
		String userPassword2;
		String userEmail;
		String product;
		int option = 0;
		boolean equals = false;
		boolean productExist = true;
		
		//Create a User and Admin
		User user = new User();
		Admin admin = new Admin();
		
		//List of Categories
		List <Category> categoryList = new ArrayList<Category>();
		Category cat1 = new Category("Clothing");
		Category cat2 = new Category("Video");
		Category cat3 = new Category("Videogames");
		categoryList.add(cat1);
		categoryList.add(cat2);
		categoryList.add(cat3);
		
		//List of Products
		List <Product> productList = new ArrayList<Product>();	
		Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
		Product pr2 = new Product("Video", "Camera", 350, 50);
		Product pr3 = new Product("Videogames", "Mario Kart", 34.95, 25);
		productList.add(pr1);
		productList.add(pr2);
		productList.add(pr3);
		
		//Main Program		
		System.out.println("Welcome to Apricity.\nOne of the best online shopping sites arround the world.\n");
		do {
			System.out.println("<1> Normal User");
			System.out.println("<2> Admin");
			System.out.println("<3> Exit");
			Scanner o = new Scanner(System.in);
			option = o.nextInt();
			
			//Normal User
			if (option == 1) {
				
				//LogIn
				do {
					System.out.print("\nPlease enter your User Name:");
					Scanner n = new Scanner(System.in);
					userName = n.nextLine();
					
					System.out.print("Please enter your Password:");
					Scanner p = new Scanner(System.in);
					userPassword = p.nextLine();
					
					//Check if there are equals
					
					if(!userName.equals(user.getUserName()) || !userPassword.equals(user.getUserPassword())) {
						System.out.println("\nIncorrect User or Password");
					}
					else {
						System.out.println("\nHi " + user.getUserName());
						equals = true;
					}
				}while(!equals);
				
				//Normal User Options
				do {
					System.out.println("\nWhat do you want to do?");
					System.out.println("<1> Account Information");
					System.out.println("<2> Change Account Information");
					System.out.println("<3> Show All Categories");
					System.out.println("<4> Show All Products");
					System.out.println("<5> Search a Product");
					System.out.println("<6> Exit");
					
					Scanner o1 = new Scanner(System.in);
					option = o1.nextInt();
					
					switch (option) {
						//Account Information
						case 1:
							System.out.println("\nUser Name: " + user.getUserName());
							System.out.println("Password: " + user.getUserPassword());
							System.out.println("Email: " + user.getUserEmail());
							break;
						
						//Change Account Information
						case 2:
							System.out.println("\n What do you want to change?");
							System.out.println("<1> Change User Name");
							System.out.println("<2> Change Password");
							System.out.println("<3> Change Email");
							System.out.println("<4> Back");
							
							Scanner o2 = new Scanner(System.in);
							option = o2.nextInt();
							
							switch (option) {
							
								//Change User Name
								case 1:
									System.out.println("\nCurrent user can not change the User Name. Please, contact with an Admin to change it");
									break;
									
								//Change Password
								case 2:
									do {
										System.out.print("\nEnter your New Password: ");
										
										Scanner p = new Scanner(System.in);
										userPassword = p.nextLine();
										
										System.out.print("\nIntroduce again your New Password: ");
										Scanner p1 = new Scanner(System.in);
										userPassword2 = p1.nextLine();
										
										if(userPassword.equals(userPassword2)) { //Check if passwords match
											user.setUserPassword(userPassword);
											System.out.println("\nPassword changed successfully!");
										}
										else {
											System.out.println("\nPasswords do not match. Please, introuce it again");
										}
									}while(!userPassword.equals(userPassword2));
									break;
									
								//Change Email
								case 3:
									System.out.print("\nEnter your New Email: ");
									
									Scanner e = new Scanner(System.in);
									userEmail = e.nextLine();
									
									user.setUserEmail(userEmail);
									
									System.out.println("\nEmail changed successfully!");
									break;
									
								//Back
								case 4:
									break;
								default:
									System.out.println("\nPlease, choose a valid option\n");
									break;
							}
							break;
							
						//Show All Categories
						case 3:
							System.out.println("\nList of categories:");
							for (int i = 0; i < categoryList.size(); i++) {
								System.out.println(i + 1 + ".- " + (categoryList.get(i)).getCategoryName());
							}
							break;
							
						//Show All Products
						case 4:
							System.out.println("\nList of all products:");
							for (int i = 0; i < productList.size(); i++) {
								System.out.println(i + 1 + ".- " + (productList.get(i)).getProductName());
							}
							break;
							
						//Search a Product
						case 5:
							productExist = false;
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
							break;
							
						//Exit
						case 6:
							System.out.println("Good bye");
							break;
						default:
							System.out.println("\nPlease, choose a valid option\n");
							break;
					}
				}while(option != 6);
				option = 3;
			}
			
			//Admin
			else if (option == 2) {
				do {
					System.out.println("\nPlease enter your password: "); //Scan password
					
					Scanner p = new Scanner(System.in);
					userPassword = p.nextLine();					
					if(userPassword.equals(admin1.getAdminPassword())) {
						System.out.println("");
						System.out.println("In progress...");
					}
					else {
						System.out.println("");
						System.out.println("Incorrect password");
					}
				}while (!initialAdminPassword.equals(admin1.getAdminPassword()));
			}
			
			//Exit
			else if (option == 3) {
				System.out.println("Good bye");
				break;
			}
		}while(option != 1 && option != 2 && option != 3);
	}
}
