package lesson13.classwork0804;

import java.util.Scanner;

public class HwMain3 {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter your weight (in kilograms): ");
    double weightKg = scanner.nextDouble();

    System.out.print("Enter your height (in centimeters): ");
    double heightCm = scanner.nextDouble();

    double heightMeters = heightCm / 100.0;

    double bmi = weightKg / (heightMeters * heightMeters);

    System.out.println("\nBMI Calculation Results:");
    System.out.println("Weight: " + weightKg + " kilogrammes");
    System.out.println("Height: " + heightMeters + " meters");
    System.out.println("BMI: " + bmi );

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
