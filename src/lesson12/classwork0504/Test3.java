package lesson12.classwork0504;

import java.util.Scanner;

public class Test3 {
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
                // Add more products here...
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
                // Add more prices here...
        };
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        double totalCost = 0.0;
        boolean continueShopping = true;

        System.out.println("Welcome to the Cash Register Simulation!");

        while (continueShopping) {
            System.out.print("To end your shopping, use: (Buy or Buying)");
            String productName = scanner.nextLine();

            if (productName.equalsIgnoreCase("Buy") || productName.equalsIgnoreCase("Buying")) {
                continueShopping = false;
                break;
            }
            // Search for the product in the array
            int productIndex = -1;
            for (int i = 0; i < products.length; i++) {
                if (products[i].equalsIgnoreCase(productName)) {
                    productIndex = i;
                    break;
                }
            }
            if (productIndex == -1) {
                System.out.println("This product is not in the store.");
            } else {
                System.out.print("Enter the quantity needed: ");
                int quantity = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                double productCost = prices[productIndex] * quantity;
                System.out.println("Price for " + quantity + " " + products[productIndex] + ": €" + productCost);
                totalCost += productCost;
            }
        }
        System.out.println("Total cost: €" + totalCost);
        System.out.println("Thank you for shopping!");
    }
}
