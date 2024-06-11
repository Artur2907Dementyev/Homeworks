package lesson35.classwork0606;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {

        List<Integer> marks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int value = scanner.nextInt();

            if (value == -1) {
                break;
            }

            marks.add(value);
        }

        int min = marks.get(0);

        for (int i = 0; i < marks.size(); i++) {
            int element = marks.get(i);
            if (element < min) {
                min = element;
            }
        }

        System.out.println(min);

    }
}
