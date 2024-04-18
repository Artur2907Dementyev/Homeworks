package lesson13.classwork0804;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueConversion = true;

        while (continueConversion) {
            System.out.println("Choose an option:");
            System.out.println("1. Convert Celsius to Fahrenheit (C -> F)");
            System.out.println("2. Convert Fahrenheit to Celsius (F -> C)");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter temperature in Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = toFahrenheit(celsius);
                    System.out.printf("%.2f°C is %.2f°F%n", celsius, fahrenheit);
                    break;
                case 2:
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fTemp = scanner.nextDouble();
                    double cTemp = toCelsius(fTemp);
                    System.out.printf("%.2f°F is %.2f°C%n", fTemp, cTemp);
                    break;
                case 3:
                    continueConversion = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }

        System.out.println("Thank you for using the temperature converter!");
    }

    // Convert Fahrenheit to Celsius
    private static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Convert Celsius to Fahrenheit
    private static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
