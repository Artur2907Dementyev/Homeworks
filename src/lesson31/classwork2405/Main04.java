package lesson31.classwork2405;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {
        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "hallo");
        dictionary.put("integer", "ganze");
        dictionary.put("programming", "Programmieren");
        dictionary.put("map", "Karte");

        Scanner scanner = new Scanner(System.in);
        System.out.println("schreiben die wörter in englisch");
        String word = scanner.next();
        if (dictionary.containsKey(word)) {
            System.out.println("Traslotor: " + dictionary.get(word));
        } else {
            System.out.println("dieses wort in wörterbuch, gibt es nicht");
            for (String key : dictionary.keySet()) {
                System.out.println(key + ": " + dictionary.get(key));
            }
        }
    }
}
