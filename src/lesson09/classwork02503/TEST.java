package lesson09.classwork02503;

import java.util.Scanner;

public class TEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial value: ");
        double number = scanner.nextDouble();

        System.out.print("Enter the step: ");
        double step = scanner.nextDouble();

        System.out.print("Enter the number of elements: ");
        int sum = scanner.nextInt();

        double[] sequence = new double[sum];

        for (int i = 0; i < sum; i++) {
            sequence[i] = number + i * step;
        }

        double sequence_sum = 0;
        for (double element : sequence) {
            sequence_sum += element;
        }

        System.out.print("\nNumber sequence: "  );
        for (double element : sequence) {
            System.out.print(element + " ");
        }
        System.out.println("\nSum of the elements: " + sequence_sum);

    }
}
