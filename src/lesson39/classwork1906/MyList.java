package lesson39.classwork1906;

import java.util.List;

public class MyList {
    public void printMyList(List<?> list) {
        for (Object object : list) {
            System.out.println(object);
        }
    }
}