package lesson10;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzer gibt die Größe des Arrays ein
        System.out.print("Geben Sie die Größe des Arrays ein: ");
        int size = scanner.nextInt();

        // Benutzer gibt das Array der Ganzzahlen ein
        int[] array = new int[size];
        System.out.println("Geben Sie die " + size + " Ganzzahlen ein:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Verdoppeln Sie jede Zahl und geben Sie das Ergebnis auf der Konsole aus
        System.out.println("Verdoppelte Zahlen:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] * 2 + " ");
        }
        System.out.println(); // Neue Zeile

        // Machen Sie außerdem jedes Element doppelt so groß
        System.out.println("Jedes Element doppelt so groß:");
        for (int i = 0; i < size; i++) {
            array[i] *= 2;
            System.out.print(array[i] + " ");
        }
        System.out.println(); // Neue Zeile

        scanner.close();
    }
}
