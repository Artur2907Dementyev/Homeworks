package lesson13.classwork0804;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weightKg = getWeight(scanner);
        double heightCm = getHeight(scanner);

        double heightMeters = heightCm / 100.0;
        double bmi = calculateBMI(weightKg, heightMeters);

        displayResults(weightKg, heightMeters, bmi);
        displayWeightStatus(bmi);

        scanner.close();
    }
    public static double getWeight(Scanner scanner) {
        System.out.print("Enter your weight (in kilograms): ");
        return scanner.nextDouble();
    }
    public static double getHeight(Scanner scanner) {
        System.out.print("Enter your height (in centimeters): ");
        return scanner.nextDouble();
    }
    public static double calculateBMI(double weightKg, double heightMeters) {
        return weightKg / (heightMeters * heightMeters);
    }
    public static void displayResults(double weightKg, double heightMeters, double bmi) {
        System.out.println("\nBMI Calculation Results:");
        System.out.println("Weight: " + weightKg + " kilograms");
        System.out.println("Height: " + heightMeters + " meters");
        System.out.println("BMI: " + bmi);
    }

    public static void displayWeightStatus(double bmi) {
        if (bmi < 15) {
            System.out.println("Weight Status: Anorexia");
        } else if (bmi < 20) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi < 25) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi < 30) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }
    }
}
