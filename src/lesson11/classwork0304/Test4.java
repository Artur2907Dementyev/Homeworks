package lesson11.classwork0304;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        // Define a dictionary to store currency codes and their corresponding names
        String[] currencyCodes = {"EURO", "USD", "TL"};

        // Display welcome message
        System.out.println("Welcome to CurrencyConverter!");

        // Initialize user choice
        int userChoice = -1;

        // Keep the program running until the user chooses to exit
        while (userChoice != 0) {
            // Display menu options
            System.out.println("Select source currency:");
            for (int i = 0; i < currencyCodes.length; i++) {
                System.out.println(i + 1 + ". " + currencyCodes[i]);
            }
            System.out.println("0. Exit");

            // Get user input
            Scanner scanner = new Scanner(System.in);
            userChoice = scanner.nextInt();

            // Check if user wants to exit
            if (userChoice == 0) {
                System.out.println("Goodbye!");
            } else if (userChoice >= 1 && userChoice <= currencyCodes.length) {
                System.out.println("Selected source currency: " + currencyCodes[userChoice - 1]);
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
