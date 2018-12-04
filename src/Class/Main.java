package Class;

import java.util.Scanner;

import Controller.General;

public class Main {
	public static void main(String[] args) {	
		//Variables
		String userName;
		String userPassword;
		String userPassword2;
		String userEmail;
		int option = 0;
		boolean equals = false;
		
		//Create a User and Admin
		Admin admin = new Admin();
		User user = new User("a", "a", "a");
		User user2 = new User("b", "b", "b");

		//Create Products
		Product pr1 = new Product("Clothing", "Shirt", 9.99, 100);
		Product pr2 = new Product("Video", "Camera", 350, 50);
		Product pr3 = new Product("Videogames", "Mario Kart", 34.95, 25);
		
		General.Inicio();
		
		/*
		
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
					System.out.print("\nPlease enter your User Name: ");
					Scanner n = new Scanner(System.in);
					userName = n.nextLine();
					
					System.out.print("Please enter your Password: ");
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
							Category.showCategoryName();
							break;
							
						//Show All Products
						case 4:
							Product.showProductName();
							break;
							
						//Search a Product
						case 5:
							Product.searchAProduct();
							break;
							
						//Exit
						case 6:
							System.out.println("\nGood bye");
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
					System.out.print("\nPlease enter your password: ");
					
					Scanner p = new Scanner(System.in);
					userPassword = p.nextLine();
					
					if(userPassword.equals(admin.getAdminPassword())) {
						do {
							System.out.println("\n<1> Change Password");
							System.out.println("<2> Change Normal User Name");
							System.out.println("<3> Increase Product Stock");
							System.out.println("<4> Generate a Category List File");
							System.out.println("<5> Generate a Product List File");
							System.out.println("<6> Exit");
							
							Scanner o1 = new Scanner(System.in);
							option = o1.nextInt();
							
							switch (option) {
							
								//Change Password
								case 1:
									do {
										System.out.print("\nEnter your New Password: ");
										
										Scanner p1 = new Scanner(System.in);
										userPassword = p1.nextLine();
										
										System.out.print("\nIntroduce again your New Password: ");
										Scanner p2 = new Scanner(System.in);
										userPassword2 = p2.nextLine();
										
										if(userPassword.equals(userPassword2)) { //Check if passwords match
											admin.setAdminPassword(userPassword);
											System.out.println("\nPassword changed successfully!");
										}
										else {
											System.out.println("\nPasswords do not match. Please, introuce it again");
										}
									}while(!userPassword.equals(userPassword2));
									break;
									
								//Change Normal User Name
								case 2:
									System.out.print("\nEnter the New Normal User Name: ");
									
									Scanner u = new Scanner(System.in);
									userName = u.nextLine();
									
									user.setUserName(userName);
									
									System.out.println("\nNormal User Name changed successfully!");
									break;
									
								//Increase Product Stock
								case 3:
									Product.increaseProductStock();
									break;
									
								//Generate a Category List File
								case 4:
									Category.writeCategoriesFile();
									break;
									
								//Generate a Product List File
								case 5:
									Product.writeProductsFile();
									break;
									
								//Exit
								case 6:
									System.out.println("\nGood bye");
									break;
									
								default:
									System.out.println("\nPlease, choose a valid option\n");
									break;
							}
						}while(option != 6);
						option = 3;
					}
					else {
						System.out.println("\nIncorrect password");
					}
				}while (!userPassword.equals(admin.getAdminPassword()));
			}
			
			//Exit
			else if (option == 3) {
				System.out.println("\nGood bye");
				break;
			}
		}while(option != 1 && option != 2 && option != 3);
		
		*/
		
	}
}