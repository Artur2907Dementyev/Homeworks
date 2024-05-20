package lesson29.classwork1705.example;

public class Box<T> {
    private T contents = null;

    public void put(T o) {
        contents = o;
    }

    public T take() {
        T temp = contents;
        contents = null;
        return temp;
    }

    @Override
    public String toString() {
        return "In a box: " + contents;
    }
}
