package lesson32.classwork2805.SolvedHw33;

import java.util.Scanner;

public class SolvedHw01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split(" ");

        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            result += word.substring(0, 1);
        }

        System.out.println(result);
        System.out.println(result.length());
        System.out.println(result.charAt(0));
        System.out.println(result.charAt(result.length()));
    }
}
