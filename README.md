# PracticasProgramacionAvanzada

This work shows the Java code that could be implemented in a web page destined to the sale of products to the user.

It consists of several classes:
- Menu: Main menu with different options to choose into the program.
- User and Admin: Every methods to access by the user and administrator.
  User has an email, user name and password. However, andmin only has a password to inter into the system.
  Each classes has the default constructor. It is not necessary an specific one beacause the system can not create a new user yet.
- Category: Everything related to the different categories of products.
  Category has a protected variable called categoryName. Encapsulated with methods to get the category name and to set it.
- Product: Methods to manage the products inside the cetegories.
  Products extends from category, so the product name is the same.
  The product constructor has new variables: Stock, that has the number of product that the system has. And Price, the value of the product.
  It also has the getters and setter of each method.
