package consultation_06;

import java.util.Random;
import java.util.Scanner;

public class Main01 {

    public static String getRandomWord() {
        Random random = new Random();

        String[] words = {
                "apple", "java", "hello", "world", "orange",
                "code", "programming", "class", "main"
        };
        int randomIndex = random.nextInt(words.length);

        return words[randomIndex];
    }

    public static char readLetter() {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        return letter;

    }

    public static void printWord(String word, boolean[] guessed) {
        for (int i = 0; i < word.length(); i++) {
            if (guessed[i]) {
                System.out.print(word.charAt(i) + " ");
            } else {
                System.out.print("_ ");
            }
        }
    }

    public static boolean gameWon(boolean[] guessed) {
        for (int i = 0; i < guessed.length; i++) {
            if (!guessed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = getRandomWord();
        boolean[] guessed = new boolean[word.length()];

        int attemptsLeft = 7;

        while (attemptsLeft > 0) {
            printWord(word, guessed);
            System.out.println("\nAttempts left: " + attemptsLeft);
            char letter = readLetter();

            boolean letterFound = false;
            for (int i = 0; i < word.length(); i++) {
                if (letter == word.charAt(i)) {
                    letterFound = true;
                    guessed[i] = true;
                }
            }
            if (!letterFound) {
                attemptsLeft--;
            }
            if (gameWon(guessed)) {
                System.out.println("You won! Congratulations!");
            }
        }
        System.out.println("You lost! Word was: " + word);
    }
}
