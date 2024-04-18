package lesson04.classwork1303;

import java.util.Scanner;

public class testmain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a + b - c ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int res = a + b - c;
        System.out.println("a + b - c = " + res);
    }
}
