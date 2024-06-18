package lesson37.classwork1306;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Set<String> set = new HashSet<>();

        list.add("qwerty");
        set.add("qwerty");

        list.add("qwerty");
        set.add("qwerty");

        System.out.println(list);
        System.out.println(set);

        System.out.println(list.get(0));


        System.out.println(set.contains("qwerty"));
    }
}
