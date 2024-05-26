package lesson30.classwork2205.HW30;

import java.util.ArrayList;
import java.util.Scanner;

public class MainHw1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size: ");
        int n = scanner.nextInt();

        System.out.print("Enter " + n + " integers separated by spaces: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        ArrayList<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            result.add(num * 2);
            result.add(num * 2);
        }

        System.out.print("Results: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
