package com.nebrija.tpra;

import java.util.*;

public class Menu {
	
	public static void main(String[] args) {
		int option1 = 0;
		int option2 = 0;
		int option3 = 0;
		boolean productExist = true;
		String initialUser;
		String initialPassword;
		String initialPassword2;
		String initialAdminPassword;
		String initialEmail;
		String initialEmail2;
		String initialSearch;
		
		User user1 = new User(); //User
		Admin admin1 = new Admin();
		
		List <Category> categoryList = new ArrayList<Category>(); //Category
		Category cat1 = new Category("Clothing");
		Category cat2 = new Category("Video");
		Category cat3 = new Category("Videogames");
		categoryList.add(cat1);
		categoryList.add(cat2);
		categoryList.add(cat3);
		
		List <Product> productList = new ArrayList<Product>();	
		Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
		Product pr2 = new Product("Video", "Camera", 350, 50);
		Product pr3 = new Product("Videogames", "Mario Kart", 34.95, 25);
		productList.add(pr1);
		productList.add(pr2);
		productList.add(pr3);
		
		System.out.println("WELCOME TO AMAZONSO");
		do {
			System.out.println("");
			System.out.println("<1> Normal User");
			System.out.println("<2> Admin");
			Scanner a = new Scanner(System.in); //Scan the option
			option1 = a.nextInt();
			
			if(option1 == 1) { //Normal User
				do {
					System.out.println("");
					System.out.println("Please enter your username: "); //Scan user
					Scanner u = new Scanner(System.in);
					initialUser = u.nextLine();
					
					System.out.println("Please enter your password: "); //Scan password
					Scanner p = new Scanner(System.in);
					initialPassword = u.nextLine();
					
					if(!initialUser.equals(user1.getUserName()) || !initialPassword.equals(user1.getUserPassword())) { //Validate user and password
						System.out.println("");
						System.out.println("Incorrect User or Password");
						System.out.println("");
					}
					else {
						System.out.println("");
						System.out.println("Hi " + user1.getUserName());
					}
				}
				while(!initialUser.equals(user1.getUserName()) || !initialPassword.equals(user1.getUserPassword()));

				
				do { //Menu to choose an option
					System.out.println("");
					System.out.println("What do you want to do?");
					System.out.println("<1> Account Information");
					System.out.println("<2> Change Account Information");
					System.out.println("<3> Show All Categories");
					System.out.println("<4> Show All Products");
					System.out.println("<5> Search a Product");
					System.out.println("<6> Exit");
					Scanner o = new Scanner(System.in); //Scan the option
					option2 = o.nextInt();
					
					switch (option2) {
						case 1: //Account Information
							System.out.println("");
							System.out.println("User Name: " + user1.getUserName());
							System.out.println("Password: " + user1.getUserPassword());
							System.out.println("Email: " + user1.getEmail());
							break;
						case 2: //Change Account Information		
							do {
								System.out.println("");
								System.out.println("What do you want to change?");
								System.out.println("");
								System.out.println("<1> Change User Name");
								System.out.println("<2> Change Password");
								System.out.println("<3> Change Email");
								System.out.println("<4> Back");
								
								Scanner o2 = new Scanner(System.in); //Scan the option
								option3 = o2.nextInt();
								
								switch (option3) {
								case 1: //Change User Name
									System.out.println("");
									System.out.println("Current user can not change the User Name. Please, contact with an Admin to change it");
									break;
								case 2: //Change Password
									do {
										System.out.println("");
										System.out.print("Introduce your New Password: ");
										
										Scanner p = new Scanner(System.in); //First Password change
										initialPassword = p.nextLine();
										
										System.out.print("Introduce again your New Password: ");
										Scanner p2 = new Scanner(System.in); //Second Password change
										initialPassword2 = p2.nextLine();
										
										if(!initialPassword.equals(initialPassword2)) { //Check if passwords match
											System.out.println("");
											System.out.println("Passwords do not match. Please, introuce it again");
										}
										else { //Rewrite old password
											user1.setUserPassword(initialPassword);
											System.out.println("Password changed successfully");
										}
									}while(!initialPassword.equals(initialPassword2));
									break;
								case 3: //Change Email
									do {
										System.out.println("");
										System.out.print("Introduce your New Email: ");
										
										Scanner e = new Scanner(System.in); //First Email change
										initialEmail = e.nextLine();
										
										System.out.print("Introduce again your New Email: ");
										Scanner e2 = new Scanner(System.in); //Second Email change
										initialEmail2 = e2.nextLine();
										
										if(!initialEmail.equals(initialEmail2)) { //Check if Mails match
											System.out.println("");
											System.out.println("Mails do not match. Please, introuce it again");
										}
										else { //Rewrite old Email
											user1.setEmail(initialEmail);
											System.out.println("Email changed successfully");
										}								
									}while(!initialEmail.equals(initialEmail2));
									break;
								case 4: //Back
									break;
								default:
									System.out.println("");
									System.out.println("Please, choose a valid option"); //Default if the user don't choose an valid option
									break;
								}
							}while(option3 != 4);
							break;
						case 3: //Show All Categories	
							System.out.println("");
							for (int i = 0; i < categoryList.size(); i++) {
								System.out.println((categoryList.get(i)).getCategoryName());
							}
							break;
						case 4: //Show All Products
							System.out.println("");
							for (int i = 0; i < productList.size(); i++) {
								System.out.println((productList.get(i)).getProductName());
							}
							break;
						case 5: //Search a Product
							productExist = false;
							System.out.println("");
							System.out.println("Introduce the name of the product to search: "); //Scan product name
							Scanner p = new Scanner(System.in);
							initialSearch = p.nextLine();
							for (int i = 0; i < productList.size(); i++) {
								if(((productList.get(i)).getProductName()).equals(initialSearch)) {
									System.out.println("");
									System.out.println("Category: " + (productList.get(i)).getCategoryName());
									System.out.println("Product: " + (productList.get(i)).getProductName());
									System.out.println("Price: " + (productList.get(i)).getPrice());
									System.out.println("Stock: " + (productList.get(i)).getStock());
									productExist = true;
									break;
								}
							}
							if (!productExist) {
								System.out.println("");
								System.out.println("This product do not exist in our database");
							}
							break;
						case 6: //Exit
							System.out.println("");
							System.out.println("Goodbye");
							break;
						default:
							System.out.println("");
							System.out.println("Please, choose a valid option"); //Default if the user don't choose an valid option
							break;
					}
				}while(option2 != 6);
			}
			
			else if (option1 == 2) { //Admin
				do {
					System.out.println("");
					System.out.println("Please enter your password: "); //Scan password
					Scanner p2 = new Scanner(System.in);
					initialAdminPassword = p2.nextLine();					
					if(initialAdminPassword.equals(admin1.getAdminPassword())) {
						System.out.println("");
						System.out.println("In progress...");
					}
					else {
						System.out.println("");
						System.out.println("Incorrect password");
					}
				}while (!initialAdminPassword.equals(admin1.getAdminPassword()));
			}
			else {
				System.out.println("");
				System.out.println("Please, choose a valid option");
			}
		}while(option1 != 1 || option1 != 2);
	}
}