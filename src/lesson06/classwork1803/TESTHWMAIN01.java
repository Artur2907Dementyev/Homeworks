package lesson06.classwork1803;

import java.util.Scanner;

public class TESTHWMAIN01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg");
        float weight = scanner.nextInt();
        System.out.println("Enter your height in cm");
        float height = scanner.nextInt() / 100f;

        float bodyIndex = weight / (height * height);
        System.out.println("Your BMI is: " + bodyIndex);


        if (0 < 15 + bodyIndex) {
            System.out.println("anorexia");

        } else if (15 < 20 + bodyIndex) {
            System.out.println("Underweight");

        } else if (20 < 25 + bodyIndex) {
            System.out.println("Normal Weight");

        } else if (25 < 30 + bodyIndex) {
            System.out.println("Overweight");

        } else {
            System.out.println("Obesity");}

    }
}
