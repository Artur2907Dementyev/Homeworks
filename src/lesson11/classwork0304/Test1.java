package lesson11.classwork0304;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        double[] moneyValue = {1.0, 1.10, 34,62};
        String[] array = {"EUR", "USD", "TL"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wählen Sie die Ausgangswährung aus:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }
        int choice = scanner.nextInt();

        if (choice < 1 || choice > array.length) {
            System.out.println("Ungültige Auswahl.");
            return;
        }
        System.out.println("Geben Sie den Geldbetrag ein:");
        double amount = scanner.nextDouble();

        System.out.println("Wählen Sie die Zielwährung aus:");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1) + ". " + array[i]);
        }
        int targetChoice = scanner.nextInt();

        if (targetChoice < 1 || targetChoice > array.length) {
            System.out.println("Ungültige Auswahl.");
            return;
        }
        double changeAmount = amount * moneyValue[targetChoice - 1] / moneyValue[choice - 1];

        System.out.println(targetChoice + " = " + changeAmount);
    }
}
