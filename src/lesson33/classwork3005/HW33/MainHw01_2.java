package lesson33.classwork3005.HW33;

import java.util.Arrays;
import java.util.Scanner;

public class MainHw01_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        System.out.println("Enter the 11th number to search:");
        int target = scanner.nextInt();

        int index = Arrays.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println("Number index " + target + " in the array: " + index);
        } else {
            System.out.println("Number " + target + " not found in array.");
        }
    }
}
