package homework5;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age < 0) {
            System.out.println("You entered incorrect value");
        } else if (age < 13) {
            System.out.println("You are a kid");
        } else if (age < 18) {
            System.out.println("You are a teenager");
        } else if (age < 65) {
            System.out.println("You are a adult");
        } else {
            System.out.println("You are a elderly person");
        }


    }
}
