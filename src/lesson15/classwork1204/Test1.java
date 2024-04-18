package lesson15.classwork1204;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Welcome to CurrencyConverter!");

        while (true) {
            System.out.println("Choose an option:");
            String[] currencies = {"EURO", "USD", "TL"};

            for (int i = 0; i < currencies.length; i++) {
                System.out.println((i + 1) + ". " + currencies[i]);
            }
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            int initialCurrency = readUserChoice(scanner, currencies.length);
            if (initialCurrency == 0) {
                System.out.println("Goodbye!");
                break;
            }

            double amount = readAmount(scanner);
            int targetCurrency = readUserChoice(scanner, currencies.length);

            double convertedAmount = convertCurrency(amount, initialCurrency, targetCurrency);
            System.out.println("Total: " + convertedAmount + " " + currencies[targetCurrency - 1]);
        }
    }

    public static int readUserChoice(Scanner scanner, int maxChoice) {
        int choice;
        do {
            System.out.print("Enter your choice (1 to 3): ");
            choice = scanner.nextInt();
        } while (choice < 0 || choice > maxChoice);
        return choice;
    }

    public static double readAmount(Scanner scanner) {
        double amount;
        do {
            System.out.print("Enter the amount: ");
            amount = scanner.nextDouble();
        } while (amount < 0);
        return amount;
    }

    public static double convertCurrency(double amount, int initialCurrency, int targetCurrency) {
        double[] coefficients = {1, 1.06, 34.42};
        double convertedAmount = amount / coefficients[initialCurrency - 1];
        convertedAmount *= coefficients[targetCurrency - 1];
        return convertedAmount;
    }
}
