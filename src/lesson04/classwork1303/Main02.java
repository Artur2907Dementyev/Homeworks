package lesson04.classwork1303;

public class Main02 {
    public static void main(String[] args) {
        String helloStr = "Hello world!";

        System.out.println(helloStr);
        System.out.println(helloStr.length());

        char firstLetter = helloStr.charAt(0);
        System.out.println(firstLetter);

        int wIndex = helloStr.indexOf('w');
        System.out.println(wIndex);

        String word = helloStr.substring(0, 5);
        System.out.println(word);

        System.out.println(word.equalsIgnoreCase("hello"));

    }
}
