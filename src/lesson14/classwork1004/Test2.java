package lesson14.classwork1004;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("Welcome to CurrencyConverter!");
        while (true) {
            int initialCurrency = chooseCurrency("Choose an initial currency:");
            if (initialCurrency == 0) {
                return;
            }
            double amount = getAmount("Enter the amount:");
            int targetCurrency = chooseCurrency("Choose a target currency (from the list above):");

            double convertedAmount = convertCurrency(amount, initialCurrency, targetCurrency);
            String targetCurrencyName = getCurrencyName(targetCurrency);

            displayResult(convertedAmount, targetCurrencyName);
        }
    }

    private static int chooseCurrency(String prompt) {
        String[] currencies = {"EURO", "USD", "TL"};
        System.out.println(prompt);
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i + 1) + ". " + currencies[i]);
        }
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static double getAmount(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static double convertCurrency(double amount, int initialCurrency, int targetCurrency) {
        double[] coefficients = {1, 1.06, 34.42};
        double convertedAmount = amount / coefficients[initialCurrency - 1];
        convertedAmount *= coefficients[targetCurrency - 1];
        return convertedAmount;
    }

    private static String getCurrencyName(int currencyIndex) {
        String[] currencies = {"EURO", "USD", "TL"};
        return currencies[currencyIndex - 1];
    }

    private static void displayResult(double convertedAmount, String targetCurrencyName) {
        System.out.println("Total: " + convertedAmount + " " + targetCurrencyName + "\n");
    }
}