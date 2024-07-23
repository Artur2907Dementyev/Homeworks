package lesson43;

public class SumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        if (sum > 10000) {
            throw new UncheckedCustomException("Сумма превышает 10,000!");
        }
        System.out.println("Сумма: " + sum);
    }

    public class UncheckedCustomException extends RuntimeException {
        public UncheckedCustomException(String message) {
            super(message);
        }
    }
}

