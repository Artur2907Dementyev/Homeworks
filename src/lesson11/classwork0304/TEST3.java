package lesson11.classwork0304;

import java.util.Scanner;

public class TEST3 {
    public static void main(String[] args) {
        // Wechselkurse relativ zu Euro
        double[] exchangeRates = {1.0, 1.10, 34,62}; // EUR, USD, TL
        String[] currencies = {"EUR", "USD", "TL"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wählen Sie die Ausgangswährung aus:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i+1) + ". " + currencies[i]);
        }

        int choice = scanner.nextInt();

        if (choice < 1 || choice > currencies.length) {
            System.out.println("Ungültige Auswahl.");
            return;
        }

        System.out.println("Geben Sie den Geldbetrag ein:");
        double amount = scanner.nextDouble();

        System.out.println("Wählen Sie die Zielwährung aus:");
        for (int i = 0; i < currencies.length; i++) {
            System.out.println((i+1) + ". " + currencies[i]);
        }

        int targetChoice = scanner.nextInt();

        if (targetChoice < 1 || targetChoice > currencies.length) {
            System.out.println("Ungültige Auswahl.");
            return;
        }

        // Umrechnung
        double convertedAmount = amount * exchangeRates[targetChoice - 1] / exchangeRates[choice - 1];

        System.out.printf("%.2f %s entspricht %.2f %s%n", amount, currencies[choice - 1], convertedAmount, currencies[targetChoice - 1]);
    }
}
