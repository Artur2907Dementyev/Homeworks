package lesson13.classwork0804;

import java.util.Random;
import java.util.Scanner;

public class Main02 {

    public static int rollDice() {
        Random random = new Random();
        int roll = 1 + random.nextInt(6);

        return roll;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            int roll = rollDice();
            System.out.println("Diece Rolled " + roll);

            input = scanner.next();

        } while (!input.equals("0"));
    }
}
