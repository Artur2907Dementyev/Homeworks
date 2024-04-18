package lesson05.classwork01503;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();

        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number == 0 ) {
            System.out.println("number is zero");
        } else {
            System.out.println("Number is negative");
        }
    }
}
