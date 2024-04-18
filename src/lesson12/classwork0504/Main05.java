package lesson12.classwork0504;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        long start = System.nanoTime();
        boolean isPrime = true;
        for (int i = 2; i < number / 3; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        long finish = System.nanoTime();
        System.out.println("Time took " + (finish - start) + "ns");
        if (isPrime) {
            System.out.println("Number is prime");

        }
    }


}
