package lesson31.classwork2405.HW31;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainHw1 {

    public static void main(String[] args) {
        Map<String, Double> productPrices = new HashMap<>();
        productPrices.put("Apple", 2.0);
        productPrices.put("Potato", 1.5);
        productPrices.put("Tomato", 3.0);
        productPrices.put("Cucumber", 2.5);
        productPrices.put("Cabbage", 1.0);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a product name: ");
        String product = scanner.nextLine();

        Double price = productPrices.get(product);
        if (price != null) {
            System.out.println("Price is: " + price);
        } else {
            System.out.println("Product " + product + " not found");
        }
    }
}
