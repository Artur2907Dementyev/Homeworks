package lesson31.classwork2405;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main03 {

        static List <LinkedList<Object>> hashTable = List.of(
                new LinkedList<>(),
                new LinkedList<>(),
                new LinkedList<>(),
                new LinkedList<>()
        );
        public static void main(String[] args) {

        String s1 = "hello";
        System.out.println(s1.hashCode() % 4);
        String s2 = "java";
        System.out.println(s2.hashCode() % 4);
    }
}
