package lesson43;

public class NumberChecker {
    public void checkNumbers(int num1, int num2) throws CheckedCustomException {
        if (num2 > num1) {
            throw new CheckedCustomException("Второе число больше первого!");
        }
        System.out.println("Все в порядке, второе число не больше первого.");
    }

    public class CheckedCustomException extends Exception {
        public CheckedCustomException(String message) {
            super(message);
        }
    }
}
