package lesson10;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        int[] originalArray = new int[10];
        Random random = new Random();
        for (int i = 0; i < originalArray.length; i++) {
            originalArray[i] = random.nextInt(100) + 1;
        }

        // Drucke das ursprüngliche Array
        System.out.println("Ursprüngliches Array:");
        printArray(originalArray);


        // Erweitere das Array in umgekehrter Reihenfolge
        reverseArray(originalArray);

        // Drucke das umgekehrte Array
        System.out.println("\nUmgekehrtes Array:");
        printArray(originalArray);
    }

    // Methode zum Drucken eines Arrays
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Methode zum Umkehren eines Arrays ohne ein zweites Array zu erstellen
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // Tausche die Werte an den beiden Enden
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
