package lesson06.classwork1803;

import java.util.Scanner;

public class Main06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextInt();

        if ((int)num == num) {
            System.out.println("Whole");
        } else {
            System.out.println("Fractional");
        }
    }
}
