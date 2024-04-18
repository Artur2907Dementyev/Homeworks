package lesson12.classwork0504;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // Define products and their corresponding prices
        String[] products = {
                "apple",
                "banana",
                "orange",
                "grapes",
                "chocolate",
                "soda",
                "water",
                "tomato",
                // Add more products as needed
        };

        double[] prices = {
                1.0,
                0.5,
                0.8,
                2.5,
                3.0,
                1.6,
                0.6,
                1.0
                // Add more prices corresponding to the products
        };

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the product name
        System.out.print("Enter the product name: ");
        String userInput = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        // Search for the product in the array
        boolean found = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(userInput)) {
                System.out.println("Price of " + products[i] + ": $" + prices[i]);
                found = true;
                break;
            }
        }
        // If the product is not found, display a message
        if (found) {
            System.out.println("This product is not available in the store.");
        }
    }
}
