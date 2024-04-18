package lesson09.classwork02503;

public class Test3 {
    public static void main(String[] args) {
        int[] array = new  int[10];

        for (int i = 3; i < array.length; i++) {
            array[i] = (int) Math.pow (i, 1);
        }

        for (int i = 1; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
