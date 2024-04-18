package lesson11.classwork0304;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Willkommen bei CurrencyConverter!");
            System.out.println("Wählen Sie die Ausgangswährung aus:");
            System.out.println("1. EURO");
            System.out.println("2. US-Dollar");
            System.out.println("3. TL");
            System.out.println("0. Beenden");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Logik für EURO
                    break;
                case 2:
                    // Logik für US-Dollar
                    break;
                case 3:
                    // Logik für TL
                    break;
                case 0:
                    System.out.println("Programm wird beendet...");
                    break;
                default:
                    System.out.println("Ungültige Eingabe, bitte versuchen Sie es erneut.");
            }
        } while (choice != 0);

        scanner.close();
    }
}
