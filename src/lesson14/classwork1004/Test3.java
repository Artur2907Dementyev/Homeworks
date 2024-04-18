package lesson14.classwork1004;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Welcome to CurrencyConverter!");
        while (true) {
            displayCurrencyOptions();
            int initialCurrency = getUserChoice("Choose a value: ");
            if (initialCurrency == 0) {
                System.out.println("Exiting the program. Goodbye!");
                return;
            }
            double amount = getUserAmount("Enter the amount: ");
            int targetCurrency = getUserChoice("Choose another value (from the list above): ");
            double convertedAmount = convertCurrency(amount, initialCurrency, targetCurrency);
            displayConvertedAmount(convertedAmount, targetCurrency);
        }
    }
    public static void displayCurrencyOptions() {
        String[] currencies = {"EURO", "USD", "TL"};
        System.out.println("Available currencies:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
        System.out.println("0. Exit");
    }
    public static int getUserChoice(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }
    public static double getUserAmount(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }
    public static double convertCurrency(double amount, int initialCurrency, int targetCurrency) {
        double[] coefficients = {1, 1.06, 34.42};
        amount /= coefficients[initialCurrency - 1];
        return amount * coefficients[targetCurrency - 1];
    }
    public static void displayConvertedAmount(double amount, int targetCurrency) {
        String[] currencies = {"EURO", "USD", "TL"};
        System.out.println("Total: " + amount + " " + currencies[targetCurrency - 1]);
    }
}
