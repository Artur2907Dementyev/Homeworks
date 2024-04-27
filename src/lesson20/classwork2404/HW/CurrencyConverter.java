package lesson20.classwork2404.HW;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to CurrencyConverter!");

        while (true) {
            System.out.println("Choose a value:");
            for (MoneyValue moneyValue : MoneyValue.values()) {
                System.out.println(moneyValue.ordinal() + 1 + ". " + moneyValue.name());
            }
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            int initialCurrency = scanner.nextInt();
            if (initialCurrency == 0) {
                break;
            }

            System.out.println("Choose an amount:");
            double amount = scanner.nextDouble();

            System.out.println("Choose another value (from the list above):");
            int targetCurrency = scanner.nextInt();

            double convertedAmount = convertCurrency(
                    MoneyValue.values()[initialCurrency - 1],
                    amount,
                    MoneyValue.values()[targetCurrency - 1]
            );

            System.out.printf("Total: %.2f %s%n", convertedAmount, MoneyValue.values()[targetCurrency - 1].name());
        }
    }

    static double convertCurrency(MoneyValue initialCurrency, double amount, MoneyValue targetCurrency) {
        double initialFactor = initialCurrency.getConversionFactor();
        double targetFactor = targetCurrency.getConversionFactor();

        return (amount / initialFactor) * targetFactor;
    }
}
