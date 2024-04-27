package lesson21.classwork2604.example02;

import java.util.SplittableRandom;

public class MyArrayList {
    private String[] array;
    private  int size;

    public MyArrayList(int initialSize) {
        size = initialSize;
        array = new String[size];
    }

    public MyArrayList() {
        this(0);
    }

    public int getSize() {
        return size;
    }

    public String get(int index) {
        return array[index];
    }

    public void set(int index, String val) {
        array[index] = val;
    }

    public int indexOf(String value) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }
    public boolean contains(String value) {
        return indexOf(value) != -1;
    }

    public void resize(int newSize) {
        String[] temp = new String[size + 1];

        int minSize = Math.min(size, newSize);

        for (int i = 0; i < minSize; i++) {
            temp[i] = array[i];
        }

        array = temp;
        size = newSize;
    }

    public void add(String value) {
        if (size + 1 > array.length) {
            resize(size +1);
            array[size -1] = value;
        } else {
            array[size] = value;
            size++;
        }

    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }


}
