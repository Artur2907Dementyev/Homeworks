package lesson05.classwork01503;

import java.util.Scanner;

public class TEST_Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int income = scanner.nextInt();

        if (income > 20000) {
        int percentTax22 = (int) (income * 0.22f);
        System.out.println("your percents Tax is 22% = " + percentTax22);}

        else if (income > 10000) {
        int percentTax18 = (int) (income * 0.18f);
        System.out.println("your percents Tax is 18% = " + percentTax18);}

        else if (income < 10000){
            int percentTax13 = (int) (income * 0.13);
            System.out.println("your percents Tax is 13% = " + percentTax13);
        }



    }
}
