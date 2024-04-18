package lesson12.classwork0504;

import java.util.Scanner;

public class HwMain1soloBuy {
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
                1.45,
                1.12,
                0.85,
                2.5,
                3.02,
                1.6,
                0.65,
                1.0
        };
        System.out.print("Enter the product name: ");
        String buyProduct = scanner.nextLine();
        boolean found = false;

        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(buyProduct)) {
                System.out.println("Price of " + products[i] + ": €" + prices[i]);
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("This product is not available in the store.");
        }
    }
}
