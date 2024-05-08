package lesson23.classwork0305.HW;

public class Seller {
    private final Product[] warehouse;

    public Seller() {
        warehouse = new Product[10];
        warehouse[0] = new Product("Apple", 20, 1.99);

    }

    public double announcePrice(String productName, int quantity) {
        for (Product product : warehouse) {
            if (product != null && product.getName().equals(productName) && product.getQuantity() >= quantity) {
                return product.getPrice();
            }
        }
        return -1;
    }

    public void sellProduct(String productName, int quantity) {
        for (Product product : warehouse) {
            if (product != null && product.getName().equals(productName) && product.getQuantity() >= quantity) {
                product.setQuantity(product.getQuantity() - quantity);
                System.out.println("Sold " + quantity + " " + productName + "(s).");
                return;
            }
        }
        System.out.println(productName + " not available in sufficient quantity.");
    }
}
