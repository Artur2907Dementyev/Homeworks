package lesson41.classwork2506.Hw41;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamWithWords {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Hello", "World", "How", "Are", "You");
        strings.stream()
                .filter(s -> s.length() <= 15)
                .forEach(System.out::println);

        Optional<String> longestString = strings.stream().max((s1, s2) -> Integer.compare(s2.length(), s1.length()));
        longestString.ifPresent(System.out::println);
    }
}
