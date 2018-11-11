# Apricity
## Description
This is an exaple of ecommerce. This program has a storage system for products organized by different categories.
There are two types of users:
- Normal users: They will have access to the information of their own account, being able to change certain aspects, and to the information of different products.
- Admin: They will have access to all the different aspects of the program, being able to change the data.
## Classes
### Class Main
The Main Class contains the interface menu and different sub menus.
To begin ask to log in as an admin or a normal user.
Then, there are different menus depending on the type of user.
Also it has an Admin, User ad a list of Categories and Produts to begin to work with.
#### Normal User Menu
```
System.out.println("\nWhat do you want to do?");
System.out.println("<1> Account Information");
System.out.println("<2> Change Account Information");
System.out.println("<3> Show All Categories");
System.out.println("<4> Show All Products");
System.out.println("<5> Search a Product");
System.out.println("<6> Exit");
```
#### Admin Menu
```
System.out.println("\n<1> Change Password");
System.out.println("<2> Change Normal User Name");
System.out.println("<3> Generate a Category List File");
System.out.println("<4> Generate a Product List File");
System.out.println("<5> Exit");
```
### Class Admin
Contains a defaut constructor to create an Admin. Each Admin has a password. This class has methods to change and get the Admin Password.
### Class User
Contains a default constructor to create a Normal User. Each User has a User Email, User Name and Password. This class has methods to change and get each value of Normal User.
### Class Category
Contains a constructor with an Argument: Category Name. Category has a protected variable called categoryName. Encapsulated with methods to get the Category Name and to set it.
### Class Product
This class extends from Category, so the Category Name is the same. Then, the constructor has as Argument: categoyName, productName, productPrice and ProductStock. With each methods to change and get the different variables.
## Testing
Different JUnit Test destinated to test every program Constructor, List, Getter and Setter.
