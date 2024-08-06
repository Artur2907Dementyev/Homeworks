package lesson47.Hw47;

public class OperationHistory {
    private final double firstOperand;
    private final double secondOperand;
    private final String operator;
    private final double result;

    public OperationHistory(double firstOperand, double secondOperand, String operator, double result) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.operator = operator;
        this.result = result;
    }

    @Override
    public String toString() {
        return String.format("Operation: %f %s %f = %f", firstOperand, operator, secondOperand, result);
    }
}
