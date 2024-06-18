package lesson37.classwork1306.Hw37;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numbers = new HashSet<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            int num = scanner.nextInt();
            numbers.add(num);
        }

        if (numbers.size() == 5) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
