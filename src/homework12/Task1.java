package homework12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] products = {"Apple", "Potato", "Tomato", "Cucumber", "Cabbage"};
        double[] prices = {2, 1.5, 3, 2.5, 1};

        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();

        int productIndex = -1;
        for (int i = 0; i < products.length; i++) {
            if (product.equalsIgnoreCase(products[i])) {
                productIndex = i;
                break;
            }
        }
        if (productIndex == -1) {
            System.out.println("Product " + product + " not found");
        } else {
            System.out.println("Price is: " + prices[productIndex]);
        }
    }
}
