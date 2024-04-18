package lesson09.classwork02503;

import java.util.Scanner;

public class HwMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        while (true) {
            System.out.print("Please enter a natural number: " + "\n");
            i = scanner.nextInt();
            if (i < 0) {
                break;
            } else {
                System.out.println("Please enter a positive natural number.");
            }
            System.out.println("Invalid Input. Please enter an integer." + "\n" );
            scanner.nextLine();
        }
        System.out.println("The entered natural number is: " + i);
    }

}
