package lesson24.classwork0605.example01;

public class Main {
    public static void main(String[] args) {
        Product product = new Product(123, "Tomato", 3.50);
        Product product2 = new Product(123, "Tomato", 3.50);
        System.out.println(product);

        System.out.println(product.hashCode());
        System.out.println(product2.hashCode());
        System.out.println(product.equals(product2));

    }
}
