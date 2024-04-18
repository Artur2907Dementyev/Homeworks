package lesson08.whileLoop;

import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int summa = 0;
        boolean condition = true;

        System.out.println("Please enter integer number ( negative number for ex");

        while (condition) {
            int userNumber = sc.nextInt();
            if (userNumber > 0) {
                summa = summa + userNumber;
            } else {
                condition = false;
            }

        }

        System.out.println("summa all is compledet = " + summa);
    }
}
