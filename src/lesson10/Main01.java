package lesson10;

import java.util.Random;

public class Main01 {
    public static void main(String[] args) {
        Random random = new Random(1);
        int number = random.nextInt(100);
        System.out.println(number);
    }
}
