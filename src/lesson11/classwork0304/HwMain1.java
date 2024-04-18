package lesson11.classwork0304;

import java.util.Scanner;

public class HwMain1 {
    public static void main(String[] args) {
        double[] moneyValue = {1.0, 1.10, 34,62};
        String[] array = {"EUR", "USD", "TL"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select the source currency:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }
        int choice = scanner.nextInt();

        if (choice < 1 || choice > array.length) {
            System.out.println("Invalid selection.");
            return;
        }
        System.out.println("Enter the amount of money:");
        double amount = scanner.nextDouble();

        System.out.println("Select the target currency:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }
        int targetChoice = scanner.nextInt();

        if (targetChoice < 1 || targetChoice > array.length) {
            System.out.println("Invalid selection.");
            return;
        }
        double changeAmount = amount * moneyValue[targetChoice - 1] / moneyValue[choice - 1];

        System.out.println(targetChoice + " = " + changeAmount);
    }
}
