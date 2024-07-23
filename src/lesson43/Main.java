package lesson43;

public class Main {
    public static void main(String[] args) {
        SumCalculator sumCalculator = new SumCalculator();
        NumberChecker numberChecker = new NumberChecker();

        try {
            sumCalculator.calculateSum(150); // Пример вызова метода
        } catch (SumCalculator.UncheckedCustomException e) {
            System.out.println(e.getMessage());
        }

        try {
            numberChecker.checkNumbers(5, 10); // Пример вызова метода
        } catch (NumberChecker.CheckedCustomException e) {
            System.out.println(e.getMessage());
        }
    }
}
