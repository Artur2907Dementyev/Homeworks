package lesson12.classwork0504;

import java.util.Scanner;

public class HwMain2multiBuy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] products = {
                "apple",
                "banana",
                "orange",
                "grapes",
                "chocolate",
                "soda",
                "water",
                "tomato",
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
        };
        double totalCost = 0.0;
        boolean continueShopping = true;

        System.out.println("Welcome to the Cash Register Simulation!");

        while (true) {
            System.out.print("use (Buy or Buying) to end your shopping: ");
            String productName = scanner.nextLine();

            if (productName.equalsIgnoreCase("Buy") || productName.equalsIgnoreCase("Buying")) {
                continueShopping = false;
                break;
            }
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
                scanner.nextLine();

                double productCost = prices[productIndex] * quantity;
                System.out.println("Price for " + quantity + " " + products[productIndex] + ": €" + productCost + "\n");
                totalCost += productCost;
            }
        }
        System.out.println("Total cost: €" + totalCost);
        System.out.println("Thank you for shopping!");
    }
}
