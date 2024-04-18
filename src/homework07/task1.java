package homework07;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        int weight = scanner.nextInt();
        System.out.println("Enter your height in cm");
        float height = scanner.nextInt() / 100f;

        float bmi = height / (weight * height);
        System.out.println("Your Bmi: " + bmi);

        if (bmi <= 15) {
            System.out.println("anorexia");
        } else if (bmi <= 20) {
            System.out.println("Underweight");
        } else if (bmi <=25) {
            System.out.println("Normal Weight");
        } else if (bmi <=30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }

    }
}
