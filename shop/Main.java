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

public class Main {
    public static void main(String[] args) {

        //Array of hard-coded products
        Product[] products = {
                new Product("Mealie meal", 10.00),
                new Product("Cooking oil", 20.00),
                new Product("Ice cream", 30.00),
                new Product("Chocolate", 40.00),
                new Product("Milk", 50.00),
                new Product("Juice", 60.00)
        };

        //Prompt the user to select a product and show their prices
        System.out.println("Please select a product to add to your cart:");
        for (int i = 0; i < products.length; i++) {
            System.out.println((i+1) + ". " + products[i].name + " - K" + products[i].price);
        }

    }
}
