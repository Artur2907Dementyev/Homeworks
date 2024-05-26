package lesson30.classwork2205.HW30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainHw2 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100) + 1;
            numbers.add(randomNumber);
        }

        System.out.println("Исходный список:");
        printList(numbers);

        Collections.reverse(numbers);

        System.out.println("Развернутый список:");
        printList(numbers);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
