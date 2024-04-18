package lesson05.classwork01503;

import java.util.Scanner;

public class HwMain02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        float age = scanner.nextInt();

        if (age < 13) {
            System.out.println("your are a Child");
        } else if (age < 18) {
            System.out.println("your are a Teenager");
        } else if (age < 40)
            System.out.println("your are a Adult");

        else System.out.println("your are a Senior");

    }
}
