package lesson23.classwork0305.HW;

public class Seller extends Person {
    private Product[] warehouse;

    public Seller(String name) {
        super(name);
        // Initialize the warehouse with sample products
        warehouse = new Product[10];
        // Fill the warehouse with actual products (you can set sample values here)
    }

    public double announcePrice(String productName, int quantity) {
        // Implement linear search to find the product and return its price
        // Return -1 if not found
        // ...
        return 0;
    }

    public void sellProduct(String productName, int quantity) {
        // Remove the product from the warehouse
        // ...
    }
}
