package lesson38;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();

        while (true) {
            String string = scanner.nextLine();

            if (string.equals("exit")) {
                break;
            }

            String[] array = string.split(" ");

            String name = array[0];
            int temperature = Integer.parseInt(array[1]);
            map.put(name, temperature);
        }

        int max = Integer.MAX_VALUE;
        String nameOFMaxValue = null;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println(map);
    }
}
