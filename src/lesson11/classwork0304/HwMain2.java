package lesson11.classwork0304;

import java.util.Scanner;

public class HwMain2 {
    public static void main(String[] args) {


        String[] array = {"EURO", "USD", "TL"};
        System.out.println("Welcome to CurrencyConverter!");

        int sum = -1;
        while (sum != 0) {

            System.out.println("Select source currency:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(i + 1 + ". " + array[i]);
            }
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            sum = scanner.nextInt();

            if (sum == 0) {
                System.out.println("Goodbye!");
            } else if (sum >= 1 && sum <= array.length) {
                System.out.println("Selected source currency: " + array[sum - 1]);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
