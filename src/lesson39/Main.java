package lesson39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Object[] objects = new Object[5];
        objects[0] = "str";
        objects[1] = 1;
        objects[2] = new Scanner(System.in);
        objects[3] = new Exception();
        objects[4] = null;
    }
}
