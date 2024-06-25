package lesson39.classwork1906;

public class Printer <T extends Number> {
    public void print(T value) {
        System.out.println(value.doubleValue());
    }
}
