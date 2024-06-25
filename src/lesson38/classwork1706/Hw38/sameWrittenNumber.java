package lesson38.classwork1706.Hw38;

import java.util.HashMap;
import java.util.Scanner;

public class sameWrittenNumber {
    public static void main(String[] args) {
        HashMap<String, Integer> searchHistory = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your search query: ");
            String query = scanner.nextLine();
            if (searchHistory.containsKey(query)) {
                int count = searchHistory.get(query);
                searchHistory.put(query, ++count);
            } else {
                searchHistory.put(query, 1);
            }
            if (searchHistory.get(query) > 100) {
                continue;
            }
            System.out.println("Number of search attempts: " + searchHistory.get(query));
        }
    }
}
