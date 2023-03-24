# ShoppingCartApplication
This is a simple Java application that simulates a shopping cart. The application allows users to add and remove products from the cart and view the total cost of all products in the cart.
Getting Started
To run the application, compile the Main.java file and run the resulting Main.class file. The application will prompt you to select a command from a list of options.
Commands
The following commands are available:

Add product to cart: Prompts the user to select a product and quantity, and adds the product to the cart.
Remove product from cart: Prompts the user to select a product to remove and removes it from the cart.
View cart: Displays the contents of the cart and the total cost of all products in the cart.
Exit: Exits the application.
Product Class
The Product class represents a product that can be added to the shopping cart. Each product has a name and a price.
ShoppingCart Class
The ShoppingCart class represents the shopping cart. It contains an ArrayList of Product objects and provides methods for adding and removing products, as well as displaying the contents of the cart and the total cost of all products in the cart.

Main Class
The Main class is the entry point of the application. It contains the main method, which creates an array of Product objects and a ShoppingCart object, and prompts the user to select a command. Depending on the command selected, the Main class calls methods on the ShoppingCart object to add or remove products or display the contents of the cart.
