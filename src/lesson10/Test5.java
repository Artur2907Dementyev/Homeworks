package lesson10;


import java.util.Random;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] answers = {
                "Yes",
                "No",
                "Very likely",
                "Do not count on it",
                "Не могу предсказать",
                "Yes, but be careful",
                "Apparently",
                "The signs point to yes",
                "Signs point to no",
                "Better go out and touch grass"
        };

        System.out.println("Ask the magic 8 ball something or Enter: ");

        while (true) {
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals(" ")) {
                break;
            }

            int randomIndex = random.nextInt(answers.length);
            String response = answers[randomIndex];
            System.out.println("Magic8ball: " + response);
        }
    }
}
