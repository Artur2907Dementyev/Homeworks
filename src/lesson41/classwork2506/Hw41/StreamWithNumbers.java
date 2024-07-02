package lesson41.classwork2506.Hw41;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 60);
        numbers.stream()
                .map(x -> x + 15)
                .forEach(System.out::println);

        List<Integer> filteredNumbers = numbers.stream().filter(x -> x > 50).collect(Collectors.toList());
        filteredNumbers.forEach(System.out::println);

        int sum = numbers.stream().mapToInt(x -> x).sum();
        System.out.println("The sum of the numbers is equal to " + sum);
    }
}