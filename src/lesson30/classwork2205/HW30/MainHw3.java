package lesson30.classwork2205.HW30;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainHw3 {
    public static void main(String[] args) {
        List<Integer> weights = new ArrayList<>();
        Random random = new Random();
        int numWeights = random.nextInt(16) + 5;

        for (int i = 0; i < numWeights; i++) {
            int weight = random.nextInt(7) * 4 + 12;
            weights.add(weight);
        }

        System.out.println("Список гирь:");
        for (int weight : weights) {
            System.out.print(weight + " ");
        }
        System.out.println();

        weights.sort(null);

        System.out.println("Отсортированный список гирь:");
        for (int weight : weights) {
            System.out.print(weight + " ");
        }
    }
}
