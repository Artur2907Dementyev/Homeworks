package lesson30.classwork2205;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(45, 6, 21, -5, 16));
        System.out.println(list);
        int oldValue = list.set(1, 10);
        System.out.println(list);
        System.out.println("Old value at index 1: " + oldValue);
        list.remove(0);
        System.out.println(list);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        });
        System.out.println(list);
        list.subList(1, 3).clear();
        System.out.println(list);

    }
}
