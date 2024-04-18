package lesson15.classwork1204;

import java.util.Random;

public class Main02 {

    public static int sum(int[] array) {
        return sum(array, 0, array.length);
    }

    public static int sum(int[] array, int form, int to) {
        int sum = 0;
        for (int i = form; i < to; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
