package lesson10;

import java.util.Random;
import java.util.Scanner;

public class Main02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter min and max");
        int min = scanner.nextInt();
        int max = scanner.nextInt();

        Random random = new Random();
        int number = min + random.nextInt(max - min + 1);
        System.out.println(number);
    }
}
