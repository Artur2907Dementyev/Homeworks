package lesson10;

import java.util.Scanner;

public class hwMain01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;

        while (true) {
            System.out.print("Please enter a natural number form 1 to 100: " + "\n");
            i = scanner.nextInt();
            if (i > 100) {
                System.out.println("You over the max number");
            } else if (i > 0) {break;
            }
            else {
                System.out.println("Please enter a positive natural number.");
            }
            System.out.println("Invalid Input. Please enter an integer." + "\n" );
            scanner.nextLine();
        }
        System.out.println("The entered natural number is: " + i);






    }
}
