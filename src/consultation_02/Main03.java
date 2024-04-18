package consultation_02;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mathMark = scanner.nextInt();
        int programmingMark = scanner.nextInt();
        int physicsMark = scanner.nextInt();

        double avg = (mathMark + programmingMark + physicsMark) / 3.0;


        System.out.println(avg);

    }
}
