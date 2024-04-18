package lesson12.classwork0504;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        // Define the products and their corresponding prices
        String[] products = {"apple", "banana", "chocolate", "orange"};
        double[] prices = {1.0, 0.5, 2.5, 1.2};

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the product name
        System.out.print("purchasing charging recommended: " + "\n");
        System.out.print("Enter the product name: ");
        String productName = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        // Check if the product exists
        boolean productFound = false;
        double productPrice = 0.0;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(productName)) {
                productFound = true;
                productPrice = prices[i];
                break;
            }
        }

        if (productFound) {
            // Prompt the user for the quantity
            System.out.print("Enter the quantity: ");
            int quantity = scanner.nextInt();

            // Calculate the total price
            double totalPrice = productPrice * quantity;
            System.out.println("Total price for " + quantity + " " + productName + "(s): €" + totalPrice);
        } else {
            System.out.println("This product is not in the store.");
        }

        // Close the scanner
        scanner.close();
    }
}
