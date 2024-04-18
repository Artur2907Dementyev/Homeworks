package lesson05.classwork01503;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int minNumber = scanner.nextInt();
        int maxNumber = scanner.nextInt();

        boolean inRange = number >= minNumber && number <=- maxNumber;
        System.out.println(inRange);



    }
}
