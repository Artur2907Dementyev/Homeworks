package lesson09.classwork02503;

import java.util.Random;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println("Generated array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        int[] numberreverse = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberreverse[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("\nReversed array:");
        for (int i = 0; i < numberreverse.length; i++) {
            System.out.print(numberreverse[i] + " ");
        }
    }

    public static class TEST4 {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                int i;

                while (true) {
                    System.out.print("Please enter a natural number form 1 to 100: " + "\n");
                    i = scanner.nextInt();
                    if (i > 101) {
                        System.out.println("You over the max number");
                    } else if (i > 0) {break;
                    }
                    else {
                        System.out.println("Please enter a positive natural number.");
                    }
                    System.out.println("Invalid Input. Please enter an integer." + "\n" );
                    scanner.nextLine();
                }
                System.out.println("The entered natural number is: " + i);
        }
    }
}
