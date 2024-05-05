package lesson23.classwork0305.HW;

public class Main {
    public static void main(String[] args) {
        Seller seller = new Seller();
        Buyer buyer = new Buyer("Alice", 100);

        double price = seller.announcePrice("Apple", 5);
        System.out.println("Price of 5 apples: €" + price);

        if (buyer.giveMoneyForPurchase(price)) {
            System.out.println(buyer.getName() + " successfully paid for the purchase.");
            seller.sellProduct("Apple", 5);
        } else {
            System.out.println(buyer.getName() + " does not have enough money.");
        }
    }
}
