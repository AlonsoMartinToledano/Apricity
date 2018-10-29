# Advanced Programming Projects

This work shows the Java code that could be implemented in a web page destined to the sale of products to the user.

It consists of several classes:
#### - Menu:
  It is the main class of the program. It has the menu to choose between the differents options.
  There are different options as:
  Choose between a normal user or an admin. Both options check if the passwords are correct. Inside the normal user the options are:
  - Show account information
  - Change account information
  - Show all categories
  - Show all prducts
  - Search a product
  - Exit
  
    ```
    			System.out.println("What do you want to do?");
				System.out.println("<1> Account Information");
				System.out.println("<2> Change Account Information");
				System.out.println("<3> Show All Categories");
				System.out.println("<4> Show All Products");
				System.out.println("<5> Search a Product");
				System.out.println("<6> Exit");
    ```
    
    
#### - User and Admin:
  Every methods to access by the user and administrator.
  User has an email, user name and password. However, andmin only has a password to inter into the system.
  Each classes has the default constructor. It is not necessary an specific one beacause the system can not create a new user yet.
#### - Category:
  Everything related to the different categories of products.
  Category has a protected variable called categoryName. Encapsulated with methods to get the category name and to set it.
#### - Product:
  Methods to manage the products inside the cetegories.
  Products extends from category, so the product name is the same.
  The product constructor has new variables: Stock, that has the number of product that the system has. And Price, the value of the product.
  It also has the getters and setter of each method.
