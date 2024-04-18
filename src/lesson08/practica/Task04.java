package lesson08.practica;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int summa = 0;
        int count = 0;
        boolean condition = true;

        System.out.println("Please enter integer number ( negative number for exit");

        while (condition) {
            int userNumber = sc.nextInt();
            if (userNumber > 0) {
                summa = summa + userNumber;
                count++;
            } else {
                condition = false;
            }

        }

        System.out.println("summa all is completed = " + summa +" middle " + summa/count);
    }
}
