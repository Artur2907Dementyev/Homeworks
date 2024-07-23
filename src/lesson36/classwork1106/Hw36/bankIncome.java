package lesson36.classwork1106.Hw36;

import java.util.Scanner;

public class bankIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalData = scanner.nextInt();

        double totalEarnings = 0.0;

        for (int i = 0; i < totalData; i++) {
            double depositAmount = scanner.nextDouble();
            double interestRate = scanner.nextDouble();
            int years = scanner.nextInt();

            double earnings = depositAmount * (Math.pow(1 + interestRate / 100, years) - 1);
            totalEarnings += earnings;

            System.out.println("Profit on deposit " + (i + 1) + ": " + earnings);
        }

        double averageEarnings = totalEarnings / totalData;
        System.out.println("Average profit: " + averageEarnings);

        scanner.close();
    }
}