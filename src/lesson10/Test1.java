package lesson10;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie die erste Zahl ein: ");
        double num1 = scanner.nextDouble();

        System.out.print("Geben Sie die zweite Zahl ein: ");
        double num2 = scanner.nextDouble();

        double ergebnis = num1 * num2;
        System.out.println("Das Ergebnis der Multiplikation von " + num1 + " und " + num2 + " ist " + ergebnis);
    }
}
