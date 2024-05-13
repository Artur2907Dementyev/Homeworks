package lesson23.classwork0305.HW;

public class Buyer extends Person{
    private double money;

    public Buyer(String name, double money) {
        super(name);
        this.money = money;
    }

    public boolean startShopping(Seller seller, String productName, int quantity) {
        double price = seller.announcePrice(productName, quantity);
        if (price != -1 && giveMoneyForPurchase(price)) {
            seller.sellProduct(productName, quantity);
            return true;
        }
        return false;
    }

    private boolean giveMoneyForPurchase(double amount) {
        if (money >= amount) {
            money -= amount;
            return true;
        }
        return false;
    }
}
