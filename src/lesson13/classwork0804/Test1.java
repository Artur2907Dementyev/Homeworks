package lesson13.classwork0804;

import java.util.Scanner;

public class Test1 {

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
                    convertAndPrint("Celsius", "Fahrenheit", scanner);
                    break;
                case 2:
                    convertAndPrint("Fahrenheit", "Celsius", scanner);
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

    private static void convertAndPrint(String fromUnit, String toUnit, Scanner scanner) {
        System.out.print("Enter temperature in " + fromUnit + ": ");
        double inputTemp = scanner.nextDouble();
        double convertedTemp = (fromUnit.equals("Celsius")) ? toFahrenheit(inputTemp) : toCelsius(inputTemp);
        System.out.print(inputTemp + " " + fromUnit + " is " + convertedTemp + " " + toUnit);
    }

    private static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
