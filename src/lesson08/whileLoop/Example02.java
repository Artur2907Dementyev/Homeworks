package lesson08.whileLoop;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {

        int x;
        int y;
        int result;

        Scanner scanner = new Scanner(System.in);

        boolean condition = true;

        while (condition) {
            System.out.println("Enter two integer number ");

        System.out.println("Enter x:");
        x = scanner.nextInt();
        System.out.println("Enter y:");
        y = scanner.nextInt();

        result = x + y;

        System.out.println("Result of sum = "+ result);

        if (result > 100) {
            condition = false;

        }


            System.out.println("is working");}

    }
}
