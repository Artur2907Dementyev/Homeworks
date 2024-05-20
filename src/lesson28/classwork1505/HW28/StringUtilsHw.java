package lesson28.classwork1505.HW28;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsHw {

    @BeforeAll
    public static void beforeAllMethod() {
        System.out.println("This code executes before all tests!");
    }

    @BeforeEach
    public void beforeEachMethod() {
        System.out.println("This code executes before each test!");
    }

    @Test
    public void reverseStringWorks() {

    }

    @Override
    public String toCamelCase(String text) {
        StringBuilder sb = new StringBuilder();
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].isEmpty()) {
                continue;
            }
            if (i == 0) {
                sb.append(words[i].toLowerCase());
            } else {
                sb.append(words[i].substring(0, 1).toLowerCase())
                        .append(words[i].substring(0, 1).toLowerCase());
            }
        }
        return null;
    }
}
