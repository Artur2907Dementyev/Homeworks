package lesson14.classwork1004;

import java.util.Random;

public class Main02 {

    public static void printArray(int [] arr) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }


    public static  int[] generateRandomArray(int min, int max, int size) {
        Random random = new Random();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = min + random.nextInt(max - min + 1);
        }
        return array;
    }

    public static void reverseArray(int[] array) {
        int[] reversedArray = new int[array.length];
        for (int i = 0; i < reversedArray.length; i++) {
            reversedArray[i] = array[reversedArray.length - i - 1];
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = reversedArray[i];
        }
    }

    public static void main(String[] args) {
        int[] array = generateRandomArray(1, 100, 10);

        printArray(array);

        reverseArray(array);

        printArray(array);

    }
}
