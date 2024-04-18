package lesson08.practica;

public class Task03 {
    public static void main(String[] args) {
        String originalText = "Test text (c) Test text (@)";

        String changedText = "";

        for (int i = 0; i < originalText.length(); i++) {
            char currentChar = originalText.charAt(i);
            if ((currentChar == '(') || (currentChar == ')') || (currentChar == '&'));
            currentChar = ' ';

        }
        //changedText = changedText + currentCahr;

        System.out.println();
        System.out.println(changedText);

    }
}
