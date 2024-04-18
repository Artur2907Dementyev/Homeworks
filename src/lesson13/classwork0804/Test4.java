package lesson13.classwork0804;

import java.util.Scanner;

public class Test4 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean temperature = true;

    while (temperature) {
        System.out.println("Choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit (C -> F)");
        System.out.println("2. Convert Fahrenheit to Celsius (F -> C)");
        System.out.println("3. Exit");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = toFahrenheit(celsius);
            System.out.println(celsius + "°C is approximately " + fahrenheit + "°F");
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fTemp = scanner.nextDouble();
            double cTemp = toCelsius(fTemp);
            System.out.println(fTemp + "°F is approximately " + cTemp + "°C");
        } else if (choice == 3) {
            temperature = false;
        } else {
            System.out.println("Invalid choice. Please select 1, 2, or 3.");
        }
    }
    System.out.println("Thank you for using the temperature converter!");
}

    private static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
