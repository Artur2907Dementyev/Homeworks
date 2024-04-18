package lesson08.fodLoop;

public class Example02 {
    public static void main(String[] args) {

        String text = "I love Java";

        int textSize = text.length();

        for (int i = 0; i < textSize; i++) {
            System.out.println(text.charAt(i));
        }
    }
}
