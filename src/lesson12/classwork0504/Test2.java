package lesson12.classwork0504;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Create arrays for products and prices
        String[] products = {
                "apple",
                "banana",
                "chocolate",
                "orange",
                // Add more products as needed
        };
        double[] prices = {
                1.0,
                0.5,
                2.5,
                1.2,
                // Add corresponding prices for each product
        };

        System.out.println("Welcome to the Cash Register Simulation!");

        // Prompt user for product name
        System.out.print("Enter the product name (or 'end' to finish): ");
        String productName = scanner.nextLine();

        // Check if the product exists
        boolean productFound = false;
        for (int i = 0; i < products.length; i++) {
            if (products[i].equalsIgnoreCase(productName)) {
                System.out.println("Price of " + productName + ": €" + prices[i]);
                productFound = true;
                break;
            }
        }

        if (productFound) {
            System.out.println("This product is not in the store.");
        }

        // Additional task: Quantity input
        System.out.print("Enter the quantity needed: ");
        int quantity = scanner.nextInt();

        // Calculate total cost
        double totalCost = productFound ? prices[0] * quantity : 0.0;
        System.out.println("Total cost: €" + totalCost);

        scanner.close();
    }
}
