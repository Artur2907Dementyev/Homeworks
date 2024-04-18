package lesson12.classwork0504;

import java.util.Scanner;

public class main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[10];

        int amount = 0;
        for (int i = 0; i < list.length; i++) {
            String item = scanner.nextLine();
            if (item.equalsIgnoreCase("end") || item.equalsIgnoreCase("The End")) {
                break;
            }
            list[i] = item;
            amount++;
        }

        for (int i = 0; i < amount; i++) {
            System.out.println((i + 1) + ". " + list[i]);
        }
    }
}
