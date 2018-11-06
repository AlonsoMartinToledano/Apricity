package com.nebrija.tpra;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int option = 0;
		boolean equals = false;
		
		User user = new User();
		Admin admin = new Admin();
		
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
					String userName;
					String userPassword;
					System.out.println("\nPlease enter your User Name:");
					Scanner n = new Scanner(System.in);
					userName = n.nextLine();
					
					System.out.println("Please enter your Password:");
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
					System.out.println("What do you want to do?");
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
									break;
									
								//Change Email
								case 3:
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
							break;
							
						//Show All Products
						case 4:
							break;
							
						//Search a Product
						case 5:
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
				System.out.println("In progress...");
			}
			
			//Exit
			else if (option == 3) {
				break;
			}
		}while(option != 1 && option != 2 && option != 3);
	}
}
