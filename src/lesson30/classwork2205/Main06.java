package lesson30.classwork2205;

import java.util.ArrayList;
import java.util.List;

public class Main06 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(
                List.of(45, 6854, 561, 456, 654));

        for (int  i : list) {
            if (i > 1000) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
}
