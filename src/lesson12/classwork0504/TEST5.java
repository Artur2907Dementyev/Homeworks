package lesson12.classwork0504;

import java.util.Scanner;

public class TEST5 {
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
        System.out.print("Enter the product name: ");
        int amount = 0;
        for (int i = 0; i < products.length; i++) {
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("end") || item.equalsIgnoreCase("The End")) {
                break;
            }
            prices[i] = scanner.nextInt();
            scanner.nextLine();
            products[i] = item;
            amount++;
        }
        int totalTime = 0;
        for (int i = 0; i < amount; i++) {
            totalTime += prices[i];
        }
        System.out.println("full time" + totalTime);

        for (int i = 0; i < amount; i++) {
            System.out.println((i + 1) + ". " + products[i] + "(" + prices[i] + "minutes)");
        }

    }
}
