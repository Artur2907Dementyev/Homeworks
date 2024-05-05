package lesson23.classwork0305.HW;

public class Buyer extends Person{
    private double money;

    public Buyer(String name, double money) {
        super(name);
        this.money = money;
    }

    public boolean giveMoneyForPurchase(double amount) {
        if (money >= amount) {
            money -= amount;
            return true;
        } else {
            return false;
        }
    }

    public boolean getName() {
        return false;
    }
}
