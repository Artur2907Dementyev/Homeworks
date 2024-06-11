package lesson35.classwork0606.temperatureRise;

import java.util.Scanner;

public class Temperature {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double sum = 0;
    int count = 0;
    double prevTemp = 0;

    while (true) {
        System.out.print("Enter temperature (or 'exit' to complete: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("exit")) {
            break;
        }

        try {
            double currentTemp = Double.parseDouble(input);
            sum += currentTemp;
            count++;

            if (count > 1) {
                double averageTemp = sum / count;
                double tempDifference = currentTemp - prevTemp;

                if (currentTemp > averageTemp * 1.1 && tempDifference > averageTemp * 0.2) {
                    System.out.println("Alarm!, temperature rise!");
                }
            }

            prevTemp = currentTemp;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a number.");
        }
    }

        if (count > 0) {
            double averageTemp = sum / count;
            System.out.println("Average temperature: " + averageTemp);
        } else {
            System.out.println("No values entered.");
        }
    }
}
