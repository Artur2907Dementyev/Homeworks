package lesson06.classwork1803;

import java.util.Scanner;

public class HwMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextInt();



        if ((int)num < 15) {
            System.out.println("you are anorexia");
        }
        else if (15 < 20) {
            System.out.println("you are Underweight");
        }
        else if (20 < 25) {
            System.out.println("you are Overweight");
        }
        else if (25 < 30) {
            System.out.println("you are Obesity");
        }

    }
}
