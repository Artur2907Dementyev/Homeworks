package lesson21.classwork2604.example01;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Artur Dementyev",
                "DE0000032359991249", AccountType.CREDIT);

        account.deposit(500);
        System.out.println("Deposited 500, amount: " + account.getAmount());

        account.withdraw(400);
        System.out.println("Withdrawn 400, amount: " + account.getAmount());
        System.out.println("In debt: " + account.hasDebt());

        account.withdraw(200);
        System.out.println("Withdrawn 200, amount: " + account.getAmount());
        System.out.println("In debt: " + account.hasDebt());


    }
}
