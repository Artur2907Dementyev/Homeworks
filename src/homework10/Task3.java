package homework10;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] answers = {
                "Yes",
                "No",
                "Very likely",
                "Do not count on it",
                "I can't predict",
                "Yes, but be careful",
                "Apparently",
                "The signs point to yes",
                "Signs point to no",
                "Better go out and touch grass"
        };
        String question = scanner.nextLine();
        Random random = new Random(question.hashCode());

        int index = random.nextInt(answers.length);
        String answer = answers[index];

        System.out.println(answer);


    }
}
