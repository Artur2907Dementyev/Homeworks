package lesson13.classwork0804;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Step 1: Ask the user for weight in kilograms and height in centimeters
    System.out.print("Enter your weight (in kilograms): ");
    double weightKg = scanner.nextDouble();

    System.out.print("Enter your height (in centimeters): ");
    double heightCm = scanner.nextDouble();

    // Step 2: Convert height to meters
    double heightMeters = heightCm / 100.0;

    // Step 3: Calculate BMI using the formula: weight / (height^2)
    double bmi = weightKg / (heightMeters * heightMeters);

    // Step 4: Output the calculation results and weight estimate
    System.out.println("\nBMI Calculation Results:");
    System.out.println("Weight: " + weightKg + " kilogrammes");
    System.out.println("Height: " + heightMeters + " meters"); // Height without formatting
    System.out.println("BMI: " + bmi );

    // Weight status assessment
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

    scanner.close();
    }
}
