package lesson09.classwork02503;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number = scanner.nextInt();
        int sum = 0;

        while (number != 0) {
            sum += number;
            number = scanner.nextInt();

        }

        System.out.println(sum);
    }
}
