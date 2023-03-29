package shop;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    //    initializing the name and price properties
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    //    creating an array list to store the products
    ArrayList<Product> cart =new ArrayList<Product>();

    //    creating a method to add products to the cart
    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            cart.add(product);
        }
        cart.add(product);
    }

    //    creating a method to remove products from the cart
    public void removeProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            cart.remove(product);
        }
    }

    //    creating a method to calculate the total price of the products in the cart
    public void viewCart() {
        double total = 0;
        System.out.println("Your cart contains: ");
        for (Product product : cart) {
            System.out.println(product.name + " - K" + product.price);
            total += product.price;
        }
        System.out.println("Total price: " + total);
    }
}


public class Main {
    public static void main(String[] args) {
        //      Array of hard-coded products
        Product[] products = {
                new Product("Mealie meal", 10.00),
                new Product("Cooking oil", 20.00),
                new Product("Ice cream", 30.00),
                new Product("Chocolate", 40.00),
                new Product("Milk", 50.00),
                new Product("Juice", 60.00)
        };

        //      Prompt the user to select a product and show their prices
        System.out.println("Please select a product to add to your cart:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i].name + " - K" + products[i].price);
        }

        //      Creating a constructor for the ShoppingCart class and a scanner to read user input
        ShoppingCart cart = new ShoppingCart();
        Scanner scanner = new Scanner(System.in);

        //      Creating a while loop to keep the program running until the user exits
        while (true) {
            System.out.println("Choose a command: ");
            System.out.println("1. Add product to cart");
            System.out.println("2. Remove product from cart");
            System.out.println("3. View cart");
            System.out.println("4. Exit");
            int commandNumber = scanner.nextInt();
            scanner.nextLine();

            //      Creating a switch statement to handle the user's input
            switch (commandNumber) {
                case 1:
                    System.out.println("Enter the product number: ");
                    int productNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    cart.addProduct(products[productNumber - 1], quantity);
                    break;
                case 2:
                    System.out.println("Enter the product number: ");
                    productNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter the quantity: ");
                    quantity = scanner.nextInt();
                    scanner.nextLine();
                    cart.removeProduct(products[productNumber - 1], quantity);
                    break;
                case 3:
                    cart.viewCart();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid command");
            }
        }

    }
}
