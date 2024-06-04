package lesson32.classwork2805.HW32;

public class MainHw01 {
    public static void main(String[] args) {

        String artur = "Today I'm going out in the beautiful weather";
        String[] array = artur.split(" ");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


        StringBuilder abbreviation = new StringBuilder();

        for (String word : array) {
            if (!word.isEmpty()) {
                abbreviation.append(word.charAt(0));
            }
        }

        System.out.println("Concatenated first letters: " + abbreviation.toString());

        String string = artur;

        int size = string.length();
        String first = string.substring(0, 1);
        String last = string.substring(size - 1, size);

        System.out.println(first);
        System.out.println(last);

        String result = first + last;
        System.out.println(result);

    }
}
